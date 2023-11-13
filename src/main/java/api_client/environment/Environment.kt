package api_client.environment

object Environment {

    var environment = Evn()
    val endPoints = EndPoints()
    var headers: MutableMap<String,String> = mutableMapOf(
        "authority" to "api.starterapp.ru",
        "authorization" to "",
        "sessionid" to "",
        "content-type" to "application/json",
        "accept" to "application/json",
        "lang" to "ru",
        "user-agent" to "IOS-device",
        "origin" to "https://school.starterapp.ru",
        "x-real-ip" to "91.197.192.54",
        "timezone" to "Europe/Moscow"
    )


    data class Evn(
        val host: String = "https://api.starterapp.ru/school/",
        val shopId: String = "8c65fc68-dfd9-4591-a8f2-9edf77fbd3fd"
    )

    data class EndPoints (
        val categories: String = "categories/8c65fc68-dfd9-4591-a8f2-9edf77fbd3fd/v2",
        val authRestCode: String = "/auth/resetCode",
        val authLogin: String = "auth/login",
        val sessionId: String = "/user/sessionId",
        val userInformation: String = "/user/v2",
        val meals: String = "/meals/8c65fc68-dfd9-4591-a8f2-9edf77fbd3fd/v2"
    )


}