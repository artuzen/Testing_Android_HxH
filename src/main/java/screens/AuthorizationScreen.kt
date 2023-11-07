package screens

import LocatorType
import TestFunctions.clickToElement
import TestFunctions.sendText


class AuthorizationScreen {

    fun sendEnterPhone(text: String) {
        sendText(
            locatorAndroid = "//android.view.View[@content-desc=\"Укажите телефон\n" +
                   "На него отправим код подтверждения\"]/android.widget.EditText",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "XCUIElementTypeTextField",
            locatorTypeIOS = LocatorType.CLASS_NAME,
            text = text,
            elementName = "Поле указание номера отправления кода для авторизации"
        )
    }

    fun clickButtonGetCode() {
        clickToElement(
            locatorAndroid = "Получить код",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "**/XCUIElementTypeStaticText[`label == \"Получить код\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Кнопка получения кода авторизации"
        )
    }

    fun sendEnterCode(text: String) {
        sendText(
            locatorAndroid = "android.widget.EditText",
            locatorTypeAndroid = LocatorType.CLASS_NAME,
            locatorIOS = "XCUIElementTypeTextField",
            locatorTypeIOS = LocatorType.CLASS_NAME,
            text = text,
            elementName = "Поле ввода кода авторизации"
        )
    }
}