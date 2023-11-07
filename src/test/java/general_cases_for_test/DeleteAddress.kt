package general_cases_for_test

import screens.DeliveryScreen
import java.util.concurrent.TimeUnit

object DeleteAddress {

    fun deleteAddress (){

        val deliveryScreen = DeliveryScreen()

        deliveryScreen.swipeMyFullAddressToLeft ()
        TimeUnit.SECONDS.sleep(5)

        deliveryScreen.clickButtonDeleteAddedAddress ()
        TimeUnit.SECONDS.sleep(5)
    }
}