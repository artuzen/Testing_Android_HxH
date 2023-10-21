import GlobalVariable.androidDriver
import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.AndroidMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeSuite
import org.testng.annotations.Test
import java.net.URL
import java.time.Duration
import java.util.concurrent.TimeUnit

class MainActivity {

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

        val element1 = androidDriver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Русский\"]"))
        element1.click()

        val element2 = androidDriver.findElement(AppiumBy.accessibilityId("Далее"))
        element2.click()
        TimeUnit.SECONDS.sleep(5)

        val element3 = androidDriver.findElement(AppiumBy.accessibilityId("Самовывоз"))
        element3.click()

        TimeUnit.SECONDS.sleep(10)

        /* val text = androidDriver.pageSource
         val element4 = androidDriver.findElement(AppiumBy.accessibilityId())
         element4.sendKeys(text)*/





    }

    @AfterSuite
    fun quitDriver(){

        androidDriver.quit()
    }

    @Test
    fun testOne(){
        println("Тест запущен")
        TimeUnit.SECONDS.sleep(5)

    }

    @Test
    fun testTwo(){
        println("Тест на ошибки")
        TimeUnit.SECONDS.sleep(10)
        try {
            val element1 = androidDriver.findElement(AppiumBy.accessibilityId("Zakyski"))
            element1.click()
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            e.printStackTrace()
            println("Найдена ошибка, данного элемента не существует")
        }
    }
}