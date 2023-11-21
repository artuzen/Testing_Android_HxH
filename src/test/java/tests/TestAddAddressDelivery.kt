package tests

import MainActivity
import general_cases_for_test.AddFullAddress.addFullAddress
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import general_cases_for_test.DeleteAddress.deleteAddress
import io.qameta.allure.Description
import org.testng.annotations.Test
import screens.DeliveryScreen
import screens.MainScreen
import screens.ProfileScreen
import java.util.concurrent.TimeUnit

class TestAddAddressDelivery : MainActivity(){

    @Description("Тест на добавление и удаление адреса в профиле человека")
    @Test(description = "Работа с адресом")
    fun test1() {
        checkAuthorizationUser(true)

        val mainScreen = MainScreen()
        val profileScreen = ProfileScreen()
        val deliveryScreen = DeliveryScreen()

        mainScreen.clickButtonProfile()
        TimeUnit.SECONDS.sleep(5)

        profileScreen.clickButtonMyAddress ()
        TimeUnit.SECONDS.sleep(10)

        try {
            while (true) {deleteAddress() }
        } catch (_: Exception){ }

        deliveryScreen.clickButtonAddAddress ()
        TimeUnit.SECONDS.sleep(10)

        try {
            deliveryScreen.clickButtonUseDoNotAllow (findElementWithoutCatching = true)
            TimeUnit.SECONDS.sleep(10)
        } catch (_: Exception){ }

        deliveryScreen.clickButtonAddAddress ()
        TimeUnit.SECONDS.sleep(5)

        deliveryScreen.clickSendAddress ()
        TimeUnit.SECONDS.sleep(5)

        deliveryScreen.clickButtonCross ()
        TimeUnit.SECONDS.sleep(5)

        deliveryScreen.sendTextSendAddress ("улица Радищева, 35, Санкт-Петербург")
        TimeUnit.SECONDS.sleep(5)

        deliveryScreen.clickMyAddress ()
        TimeUnit.SECONDS.sleep(15)

        addFullAddress()

        deliveryScreen.clickButtonSafe ()
        TimeUnit.SECONDS.sleep(5)

        try {
            while (true) {deleteAddress() }
        } catch (_: Exception){ }

        deliveryScreen.swipeScreenMyAddressDown ()
        TimeUnit.SECONDS.sleep(5)

        mainScreen.clickButtonMenu()
        TimeUnit.SECONDS.sleep(5)
    }
}