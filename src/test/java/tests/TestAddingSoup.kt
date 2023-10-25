package tests

import LocatorType
import MainActivity
import TestFunctions.clickToElement
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import org.testng.annotations.Test
import screens.MainScreen.pumpkinSoup
import screens.MainScreen.tabSoup
import java.util.concurrent.TimeUnit

class TestAddingSoup : MainActivity() {

    @Test
    fun test1() {
        println("Тест на дополнительные клики")

        checkAuthorizationUser(false)

        println("Клик по вкладке 'Суп'")
        clickToElement(tabSoup.androidXpath, LocatorType.XPATH)
        TimeUnit.SECONDS.sleep(5)

        println("Добавление тыквенного супа")
        clickToElement(pumpkinSoup.androidXpath, LocatorType.XPATH)
        TimeUnit.SECONDS.sleep(5)
    }
}