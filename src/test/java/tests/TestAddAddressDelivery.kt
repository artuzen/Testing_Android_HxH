package tests

import MainActivity
import general_cases_for_test.AddFullAddress.addFullAddress
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import general_cases_for_test.DeleteAddress.deleteAddress
import org.testng.annotations.Test
import screens.DeliveryScreen.clickButtonAddAddress
import screens.DeliveryScreen.clickButtonCross
import screens.DeliveryScreen.clickButtonSafe
import screens.DeliveryScreen.clickButtonUseDoNotAllow
import screens.DeliveryScreen.clickMyAddress
import screens.DeliveryScreen.clickSendAddress
import screens.DeliveryScreen.sendTextSendAddress
import screens.DeliveryScreen.swipeScreenMyAddressDown
import screens.MainScreen.clickButtonMenu
import screens.MainScreen.clickButtonProfile
import screens.ProfileScreen.clickButtonMyAddress
import java.util.concurrent.TimeUnit

class TestAddAddressDelivery : MainActivity(){

    @Test
    fun test1() {
        checkAuthorizationUser(true)

        clickButtonProfile()
        TimeUnit.SECONDS.sleep(5)

        clickButtonMyAddress ()
        TimeUnit.SECONDS.sleep(10)

        try {
            while (true) {deleteAddress() }
        } catch (_: Exception){ }

        clickButtonAddAddress ()
        TimeUnit.SECONDS.sleep(10)

        try {
            clickButtonUseDoNotAllow ()
            TimeUnit.SECONDS.sleep(10)
        } catch (_: Exception){ }

        clickButtonAddAddress ()
        TimeUnit.SECONDS.sleep(5)

        clickSendAddress ()
        TimeUnit.SECONDS.sleep(5)

        clickButtonCross ()
        TimeUnit.SECONDS.sleep(5)

        sendTextSendAddress ("улица Радищева, 35, Санкт-Петербург")
        TimeUnit.SECONDS.sleep(5)

        clickMyAddress ()
        TimeUnit.SECONDS.sleep(15)

        addFullAddress()

        clickButtonSafe ()
        TimeUnit.SECONDS.sleep(5)

        try {
            while (true) {deleteAddress() }
        } catch (_: Exception){ }

        swipeScreenMyAddressDown ()
        TimeUnit.SECONDS.sleep(5)

        clickButtonMenu()
        TimeUnit.SECONDS.sleep(5)
    }
}