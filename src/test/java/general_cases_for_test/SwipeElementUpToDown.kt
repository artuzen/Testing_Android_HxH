package general_cases_for_test

import LocatorType
import TestFunctions.findElement
import TestFunctions.swipeOnScreen

object SwipeElementUpToDown {

    fun swipeElementUpToDown (locator : String, locatorType: LocatorType) {
        val element = findElement(locator, locatorType)
        val point = element.location
        val size = element.size

        swipeOnScreen(
            point.x + size.width/2,
            point.y,
            point.x + size.width/2,
            point.y + size.height
        )
    }
}