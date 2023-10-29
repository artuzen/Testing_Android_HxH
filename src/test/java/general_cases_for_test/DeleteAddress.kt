package general_cases_for_test

import LocatorType
import TestFunctions.findElement
import TestFunctions.tapByCoordinates
import general_cases_for_test.SwipeElementCentreToLeft.swipeElementCentreToLeft
import screens.DeliveryScreen.deleteAddedAddress
import screens.DeliveryScreen.myFullAddress
import java.util.concurrent.TimeUnit

object DeleteAddress {

    fun deleteAddress (){

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