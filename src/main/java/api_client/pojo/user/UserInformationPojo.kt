package api_client.pojo.user

import com.google.gson.annotations.SerializedName

open class UserInformationPojo {

    data class UserInformationRes(
        @SerializedName("name") var name: String? = null,
        @SerializedName("phone") var phone: String? = null,
        @SerializedName("session") var session: String? = null,
        @SerializedName("phoneStatus") var phoneStatus: String? = null,
        @SerializedName("addresses") var addresses: ArrayList<Addresses> = arrayListOf(),
        @SerializedName("order") var order: Order? = Order(),
        @SerializedName("wallet") var wallet: ArrayList<String> = arrayListOf(),
        @SerializedName("bonuses") var bonuses: Int? = null,
        @SerializedName("instagram") var instagram: String? = null,
        @SerializedName("email") var email: String? = null,
        @SerializedName("birthDate") var birthDate: String? = null,
        @SerializedName("bonusCardCode") var bonusCardCode: String? = null,
        @SerializedName("bonusProgram") var bonusProgram: String? = null,

        )

    data class Address(

        @SerializedName("code") var code: Int? = null,
        @SerializedName("street") var street: String? = null,
        @SerializedName("flat") var flat: String? = null,
        @SerializedName("floor") var floor: String? = null,
        @SerializedName("entrance") var entrance: String? = null,
        @SerializedName("doorphone") var doorphone: String? = null,
        @SerializedName("comment") var comment: String? = null,
        @SerializedName("longitude") var longitude: Double? = null,
        @SerializedName("latitude") var latitude: Double? = null,
        @SerializedName("city") var city: String? = null,
        @SerializedName("shopId") var shopId: String? = null,
        @SerializedName("zoneId") var zoneId: String? = null,
        @SerializedName("yandex") var yandex: Yandex? = Yandex(),
        @SerializedName("shopGlobalId") var shopGlobalId: String? = null

        )


    data class AddressDetails(

        @SerializedName("Country") var Country: Country? = Country()
    )

    data class Addresses(

        @SerializedName("code") var code: Int? = null,
        @SerializedName("street") var street: String? = null,
        @SerializedName("flat") var flat: String? = null,
        @SerializedName("floor") var floor: String? = null,
        @SerializedName("entrance") var entrance: String? = null,
        @SerializedName("doorphone") var doorphone: String? = null,
        @SerializedName("comment") var comment: String? = null,
        @SerializedName("longitude") var longitude: Double? = null,
        @SerializedName("latitude") var latitude: Double? = null,
        @SerializedName("city") var city: String? = null,
        @SerializedName("shopId") var shopId: String? = null,
        @SerializedName("zoneId") var zoneId: String? = null,
        @SerializedName("yandex") var yandex: Yandex? = Yandex(),

        )

    data class AdministrativeArea(

        @SerializedName("Locality") var Locality: Locality? = Locality(),
        @SerializedName("AdministrativeAreaName") var AdministrativeAreaName: String? = null,

        )

    data class BoundedBy(

        @SerializedName("Envelope") var Envelope: Envelope? = Envelope(),

        )

    data class Components(

        @SerializedName("kind") var kind: String? = null,
        @SerializedName("name") var name: String? = null,

        )

    data class DeliveryTypePrice(

        @SerializedName("status") var status: Boolean? = null,
        @SerializedName("deliveryTime") var deliveryTime: Int? = null,
        @SerializedName("deliveryType") var deliveryType: String? = null,
        @SerializedName("paymentTypes") var paymentTypes: ArrayList<String> = arrayListOf(),
        @SerializedName("deliveryPrice") var deliveryPrice: ArrayList<String> = arrayListOf(),
        @SerializedName("minBasketPrice") var minBasketPrice: Int? = null,
        @SerializedName("defaultDeliveryPrice") var defaultDeliveryPrice: Int? = null,
        @SerializedName("packageReturn") var packageReturn: Boolean? = null,

        )

    data class Envelope(

        @SerializedName("lowerCorner") var lowerCorner: String? = null,
        @SerializedName("upperCorner") var upperCorner: String? = null,

        )

    data class GeocoderMetaData(

        @SerializedName("kind") var kind: String? = null,
        @SerializedName("text") var text: String? = null,
        @SerializedName("Address") var Address: Companion.Address? = Companion.Address(),
        @SerializedName("precision") var precision: String? = null,
        @SerializedName("AddressDetails") var AddressDetails: AddressDetails? = AddressDetails(),

        )

