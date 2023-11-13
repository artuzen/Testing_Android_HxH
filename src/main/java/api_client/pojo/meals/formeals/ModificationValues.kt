package api_client.pojo.meals.formeals

import com.google.gson.annotations.SerializedName


data class ModificationValues (

  @SerializedName("type" ) var type : String? = null,
  @SerializedName("name" ) var name : String? = null

)