package tests

import MainActivity
import api_client.environment.Environment
import api_client.requests.auth.AuthLogin
import api_client.requests.auth.AuthResetCode
import api_client.requests.categories.Categories
import api_client.requests.meals.MealsInformation
import api_client.requests.user.SessionId
import api_client.requests.user.UserInformation
import api_client.specifications.Specifications
import io.qameta.allure.Description
import org.testng.annotations.Test
import java.util.concurrent.TimeUnit

class TestAPI : MainActivity(){

    @Description("Тесты по запросам в API sessionId, restCode, login, categories, user, meals")
    @Test(description = "Запрос API")
    fun test1() {
        Specifications.installSpecification(Specifications.requestSpec(Environment.environment.host))
        SessionId.get(mutableMapOf())
        TimeUnit.SECONDS.sleep(5)

        AuthResetCode.post(AuthResetCode.authResetCodeReqBody("79879915981"))
        TimeUnit.SECONDS.sleep(5)

        AuthLogin.post(AuthLogin.authLoginReqBody("79879915981", "3256"))
        TimeUnit.SECONDS.sleep(5)

        Categories.get(mutableMapOf())
        TimeUnit.SECONDS.sleep(5)

        UserInformation.get(mutableMapOf())
        TimeUnit.SECONDS.sleep(5)

        MealsInformation.get(mutableMapOf())
        TimeUnit.SECONDS.sleep(5)
    }
}