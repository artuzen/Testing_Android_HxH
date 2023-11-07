package tests

import MainActivity
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import org.testng.annotations.Test
import screens.MainScreen
import java.util.concurrent.TimeUnit

class TestErrorHandling : MainActivity() {

    @Test
    fun test1(){
        println("Тест на ошибки")

        checkAuthorizationUser(true)

        val mainScreen = MainScreen()

        try {
            mainScreen.clickNonExistentButton()
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            e.printStackTrace()
            println("Найдена ошибка, данного элемента не существует")
        }

        TimeUnit.SECONDS.sleep(5)
    }
}