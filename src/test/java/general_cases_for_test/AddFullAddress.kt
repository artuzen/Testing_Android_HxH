package general_cases_for_test

import LocatorType
import TestFunctions.clickToElement
import TestFunctions.sendText
import screens.DeliveryScreen.windowApartment
import screens.DeliveryScreen.windowComment
import screens.DeliveryScreen.windowEntrance
import screens.DeliveryScreen.windowFloor
import screens.DeliveryScreen.windowIntercom
import java.util.concurrent.TimeUnit

object AddFullAddress {

    fun addFullAddress(){

        clickToElement(
            windowApartment.androidXpath,
            LocatorType.XPATH,
            windowApartment.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            windowApartment.androidXpath,
            LocatorType.XPATH,
            windowApartment.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN,
            "17"
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            windowEntrance.androidXpath,
            LocatorType.XPATH,
            windowEntrance.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            windowEntrance.androidXpath,
            LocatorType.XPATH,
            windowEntrance.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN,
            "1"
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            windowIntercom.androidXpath,
            LocatorType.XPATH,
            windowIntercom.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            windowIntercom.androidXpath,
            LocatorType.XPATH,
            windowIntercom.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN,
            "17"
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            windowComment.androidXpath,
            LocatorType.XPATH,
            windowComment.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            windowComment.androidXpath,
            LocatorType.XPATH,
            windowComment.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN,
            "Привезите быстрее, хочу кушать"
        )
        TimeUnit.SECONDS.sleep(5)

        clickToElement(
            windowFloor.androidXpath,
            LocatorType.XPATH,
            windowFloor.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            windowFloor.androidXpath,
            LocatorType.XPATH,
            windowFloor.iosClassChain,
            LocatorType.IOS_CLASS_CHAIN,
            "5"
        )
        TimeUnit.SECONDS.sleep(5)
    }
}