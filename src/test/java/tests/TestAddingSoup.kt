package tests

import MainActivity
import api_client.environment.Environment
import api_client.requests.categories.Categories
import api_client.requests.meals.MealsInformation
import api_client.requests.user.SessionId
import api_client.specifications.Specifications
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import io.qameta.allure.Description
import org.testng.annotations.Test
import screens.MainScreen
import java.util.concurrent.TimeUnit

class TestAddingSoup : MainActivity() {

    @Description("Тест на добовление Щи по средствам работы с запросами API")
    @Test(description = "Добавления супа")
    fun test1() {
        Specifications.installSpecification(Specifications.requestSpec(Environment.environment.host))
        SessionId.get(mutableMapOf())
        TimeUnit.SECONDS.sleep(5)

        Categories.get(mutableMapOf())
        TimeUnit.SECONDS.sleep(5)

        MealsInformation.get(mutableMapOf())
        TimeUnit.SECONDS.sleep(5)

        checkAuthorizationUser(true)

        val mainScreen = MainScreen()

        mainScreen.updateCategory(Categories.resBody[2].name)
        mainScreen.clickTabSoup()
        TimeUnit.SECONDS.sleep(5)

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
