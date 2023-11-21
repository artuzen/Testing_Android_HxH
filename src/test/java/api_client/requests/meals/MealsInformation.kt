package api_client.requests.meals

import ResponseType
import api_client.Get
import api_client.Res
import api_client.environment.Environment.endPoints
import api_client.pojo.meals.MealsInformationPojo
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import io.qameta.allure.Step
import io.restassured.response.Response

object MealsInformation : Get, Res, MealsInformationPojo() {

    override lateinit var resBody: List<MealsInformationRes>

    override fun getDataFromJSON(response: Response): List<MealsInformationRes> {
        val jsonString: String = response.asString()
        val gson = Gson()
        val itemType = object : TypeToken<List<MealsInformationRes>>() {}.type
        return gson.fromJson(jsonString, itemType)
    }

    @Step("Отправка запроса GET /meals/8c65fc68-dfd9-4591-a8f2-9edf77fbd3fd/v2")
    override fun get(queryParams: MutableMap<String, String>) {
        val responseJSON = getReq(
            queryParams = queryParams,
            endPoint = endPoints.meals,
            responseType = ResponseType.JSON
        )
        resBody = getDataFromJSON(responseJSON)
    }
}