package general_cases_for_test

import GlobalVariable.platformType
import LocatorType
import TestFunctions.findElement
import TestFunctions.swipeOnScreen
import TypeOS

object SwipeElementCentreToLeft {

    fun swipeElementCentreToLeft (
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType
    ) {

        val element  = if (platformType == TypeOS.IOS) {
            findElement(locatorIOS, locatorTypeIOS)
        } else {
            findElement(locatorAndroid, locatorTypeAndroid)
        }

        val point = element.location
        val size = element.size

        swipeOnScreen(
            point.x + size.width/2,
            point.y + size.height/2,
            point.x,
            point.y + size.height/2
        )
    }
}