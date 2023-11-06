package screens

import LocatorType
import TestFunctions.clickToElement

object DeliveryMethod {

    fun clickButtonPickup () {
        clickToElement(
            locatorAndroid = "Самовывоз",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "**/XCUIElementTypeOther[`label == \"Самовывоз\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Кнопка Самовывоз на экране выбора способа доставки"
        )
    }
}