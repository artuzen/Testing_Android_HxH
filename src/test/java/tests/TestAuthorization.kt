package tests

import GlobalVariable.androidDriver
import GlobalVariable.iosDriver
import GlobalVariable.platformType
import MainActivity
import TypeOS
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import io.qameta.allure.Description
import org.testng.annotations.Test
import screens.AuthorizationScreen
import screens.MainScreen
import screens.ProfileScreen
import java.util.concurrent.TimeUnit

class TestAuthorization : MainActivity() {

    @Description("Проверка работоспособности функции авторизации")
    @Test(description = "Авторизация")
    fun test1() {
        println("Вход в профиль")

        checkAuthorizationUser(false)

        val mainScreen = MainScreen()
        val profileScreen = ProfileScreen()
        val authorizationScreen = AuthorizationScreen()

        mainScreen.clickButtonProfile()
        TimeUnit.SECONDS.sleep(5)

        profileScreen.clickButtonEnter ()
        TimeUnit.SECONDS.sleep(5)

        val phone = "9879915981"
        for (i in 0..9) {
            authorizationScreen.sendEnterPhone(phone[i].toString())
            TimeUnit.SECONDS.sleep(5)
        }


        authorizationScreen.clickButtonGetCode()
        TimeUnit.SECONDS.sleep(10)

        val text = if (platformType == TypeOS.IOS) {
            iosDriver.pageSource
        } else {
            androidDriver.pageSource
        }

        authorizationScreen.sendEnterCode(text.substring(
            text.indexOf("Введите код из смс&#10;") + 23,
            text.indexOf("&#10;+7 (987) 991-59-81&")))
        TimeUnit.SECONDS.sleep(10)

        mainScreen.clickButtonMenu()
        TimeUnit.SECONDS.sleep(5)
    }
}