    data class GeoObject(

        @SerializedName("uri") var uri: String? = null,
        @SerializedName("name") var name: String? = null,
        @SerializedName("Point") var Point: Point? = Point(),
        @SerializedName("boundedBy") var boundedBy: BoundedBy? = BoundedBy(),
        @SerializedName("description") var description: String? = null,
        @SerializedName("metaDataProperty") var metaDataProperty: MetaDataProperty? = MetaDataProperty(),

        )

    data class Country(

        @SerializedName("AddressLine") var AddressLine: String? = null,
        @SerializedName("CountryName") var CountryName: String? = null,
        @SerializedName("CountryNameCode") var CountryNameCode: String? = null,
        @SerializedName("AdministrativeArea") var AdministrativeArea: AdministrativeArea? = AdministrativeArea(),

        )

    data class Items(

        @SerializedName("code") var code: Int? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("discountPrice") var discountPrice: Int? = null,
        @SerializedName("totalPrice") var totalPrice: Int? = null,
        @SerializedName("mealGlobalId") var mealGlobalId: String? = null,
        @SerializedName("quantity") var quantity: Int? = null,
        @SerializedName("presentItemsCount") var presentItemsCount: Int? = null,
        @SerializedName("toppings") var toppings: ArrayList<String> = arrayListOf(),
        @SerializedName("product") var product: Product? = Product(),
        @SerializedName("categoryGlobalId") var categoryGlobalId: ArrayList<String> = arrayListOf(),
        @SerializedName("isAccessible") var isAccessible: Boolean? = null,
        @SerializedName("categoryNotAccessibility") var categoryNotAccessibility: ArrayList<String> = arrayListOf(),
        @SerializedName("notAccessibleByBrand") var notAccessibleByBrand: Boolean? = null,
        @SerializedName("notAccessibleByStopList") var notAccessibleByStopList: Boolean? = null,

        )

    data class Locality(

        @SerializedName("LocalityName") var LocalityName: String? = null,
        @SerializedName("Thoroughfare") var Thoroughfare: Thoroughfare? = Thoroughfare(),

        )

    data class MetaDataProperty(

        @SerializedName("GeocoderMetaData") var GeocoderMetaData: GeocoderMetaData? = GeocoderMetaData(),

        )

    data class Order(

        @SerializedName("discounts") var discounts: ArrayList<String> = arrayListOf(),
        @SerializedName("code") var code: Int? = null,
        @SerializedName("status") var status: Status? = Status(),
        @SerializedName("userName") var userName: String? = null,
        @SerializedName("userPhone") var userPhone: String? = null,
        @SerializedName("comment") var comment: String? = null,
        @SerializedName("flatwareAmount") var flatwareAmount: Int? = null,
        @SerializedName("items") var items: ArrayList<Items> = arrayListOf(),
        @SerializedName("safeDelivery") var safeDelivery: Boolean? = null,
        @SerializedName("packageReturn") var packageReturn: Boolean? = null,
        @SerializedName("deliveryPrice") var deliveryPrice: Int? = null,
        @SerializedName("deliveryPriceDesc") var deliveryPriceDesc: String? = null,
        @SerializedName("deliveryType") var deliveryType: String? = null,
        @SerializedName("deliveryTime") var deliveryTime: String? = null,
        @SerializedName("deliveryDuration") var deliveryDuration: Int? = null,
        @SerializedName("deliveryMinutes") var deliveryMinutes: Int? = null,
        @SerializedName("cookingMinutes") var cookingMinutes: Int? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("discountPrice") var discountPrice: Int? = null,
        @SerializedName("totalPrice") var totalPrice: Int? = null,
        @SerializedName("payMethod") var payMethod: String? = null,
        @SerializedName("updatedAt") var updatedAt: String? = null,
        @SerializedName("address") var address: Address? = Address(),
        @SerializedName("bonuses") var bonuses: Int? = null,
        @SerializedName("notCall") var notCall: Boolean? = null,
        @SerializedName("table") var table: String? = null,
        @SerializedName("isPreorder") var isPreorder: Boolean? = null,
        @SerializedName("source") var source: String? = null,
        @SerializedName("lang") var lang: String? = null,
        @SerializedName("canBeUsedBonuses") var canBeUsedBonuses: Int? = null,
        @SerializedName("awardedBonuses") var awardedBonuses: Int? = null,
        @SerializedName("sumToPay") var sumToPay: Int? = null,
        @SerializedName("changeFrom") var changeFrom: String? = null,
        @SerializedName("deliveryTypePrice") var deliveryTypePrice: DeliveryTypePrice? = DeliveryTypePrice(),
        @SerializedName("packageItems") var packageItems: String? = null,
        @SerializedName("packageItemsPrice") var packageItemsPrice: Int? = null,
        @SerializedName("goalDiscounts") var goalDiscounts: ArrayList<String> = arrayListOf(),
        @SerializedName("user") var user: User? = User(),
        @SerializedName("promocode") var promocode: String? = null,
        @SerializedName("payCardId") var payCardId: String? = null,
        @SerializedName("saveCard") var saveCard: Boolean? = null,
        @SerializedName("stopListItems") var stopListItems: ArrayList<String> = arrayListOf(),
        @SerializedName("upsale") var upsale: ArrayList<String> = arrayListOf(),

        )

