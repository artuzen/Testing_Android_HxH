package general_cases_for_test

import screens.DeliveryScreen.clickButtonDeleteAddedAddress
import screens.DeliveryScreen.swipeMyFullAddressToLeft
import java.util.concurrent.TimeUnit

object DeleteAddress {

    fun deleteAddress (){

        swipeMyFullAddressToLeft ()
        TimeUnit.SECONDS.sleep(5)

        clickButtonDeleteAddedAddress ()
        TimeUnit.SECONDS.sleep(5)
    }
}