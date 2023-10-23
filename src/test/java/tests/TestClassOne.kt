package tests

import GlobalVariable.androidDriver
import MainActivity
import io.appium.java_client.AppiumBy
import org.testng.annotations.Test
import java.util.concurrent.TimeUnit

class TestClassOne : MainActivity() {

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

        androidDriver.findElement(
            AppiumBy.xpath("//android.view.View[@content-desc=\"Укажите телефон\n" +
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