    data class Point(

        @SerializedName("pos") var pos: String? = null,

        )

    data class PostalCode(

        @SerializedName("PostalCodeNumber") var PostalCodeNumber: String? = null,

        )

    data class Premise(

        @SerializedName("PostalCode") var PostalCode: PostalCode? = PostalCode(),
        @SerializedName("PremiseNumber") var PremiseNumber: String? = null,

        )

    data class Product(

        @SerializedName("code") var code: String? = null,
        @SerializedName("name") var name: String? = null,
        @SerializedName("status") var status: String? = null,
        @SerializedName("description") var description: String? = null,
        @SerializedName("images") var images: ArrayList<String> = arrayListOf(),
        @SerializedName("carbohydrate") var carbohydrate: String? = null,
        @SerializedName("fat") var fat: String? = null,
        @SerializedName("fiber") var fiber: String? = null,
        @SerializedName("calories") var calories: String? = null,
        @SerializedName("weight") var weight: Int? = null,
        @SerializedName("volume") var volume: Int? = null,
        @SerializedName("price") var price: Int? = null,
        @SerializedName("priceBeforeDiscount") var priceBeforeDiscount: String? = null,
        @SerializedName("quantity") var quantity: String? = null,
        @SerializedName("ingredients") var ingredients: ArrayList<String> = arrayListOf(),
        @SerializedName("tags") var tags: ArrayList<String> = arrayListOf(),
        @SerializedName("sortIndex") var sortIndex: Int? = null,
        @SerializedName("categories") var categories: ArrayList<String> = arrayListOf(),
        @SerializedName("deliveryRestrictions") var deliveryRestrictions: ArrayList<String> = arrayListOf(),
        @SerializedName("updatedAt") var updatedAt: String? = null,
        @SerializedName("createdAt") var createdAt: String? = null,
        @SerializedName("modifications") var modifications: String? = null,
        @SerializedName("mainMeal") var mainMeal: Boolean? = null,
        @SerializedName("modificationValues") var modificationValues: String? = null,
        @SerializedName("toppingGroups") var toppingGroups: ArrayList<String> = arrayListOf(),
        @SerializedName("media") var media: ArrayList<String> = arrayListOf(),
        @SerializedName("descriptionRich") var descriptionRich: String? = null,
        @SerializedName("previewImage") var previewImage: String? = null,
        @SerializedName("minPrice") var minPrice: Int? = null,

        )

    data class Status(

        @SerializedName("code") var code: String? = null,
        @SerializedName("name") var name: String? = null,

        )

    data class Thoroughfare(

        @SerializedName("Premise") var Premise: Premise? = Premise(),
        @SerializedName("ThoroughfareName") var ThoroughfareName: String? = null,

        )

    data class User(

        @SerializedName("name") var name: String? = null,
        @SerializedName("phone") var phone: String? = null,
        @SerializedName("session") var session: String? = null,
        @SerializedName("phoneStatus") var phoneStatus: String? = null,
        @SerializedName("bonuses") var bonuses: Int? = null,
        @SerializedName("birthDate") var birthDate: String? = null,
        @SerializedName("instagram") var instagram: String? = null,
        @SerializedName("email") var email: String? = null,
        @SerializedName("bonusCardCode") var bonusCardCode: String? = null,

        )

    data class Yandex(

        @SerializedName("GeoObject") var GeoObject: GeoObject? = GeoObject(),

        )

    companion object {
        data class Address(

            @SerializedName("formatted") var formatted: String? = null,
            @SerializedName("Components") var Components: ArrayList<Components> = arrayListOf(),
            @SerializedName("postal_code") var postalCode: String? = null,
            @SerializedName("country_code") var countryCode: String? = null,

            )
    }
}
