package tests

import MainActivity
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import org.testng.annotations.Test
import screens.MainScreen
import java.util.concurrent.TimeUnit

class TestAddingSoup : MainActivity() {

    @Test
    fun test1() {
        println("Тест на дополнительные клики")

        checkAuthorizationUser(false)

        val mainScreen = MainScreen()

        println("Клик по вкладке 'Суп'")
        mainScreen.clickTabSoup()
        TimeUnit.SECONDS.sleep(5)

        println("Добавление тыквенного супа")
        mainScreen.clickPumpkinSoup()
        TimeUnit.SECONDS.sleep(5)
    }
}