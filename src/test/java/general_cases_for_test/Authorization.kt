package general_cases_for_test

import GlobalVariable.androidDriver
import LocatorType
import TestFunctions.clickToElement
import TestFunctions.sendText
import screens.AuthorizationScreen.buttonGetCode
import screens.AuthorizationScreen.enterCode
import screens.AuthorizationScreen.enterPhone
import screens.MainScreen.buttonMenu
import screens.MainScreen.buttonProfile
import screens.ProfileScreen.buttonEnter
import java.util.concurrent.TimeUnit

object Authorization {

    fun authorization(phoneNumber: String) {
        clickToElement(
            buttonProfile.androidXpath,
            LocatorType.XPATH)
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            buttonEnter.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(5)

        sendText(
            enterPhone.androidXpath,
            LocatorType.XPATH,
            phoneNumber)
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            buttonGetCode.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(10)

        val text = androidDriver.pageSource
        sendText(
            enterCode.androidClassName,
            LocatorType.CLASS_NAME,
            text.substring(
                text.indexOf("Введите код из смс&#10;") + 23,
                text.indexOf("&#10;+7 (987) 991-59-81&"))
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            buttonMenu.androidXpath,
            LocatorType.XPATH)
        TimeUnit.SECONDS.sleep(5)
    }
}