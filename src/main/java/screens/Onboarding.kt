package screens

import LocatorType
import TestFunctions.clickToElement

object Onboarding {

    fun clicksSelectLanguage () {
        clickToElement(
            locatorAndroid = "//android.view.View[@content-desc=\"Русский\"]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeStaticText[`label == \"Русский\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Выбор русского языка на экране онбординга"
        )
    }

    fun clicksButtonNext () {
        clickToElement(
            locatorAndroid = "Далее",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "**/XCUIElementTypeStaticText[`label == \"Далее\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Кнопка Далее на экране онбординга"
        )
    }

    fun clicksButtonNextWindow () {
        clickToElement(
            locatorAndroid = "",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "**/XCUIElementTypeStaticText[`label == \"Далее\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Кнопка Далее во всплывающем окне онбординга"
        )
    }

    fun clicksButtonAllow () {
        clickToElement(
            locatorAndroid = "",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "**/XCUIElementTypeOther[`label == \"Горизонтальная полоса прокрутки, 1 страница\"`][2]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Кнопка Разрешить во всплывающем окне онбординга"
        )
    }
}