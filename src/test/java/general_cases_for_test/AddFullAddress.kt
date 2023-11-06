package general_cases_for_test

import screens.DeliveryScreen.sendWindowApartment
import screens.DeliveryScreen.sendWindowComment
import screens.DeliveryScreen.sendWindowEntrance
import screens.DeliveryScreen.sendWindowFloor
import screens.DeliveryScreen.sendWindowIntercom
import java.util.concurrent.TimeUnit

object AddFullAddress {

    fun addFullAddress(){

        sendWindowApartment ("17")
        TimeUnit.SECONDS.sleep(5)

        sendWindowEntrance ("1")
        TimeUnit.SECONDS.sleep(5)

        sendWindowIntercom ("17")
        TimeUnit.SECONDS.sleep(5)

        sendWindowComment ("Привезите быстрее, хочу кушать")
        TimeUnit.SECONDS.sleep(5)

        sendWindowFloor ("5")
        TimeUnit.SECONDS.sleep(5)
    }
}