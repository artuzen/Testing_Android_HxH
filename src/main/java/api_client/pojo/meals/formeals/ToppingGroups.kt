package api_client.pojo.meals.formeals

import com.google.gson.annotations.SerializedName


data class ToppingGroups (

  @SerializedName("maxAmount" ) var maxAmount : Int?                = null,
  @SerializedName("minAmount" ) var minAmount : Int?                = null,
  @SerializedName("required"  ) var required  : Boolean?            = null,
  @SerializedName("groupName" ) var groupName : String?             = null,
  @SerializedName("toppings"  ) var toppings  : ArrayList<Toppings> = arrayListOf()

)