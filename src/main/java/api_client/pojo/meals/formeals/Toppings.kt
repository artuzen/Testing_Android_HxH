package api_client.pojo.meals.formeals

import com.google.gson.annotations.SerializedName


data class Toppings (

  @SerializedName("code"      ) var code      : String?           = null,
  @SerializedName("name"      ) var name      : String?           = null,
  @SerializedName("price"     ) var price     : Int?              = null,
  @SerializedName("maxAmount" ) var maxAmount : Int?              = null,
  @SerializedName("minAmount" ) var minAmount : Int?              = null,
  @SerializedName("required"  ) var required  : Boolean?          = null,
  @SerializedName("images"    ) var images    : ArrayList<String> = arrayListOf(),
  @SerializedName("quantity"  ) var quantity  : Int?              = null

)