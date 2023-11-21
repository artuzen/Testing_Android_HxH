package tests

import MainActivity
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import io.qameta.allure.Description
import org.testng.annotations.Test
import screens.MainScreen
import java.util.concurrent.TimeUnit

class TestErrorHandling : MainActivity() {

    @Description("Осуществление клика по несуществующей кнопке 'Zakuski'")
    @Test(description = "Клик по несуществующей кнопке")
    fun test1(){
        checkAuthorizationUser(true)

        val mainScreen = MainScreen()

        try {
            mainScreen.clickNonExistentButton(findElementWithoutCatching = true)
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            e.printStackTrace()
            println("Найдена ошибка, данного элемента не существует")
        }

        TimeUnit.SECONDS.sleep(5)
    }
}