package tests

import MainActivity
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import org.testng.annotations.Test
import screens.MainScreen.clickPumpkinSoup
import screens.MainScreen.clickTabSoup
import java.util.concurrent.TimeUnit

class TestAddingSoup : MainActivity() {

    @Test
    fun test1() {
        println("Тест на дополнительные клики")

        checkAuthorizationUser(false)

        println("Клик по вкладке 'Суп'")
        clickTabSoup()
        TimeUnit.SECONDS.sleep(5)

        println("Добавление тыквенного супа")
        clickPumpkinSoup()
        TimeUnit.SECONDS.sleep(5)
    }
}