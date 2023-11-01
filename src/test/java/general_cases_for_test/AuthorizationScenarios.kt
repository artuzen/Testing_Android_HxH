package general_cases_for_test

import GlobalVariable.androidDriver
import GlobalVariable.iosDriver
import GlobalVariable.platformType
import LocatorType
import TestFunctions.checkAvailableElement
import TestFunctions.clickToElement
import TestFunctions.sendText
import TypeOS
import screens.AuthorizationScreen.buttonGetCode
import screens.AuthorizationScreen.enterCode
import screens.AuthorizationScreen.enterPhone
import screens.MainScreen.buttonMenu
import screens.MainScreen.buttonProfile
import screens.ProfileScreen.authorizationPerson
import screens.ProfileScreen.buttonEnter
import screens.ProfileScreen.buttonExit
import java.util.concurrent.TimeUnit

object AuthorizationScenarios {

    fun checkAuthorizationUser(needAuthorizationUser: Boolean) {
        /* тут должна быть логика проверки авторизации пользователя
        на входе одна и нужных булевых переменных, вторую нужно получить путем
        проверки доступности элемента
         */

        // нужно описать 4 ветки
        var userIsAuthorization: Boolean
        try {
            // нам нужно получить true, что это сделать, нужно найти элемент, если он не будет
            // найден, то должна обработаться ошибка и установить значение false
            clickToElement(
                buttonProfile.androidXpath,
                LocatorType.XPATH,
                buttonProfile.iosClassChain,
                LocatorType.IOS_CLASS_CHAIN
            )
            TimeUnit.SECONDS.sleep(5)

            userIsAuthorization = checkAvailableElement(
                authorizationPerson.androidAccessibilityId,
                LocatorType.ACCESSIBILITY_ID,
                authorizationPerson.iosAccessibilityId,
                LocatorType.ACCESSIBILITY_ID
            )
            TimeUnit.SECONDS.sleep(5)

        } catch (e: org.openqa.selenium.NoSuchElementException) {
            userIsAuthorization = false
        }
        when {
            needAuthorizationUser && userIsAuthorization -> {
                clickToElement(
                    buttonMenu.androidXpath,
                    LocatorType.XPATH,
                    buttonMenu.iosClassChain,
                    LocatorType.IOS_CLASS_CHAIN)
                TimeUnit.SECONDS.sleep(5)
            }

            needAuthorizationUser && !userIsAuthorization -> {
                clickToElement(
                    buttonEnter.androidAccessibilityId,
                    LocatorType.ACCESSIBILITY_ID,
                    buttonEnter.iosAccessibilityId,
                    LocatorType.ACCESSIBILITY_ID
                )
                TimeUnit.SECONDS.sleep(5)

                val phone = "9879915981"
                for (i in 0..9) {
                    sendText(
                        enterPhone.androidXpath,
                        LocatorType.XPATH,
                        enterPhone.iosClassName,
                        LocatorType.CLASS_NAME,
                        phone[i].toString()
                    )
                    TimeUnit.SECONDS.sleep(5)
                }

                clickToElement(
                    buttonGetCode.androidAccessibilityId,
                    LocatorType.ACCESSIBILITY_ID,
                    buttonGetCode.iosClassChain,
                    LocatorType.IOS_CLASS_CHAIN
                )
                TimeUnit.SECONDS.sleep(10)

                val text = if (platformType == TypeOS.IOS) {
                    iosDriver.pageSource
                } else {
                    androidDriver.pageSource
                }

                sendText(
                    enterCode.androidClassName,
                    LocatorType.CLASS_NAME,
                    enterCode.iosClassName,
                    LocatorType.CLASS_NAME,
                    text.substring(
                        text.indexOf("Введите код из смс&#10;") + 23,
                        text.indexOf("&#10;+7 (987) 991-59-81&")))
                TimeUnit.SECONDS.sleep(10)

                clickToElement(
                    buttonMenu.androidXpath,
                    LocatorType.XPATH,
                    buttonMenu.iosClassChain,
                    LocatorType.IOS_CLASS_CHAIN)
                TimeUnit.SECONDS.sleep(5)
            }



            !needAuthorizationUser && userIsAuthorization -> {
                clickToElement(
                    buttonExit.androidAccessibilityId,
                    LocatorType.ACCESSIBILITY_ID,
                    buttonExit.iosAccessibilityId,
                    LocatorType.ACCESSIBILITY_ID
                )
                TimeUnit.SECONDS.sleep(5)

                clickToElement(
                    buttonMenu.androidXpath,
                    LocatorType.XPATH,
                    buttonMenu.iosClassChain,
                    LocatorType.IOS_CLASS_CHAIN)
                TimeUnit.SECONDS.sleep(5)
            }



            !needAuthorizationUser && !userIsAuthorization -> {
                clickToElement(
                    buttonMenu.androidXpath,
                    LocatorType.XPATH,
                    buttonMenu.iosClassChain,
                    LocatorType.IOS_CLASS_CHAIN)
                TimeUnit.SECONDS.sleep(5)
            }
        }

    }
}