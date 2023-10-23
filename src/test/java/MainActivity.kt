import GlobalVariable.androidDriver
import TestFunctions.clickToElement
import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterClass
import org.testng.annotations.AfterMethod
import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeClass
import org.testng.annotations.BeforeMethod
import org.testng.annotations.BeforeSuite
import org.testng.annotations.Test
import screens.Onboarding
import screens.Onboarding.buttonNext
import screens.Onboarding.selectLanguage
import java.net.URL
import java.time.Duration
import java.util.concurrent.TimeUnit

open class MainActivity {

    @BeforeSuite
    fun installDriver(){
        val capabilities = DesiredCapabilities()

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android")
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0")
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel")
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/admin/apps/app-profile.apk")
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2")
        //capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "starter.school.client")
        //capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "starter.school.client.MainActivity")

        val url = URL("http://127.0.0.1:4723/")
        androidDriver = AndroidDriver(url, capabilities)

        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4))

        clickToElement(selectLanguage.androidXpath, LocatorType.XPATH)

        clickToElement(buttonNext.androidAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(5)

        clickToElement("Самовывоз", LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(10)
    }

    @AfterSuite
    fun quitDriver(){
        androidDriver.quit()
    }

    @BeforeClass
    fun beforeClass() {

    }

    @AfterClass
    fun afterClass() {

    }

    @BeforeMethod
    fun launceApp() {
        androidDriver.activateApp(BUNDLE_ID)
        TimeUnit.SECONDS.sleep(10)
    }

    @AfterMethod
    fun closeApp() {
        androidDriver.terminateApp(BUNDLE_ID)
    }

    companion object {
        const val BUNDLE_ID = "starter.school.client"
    }
}