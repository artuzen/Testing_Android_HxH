package tests

import MainActivity
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import io.qameta.allure.Description
import org.testng.annotations.Test
import java.util.concurrent.TimeUnit

class TestLaunch : MainActivity() {

    @Description("Проверка скрипта авторизации пользователя в приложении")
    @Test(description = "Авторизация")
    fun test1(){
        checkAuthorizationUser(false)
        TimeUnit.SECONDS.sleep(5)
    }
}