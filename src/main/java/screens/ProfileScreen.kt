package screens

import LocatorType
import TestFunctions.checkAvailableElement
import TestFunctions.clickToElement

class ProfileScreen {

    fun clickButtonEnter () {
        clickToElement(
            locatorAndroid = "Войти",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "Войти",
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = "Кнопка Войти на экране профиля"
        )
    }

    fun checkAuthorizationPerson (findElementWithoutCatching: Boolean = false): Boolean {
        return checkAvailableElement(
            locatorAndroid = "Выйти",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "Выйти",
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = "Наименование авторизованного пользователя",
            findElementWithoutCatching =findElementWithoutCatching
        )
    }

    fun clickButtonExit () {
        clickToElement(
            locatorAndroid = "Выйти",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "Выйти",
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = "Кнопка Выйти из профиля"
        )
    }

    fun clickButtonMyAddress () {
        clickToElement(
            locatorAndroid = "Мои адреса",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "**/XCUIElementTypeImage[`label == \"Мои адреса\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Кнопка Мои адреса на экране профиля"
        )
    }
}