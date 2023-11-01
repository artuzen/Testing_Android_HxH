package general_cases_for_test

import GlobalVariable.platformType
import LocatorType
import TestFunctions.findElement
import TestFunctions.tapByCoordinates
import TypeOS
import general_cases_for_test.SwipeElementCentreToLeft.swipeElementCentreToLeft
import screens.DeliveryScreen.deleteAddedAddress
import screens.DeliveryScreen.myFullAddress
import java.util.concurrent.TimeUnit

object DeleteAddress {

    fun deleteAddress (){

        swipeElementCentreToLeft(
            myFullAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID,
            myFullAddress.iosAccessibilityId,
            LocatorType.ACCESSIBILITY_ID
        )
        TimeUnit.SECONDS.sleep(5)

       /* clickToElement(
            deleteAddedAddress.androidAccessibilityId,
            LocatorType.ACCESSIBILITY_ID,
            deleteAddedAddress.iosAccessibilityId,
            LocatorType.ACCESSIBILITY_ID)*/

        val element  = if (platformType == TypeOS.IOS) {
            findElement(
                deleteAddedAddress.iosAccessibilityId,
                LocatorType.ACCESSIBILITY_ID
            )
        } else {
            findElement(
                deleteAddedAddress.androidAccessibilityId,
                LocatorType.ACCESSIBILITY_ID
            )
        }

        tapByCoordinates(
            element.size.width - 10,
            element.location.y + 10

        )

        TimeUnit.SECONDS.sleep(5)
    }
}