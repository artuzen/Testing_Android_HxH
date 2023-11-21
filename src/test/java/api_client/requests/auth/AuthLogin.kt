package api_client.requests.auth

import ResponseType
import api_client.Post
import api_client.Res
import api_client.environment.Environment.endPoints
import api_client.environment.Environment.headers
import api_client.pojo.auth.AuthLoginPojo
import io.qameta.allure.Step
import io.restassured.response.Response

object AuthLogin : Post, Res, AuthLoginPojo() {

    override lateinit var resBody: String

    override fun getDataFromJSON(response: Response): String {
        return response.body.asString()
    }

    fun authLoginReqBody(phone: String, code: String): AuthLoginResBody {
        return AuthLoginResBody(
            phone = phone,
            code = code
        )
    }

    @Step("Отправка запроса POST /auth/login")
    override fun post(reqBody: Any) {
        val responseJSON = postReq(
            reqBody = reqBody,
            endPoint = endPoints.authLogin,
            responseType = ResponseType.HTML
        )

        resBody = getDataFromJSON(responseJSON)

        headers["authorization"] = resBody
    }

}