
import GlobalVariable.androidDriver
import GlobalVariable.iosDriver
import GlobalVariable.platformType
import general_cases_for_test.GoToMainMenu.goToMainMenu
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.ios.IOSDriver
import io.appium.java_client.remote.IOSMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.*
import java.net.URL
import java.time.Duration
import java.util.concurrent.TimeUnit

open class MainActivity {

    @BeforeSuite
    @Parameters(
        value = ["paramPlatformName", "paramPlatformVersion", "paramDeviceName", "paramUDID",
        "paramTimeToSearchElement", "paramPathToApp"]
    )
    fun installDriver(paramPlatformName: TypeOS, paramPlatformVersion: String,
                      paramDeviceName: String, paramUDID: String,
                      paramTimeToSearchElement: Long, paramPathToApp: String){

        makeCapabilities(
            paramPlatformName, paramPlatformVersion,
            paramDeviceName, paramUDID,
            paramTimeToSearchElement, paramPathToApp
        )

        goToMainMenu()
    }

    @AfterSuite
    fun quitDriver(){
        if (platformType == TypeOS.IOS) {
            iosDriver.quit()
        } else {
            androidDriver.quit()
        }
    }

    @BeforeClass
    fun beforeClass() {

    }

    @AfterClass
    fun afterClass() {

    }

    @BeforeMethod
    fun launceApp() {
        if (platformType == TypeOS.IOS) {
            iosDriver.activateApp(BUNDLE_ID)
        } else {
            androidDriver.activateApp(BUNDLE_ID)
        }
        TimeUnit.SECONDS.sleep(10)
    }

    @AfterMethod
    fun closeApp() {
        if (platformType == TypeOS.IOS) {
            iosDriver.terminateApp(BUNDLE_ID)
        } else {
            androidDriver.terminateApp(BUNDLE_ID)
        }
    }

    companion object {
        const val BUNDLE_ID = "starter.school.client"
    }

    private fun makeCapabilities (
        paramPlatformName: TypeOS, paramPlatformVersion: String,
        paramDeviceName: String, paramUDID: String,
        paramTimeToSearchElement: Long, paramPathToApp: String
    ) {
        val capabilities = DesiredCapabilities()

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, paramPlatformName)
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, paramPlatformVersion)
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, paramDeviceName)
        capabilities.setCapability(MobileCapabilityType.APP, paramPathToApp)
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true)
        if (paramPlatformName == TypeOS.ANDROID) {
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2")
            //capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "starter.school.client")
            //capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "starter.school.client.MainActivity")
        } else {
            capabilities.setCapability(IOSMobileCapabilityType.WDA_LAUNCH_TIMEOUT, 80000)
            capabilities.setCapability(IOSMobileCapabilityType.COMMAND_TIMEOUTS, 50000)
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest")
        }

        val url = URL("http://127.0.0.1:4723/")

        if (paramPlatformName == TypeOS.IOS) {
            iosDriver = IOSDriver(url, capabilities)
            iosDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4))
        } else {
            androidDriver = AndroidDriver(url, capabilities)
            androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4))
        }

        platformType = paramPlatformName
    }
}