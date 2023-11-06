package tests

import MainActivity
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import org.testng.annotations.Test
import java.util.concurrent.TimeUnit

class TestLaunch : MainActivity() {

    @Test
    fun test1(){
        println("Тест на запуск программы")

        checkAuthorizationUser(false)
        TimeUnit.SECONDS.sleep(5)
    }
}