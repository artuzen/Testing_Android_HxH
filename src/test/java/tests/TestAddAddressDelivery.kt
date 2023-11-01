package tests

import LocatorType
import MainActivity
import TestFunctions.clickToElement
import TestFunctions.sendText
import general_cases_for_test.AddFullAddress.addFullAddress
import general_cases_for_test.AuthorizationScenarios.checkAuthorizationUser
import general_cases_for_test.DeleteAddress.deleteAddress
import general_cases_for_test.SwipeElementUpToDown.swipeElementUpToDown
import org.testng.annotations.Test
import screens.DeliveryScreen.buttonAddAddress
import screens.DeliveryScreen.buttonCross
import screens.DeliveryScreen.buttonSafe
import screens.DeliveryScreen.buttonUseDoNotAllow
import screens.DeliveryScreen.myAddress
import screens.DeliveryScreen.screenMyAddress
import screens.DeliveryScreen.sendAddress
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
            LocatorType.XPATH,
            buttonProfile.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            buttonMyAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID,
            buttonMyAddress.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(10)

        try {
            while (true) {deleteAddress() }
        } catch (_: Exception){ }

        clickToElement(
            buttonAddAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID,
            buttonAddAddress.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(10)

        try {
            clickToElement(
                buttonUseDoNotAllow.androidXpath,
                LocatorType.XPATH,
                buttonUseDoNotAllow.iosClassChain,
                LocatorType.IOS_CLASS_CHAIN
            )
            TimeUnit.SECONDS.sleep(10)
        } catch (_: Exception){ }

        clickToElement(
            buttonAddAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID,
            buttonAddAddress.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            sendAddress.androidClassName,
            LocatorType.CLASS_NAME,
            sendAddress.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            buttonCross.androidXpath,
            LocatorType.XPATH,
            buttonCross.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(5)

        sendText(
            sendAddress.androidClassName,
            LocatorType.CLASS_NAME,
            sendAddress.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN,
            myAddress.androidAccessibilityId)
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            myAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID,
            myAddress.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(15)

        addFullAddress()

        clickToElement(
            buttonSafe.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID,
            buttonSafe.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(5)

        try {
            while (true) {deleteAddress() }
        } catch (_: Exception){ }

        swipeElementUpToDown(
            screenMyAddress.androidXpath,
            LocatorType.XPATH,
            screenMyAddress.iosPredicate,
            LocatorType.IOS_PREDICATE_STRING
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            buttonMenu.androidXpath,
            LocatorType.XPATH,
            buttonMenu.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN)
        TimeUnit.SECONDS.sleep(5)
    }
}