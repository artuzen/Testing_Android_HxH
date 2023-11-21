package general_cases_for_test

import api_client.requests.user.UserInformation
import screens.DeliveryScreen
import java.util.concurrent.TimeUnit

object DeleteAddress {

    fun deleteAddress (){

        val deliveryScreen = DeliveryScreen()

        var i = 0
        while (UserInformation.resBody.addresses.size >= i) {
            if (UserInformation.resBody.addresses[i].street == "улица Радищева, 35"){
                deliveryScreen.updateAddress(
                    UserInformation.resBody.addresses[i].street,
                    UserInformation.resBody.addresses[i].flat,
                    UserInformation.resBody.addresses[i].floor,
                    UserInformation.resBody.addresses[i].entrance,
                    UserInformation.resBody.addresses[i].doorphone,
                    UserInformation.resBody.addresses[i].comment
                )
                break
            }
            i++
        }
        deliveryScreen.swipeMyFullAddressToLeft (findElementWithoutCatching = true)
        TimeUnit.SECONDS.sleep(5)

        deliveryScreen.clickButtonDeleteAddedAddress ()
        TimeUnit.SECONDS.sleep(5)
    }
}