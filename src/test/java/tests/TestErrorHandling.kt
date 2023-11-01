package tests

import LocatorType
import MainActivity
import TestFunctions.clickToElement
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import org.testng.annotations.Test
import screens.MainScreen.nonExistentButton
import java.util.concurrent.TimeUnit

class TestErrorHandling : MainActivity() {

    @Test
    fun test1(){
        println("Тест на ошибки")

        checkAuthorizationUser(true)

        try {
            clickToElement(
                nonExistentButton.androidAccessibilityId,
                LocatorType.ACCESSIBILITY_ID,
                nonExistentButton.iosClassChain,
                LocatorType.IOS_CLASS_CHAIN
            )
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            e.printStackTrace()
            println("Найдена ошибка, данного элемента не существует")
        }

        TimeUnit.SECONDS.sleep(5)
    }
}