package general_cases_for_test

import LocatorType
import TestFunctions.clickToElement
import TestFunctions.sendText
import TestFunctions.tapByCoordinates
import screens.DeliveryScreen.windowApartment
import screens.DeliveryScreen.windowComment
import screens.DeliveryScreen.windowEntrance
import screens.DeliveryScreen.windowFloor
import screens.DeliveryScreen.windowIntercom
import java.util.concurrent.TimeUnit

object AddFullAddress {

    fun addFullAddress(){

        tapByCoordinates(
            500,
            1300
        )
        TimeUnit.SECONDS.sleep(10)

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
            windowComment.androidXpath,
            LocatorType.XPATH
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            windowComment.androidXpath,
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
}