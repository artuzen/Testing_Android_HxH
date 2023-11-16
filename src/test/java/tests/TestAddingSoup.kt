package tests

import MainActivity
import api_client.requests.categories.Categories
import api_client.requests.meals.MealsInformation
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import org.testng.annotations.Test
import screens.MainScreen
import java.util.concurrent.TimeUnit

class TestAddingSoup : MainActivity() {

    @Test
    fun test1() {
        println("Тест на дополнительные клики")

        checkAuthorizationUser(true)

        val mainScreen = MainScreen()

        println("Клик по вкладке 'Суп'")
        mainScreen.updateCategory(Categories.resBody[2].name)
        mainScreen.clickTabSoup()
        TimeUnit.SECONDS.sleep(5)

        println("Добавление щи")
        var i  = 0
        while (true){
            if (MealsInformation.resBody[i].categories.contains(Categories.resBody[2].code)) {
                mainScreen.updateSoup(MealsInformation.resBody[i].minPrice)
                break
            }
            i++
        }
        mainScreen.clickShiSoup()
        TimeUnit.SECONDS.sleep(5)
    }
}
