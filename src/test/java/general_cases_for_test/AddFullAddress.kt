package general_cases_for_test

import screens.DeliveryScreen
import java.util.concurrent.TimeUnit

object AddFullAddress {

    fun addFullAddress(){
        val deliveryScreen = DeliveryScreen()

        deliveryScreen.sendWindowApartment ("17")
        TimeUnit.SECONDS.sleep(5)

        deliveryScreen.sendWindowEntrance ("1")
        TimeUnit.SECONDS.sleep(5)

        deliveryScreen.sendWindowIntercom ("17")
        TimeUnit.SECONDS.sleep(5)

        deliveryScreen.sendWindowComment ("Привезите быстрее, хочу кушать")
        TimeUnit.SECONDS.sleep(5)

        deliveryScreen.sendWindowFloor ("5")
        TimeUnit.SECONDS.sleep(5)
    }
}