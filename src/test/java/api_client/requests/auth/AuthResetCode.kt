package api_client.requests.auth

import ResponseType
import api_client.Post
import api_client.Res
import api_client.environment.Environment.endPoints
import api_client.pojo.auth.AuthResetCodePojo
import io.qameta.allure.Step
import io.restassured.response.Response

object AuthResetCode : Post, Res, AuthResetCodePojo() {

    override lateinit var resBody: String

    override fun getDataFromJSON(response: Response): String {
        return response.body.asString()
    }

    // Создание body POST запроса
    fun authResetCodeReqBody(phone: String): AuthResetCodeResBody {
        return AuthResetCodeResBody(phone = phone)
    }

    // отправка запроса POST auth/anonymous
    @Step("Отправка запроса POST /auth/resetCode")
    override fun post(reqBody: Any) {
        val responseJSON = postReq(
            reqBody = reqBody,
            endPoint = endPoints.authRestCode,
            responseType = ResponseType.HTML
        )
        // перенос ответа по классам для дальнейшей обработки
        resBody = getDataFromJSON(responseJSON)
    }
}