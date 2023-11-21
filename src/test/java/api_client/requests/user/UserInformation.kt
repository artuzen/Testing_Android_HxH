package api_client.requests.user

import ResponseType
import api_client.Get
import api_client.Res
import api_client.environment.Environment.endPoints
import api_client.pojo.user.UserInformationPojo
import com.google.gson.Gson
import io.qameta.allure.Step
import io.restassured.response.Response

object UserInformation : Get, Res, UserInformationPojo() {

    override lateinit var resBody: UserInformationRes

    override fun getDataFromJSON(response: Response): UserInformationRes {
        val jsonString = response.asString()
        val gson = Gson()
        return gson.fromJson(jsonString, UserInformationRes::class.java)
    }

    @Step("Отправка запроса GET /user/v2")
    override fun get(queryParams: MutableMap<String, String>) {
        val responseJSON = getReq(
            queryParams = queryParams,
            endPoint = endPoints.userInformation,
            responseType = ResponseType.JSON
        )
        resBody = getDataFromJSON(responseJSON)
    }

}