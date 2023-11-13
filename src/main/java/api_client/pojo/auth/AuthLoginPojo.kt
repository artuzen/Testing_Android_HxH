package api_client.pojo.auth

open class AuthLoginPojo {

    //reqBody
    data class AuthLoginResBody (
        val phone: String,
        val code: String
    )
}