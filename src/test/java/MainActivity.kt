import GlobalVariable.androidDriver
import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver
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
    fun test1(){
        println("Тест запущен")
        TimeUnit.SECONDS.sleep(5)

    }

    @Test
    fun test2(){
        println("Тест на ошибки")
        try {
            androidDriver.findElement(AppiumBy.accessibilityId("Zakyski"))
                .click()
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            e.printStackTrace()
            println("Найдена ошибка, данного элемента не существует")
        }
        TimeUnit.SECONDS.sleep(5)
    }

    @Test
    fun test3() {
        println("Тест на дополнительные клики")
        println("Клик по вкладке 'Суп'")
        androidDriver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Супы\"]"))
            .click()
        TimeUnit.SECONDS.sleep(5)

        println("Добавление тыквенного супа")
        androidDriver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"270 ₽\"]"))
            .click()
        TimeUnit.SECONDS.sleep(5)
    }

    @Test
    fun test4() {
        println("Вход в профиль")

        androidDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")).click()
        TimeUnit.SECONDS.sleep(5)

        androidDriver.findElement(AppiumBy.accessibilityId("Войти")).click()
        TimeUnit.SECONDS.sleep(5)

        androidDriver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Укажите телефон\n" +
                "На него отправим код подтверждения\"]/android.widget.EditText"))
            .sendKeys("9879915981")
        TimeUnit.SECONDS.sleep(5)

        androidDriver.findElement(AppiumBy.accessibilityId("Получить код"))
            .click()
        TimeUnit.SECONDS.sleep(10)

        val text = androidDriver.pageSource
        androidDriver.findElement(AppiumBy.className("android.widget.EditText"))
            .sendKeys(text.substring(text.indexOf("Введите код из смс&#10;") + 23
                ,text.indexOf("&#10;+7 (987) 991-59-81&")))
        TimeUnit.SECONDS.sleep(10)
    }
}