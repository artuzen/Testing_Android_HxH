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

    fun checkAuthorizationPerson (): Boolean {
        return checkAvailableElement(
            locatorAndroid = "Тест1\n" +
                    "+7 (987) 991-59-81\n" +
                    "1",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "Тест1\n" +
                    "+7 (987) 991-59-81",
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = "Наименование авторизованного пользователя"
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