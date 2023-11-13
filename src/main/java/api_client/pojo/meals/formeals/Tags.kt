package api_client.pojo.meals.formeals

import com.google.gson.annotations.SerializedName


data class Tags (

  @SerializedName("code" ) var code : String? = null,
  @SerializedName("name" ) var name : String? = null

)