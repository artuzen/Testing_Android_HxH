package api_client.requests.user

import ResponseType
import api_client.Get
import api_client.Res
import api_client.environment.Environment.endPoints
import api_client.environment.Environment.headers
import io.qameta.allure.Step
import io.restassured.response.Response

object SessionId : Get, Res{

    override lateinit var  resBody: Any

    override fun getDataFromJSON(response: Response): String {
        return response.body.asString()
    }

    @Step("Отправка запроса GET /user/sessionId")
    override fun get(queryParams: MutableMap<String, String>) {
        val responseJSON = getReq(
            queryParams = queryParams,
            endPoint = endPoints.sessionId,
            responseType = ResponseType.JSON
        )
        resBody = getDataFromJSON(responseJSON)

        headers["sessionid"] = resBody.toString()
    }

}