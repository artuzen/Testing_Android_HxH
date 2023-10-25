package tests

import GlobalVariable.androidDriver
import LocatorType
import MainActivity
import TestFunctions.clickToElement
import TestFunctions.sendText
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import org.testng.annotations.Test
import screens.AuthorizationScreen.buttonGetCode
import screens.AuthorizationScreen.enterCode
import screens.AuthorizationScreen.enterPhone
import screens.MainScreen.buttonProfile
import screens.ProfileScreen.buttonEnter
import java.util.concurrent.TimeUnit

class TestAuthorization : MainActivity() {

    @Test
    fun test1() {
        println("Вход в профиль")

        checkAuthorizationUser(false)

        clickToElement(buttonProfile.androidXpath, LocatorType.XPATH)
        TimeUnit.SECONDS.sleep(5)

        clickToElement(buttonEnter.androidAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(5)

        sendText(enterPhone.androidXpath, LocatorType.XPATH, "9879915981")
        TimeUnit.SECONDS.sleep(5)

        clickToElement(buttonGetCode.androidAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(10)

        val text = androidDriver.pageSource
        sendText(enterCode.androidClassName, LocatorType.CLASS_NAME, text.substring(text.indexOf("Введите код из смс&#10;") + 23, text.indexOf("&#10;+7 (987) 991-59-81&")))
        TimeUnit.SECONDS.sleep(10)
    }
}