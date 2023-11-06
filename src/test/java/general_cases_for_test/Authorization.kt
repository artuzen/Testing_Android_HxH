package general_cases_for_test

import GlobalVariable.androidDriver
import GlobalVariable.iosDriver
import GlobalVariable.platformType
import TypeOS
import screens.AuthorizationScreen
import screens.AuthorizationScreen.clickButtonGetCode
import screens.AuthorizationScreen.sendEnterCode
import screens.MainScreen.clickButtonMenu
import screens.ProfileScreen.clickButtonEnter
import java.util.concurrent.TimeUnit

object Authorization {

    fun authorization() {
        clickButtonEnter()
        TimeUnit.SECONDS.sleep(5)

        val phone = "9879915981"
        for (i in 0..9) {
            AuthorizationScreen.sendEnterPhone(phone[i].toString())
            TimeUnit.SECONDS.sleep(5)
        }


        clickButtonGetCode()
        TimeUnit.SECONDS.sleep(10)

        val text = if (platformType == TypeOS.IOS) {
            iosDriver.pageSource
        } else {
            androidDriver.pageSource
        }

        sendEnterCode(
            text.substring(
                text.indexOf("Введите код из смс&#10;") + 23,
                text.indexOf("&#10;+7 (987) 991-59-81&")
            )
        )
        TimeUnit.SECONDS.sleep(10)

        clickButtonMenu()
        TimeUnit.SECONDS.sleep(5)
    }
}