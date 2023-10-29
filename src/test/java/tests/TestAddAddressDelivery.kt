package tests

import LocatorType
import MainActivity
import TestFunctions.clickToElement
import TestFunctions.findElement
import TestFunctions.sendText
import TestFunctions.tapByCoordinates
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import general_cases_for_test.SwipeElementCentreToLeft.swipeElementCentreToLeft
import general_cases_for_test.SwipeElementUpToDown.swipeElementUpToDown
import org.testng.annotations.Test
import screens.DeliveryScreen
import screens.DeliveryScreen.buttonAddAddress
import screens.DeliveryScreen.buttonCross
import screens.DeliveryScreen.buttonSafe
import screens.DeliveryScreen.buttonUseDoNotAllow
import screens.DeliveryScreen.deleteAddedAddress
import screens.DeliveryScreen.myAddress
import screens.DeliveryScreen.myFullAddress
import screens.DeliveryScreen.screenMyAddress
import screens.DeliveryScreen.sendAddress
import screens.DeliveryScreen.windowApartment
import screens.DeliveryScreen.windowEntrance
import screens.DeliveryScreen.windowFloor
import screens.DeliveryScreen.windowIntercom
import screens.MainScreen.buttonMenu
import screens.MainScreen.buttonProfile
import screens.ProfileScreen.buttonMyAddress
import java.util.concurrent.TimeUnit

class TestAddAddressDelivery : MainActivity(){

    @Test
    fun test1() {
        checkAuthorizationUser(true)

        clickToElement(
            buttonProfile.androidXpath,
            LocatorType.XPATH)
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            buttonMyAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(10)

        try {
            deleteAddress()
            TimeUnit.SECONDS.sleep(5)
        } catch (_: Exception){ }

        clickToElement(
            buttonAddAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(10)

        try {
            clickToElement(
                buttonUseDoNotAllow.androidXpath,
                LocatorType.XPATH)
            TimeUnit.SECONDS.sleep(10)
        } catch (_: Exception){ }

        clickToElement(
            buttonAddAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            sendAddress.androidClassName,
            LocatorType.CLASS_NAME
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            buttonCross.androidXpath,
            LocatorType.XPATH)
        TimeUnit.SECONDS.sleep(5)

        sendText(
            sendAddress.androidClassName,
            LocatorType.CLASS_NAME,
            myAddress.androidAccessibilityId)
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            myAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(5)

        addFullAddress()

        clickToElement(
            buttonSafe.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID
        )
        TimeUnit.SECONDS.sleep(5)

        try {
            deleteAddress()
            TimeUnit.SECONDS.sleep(5)
        } catch (_: Exception){ }

        swipeElementUpToDown(
            screenMyAddress.androidXpath,
            LocatorType.XPATH
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            buttonMenu.androidXpath,
            LocatorType.XPATH)
        TimeUnit.SECONDS.sleep(5)
    }

    private fun addFullAddress(){

        clickToElement(
            windowApartment.androidXpath,
            LocatorType.XPATH
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            windowApartment.androidXpath,
            LocatorType.XPATH,
            "17"
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            windowEntrance.androidXpath,
            LocatorType.XPATH
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            windowEntrance.androidXpath,
            LocatorType.XPATH,
            "1"
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            windowIntercom.androidXpath,
            LocatorType.XPATH
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            windowIntercom.androidXpath,
            LocatorType.XPATH,
            "17"
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            DeliveryScreen.windowComment.androidXpath,
            LocatorType.XPATH
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            DeliveryScreen.windowComment.androidXpath,
            LocatorType.XPATH,
            "Привезите быстрее, хочу кушать"
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            windowFloor.androidXpath,
            LocatorType.XPATH
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            windowFloor.androidXpath,
            LocatorType.XPATH,
            "5"
        )
        TimeUnit.SECONDS.sleep(5)
    }

    private fun deleteAddress (){

        swipeElementCentreToLeft(
            myFullAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID
        )
        TimeUnit.SECONDS.sleep(5)

        val element = findElement(
            deleteAddedAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID
        )

        tapByCoordinates(
            element.size.width - 200,
            element.size.height + 200
        )
        TimeUnit.SECONDS.sleep(5)
    }
}