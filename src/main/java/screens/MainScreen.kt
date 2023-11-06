package screens

import LocatorType
import TestFunctions.clickToElement

object MainScreen {

    fun clickNonExistentButton () {
        clickToElement(
            locatorAndroid = "Zakuski",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "Zakuski",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Несуществующая кнопка на экране главного меню"

        )
    }

    fun clickTabSoup() {
        clickToElement(
        locatorAndroid = "//android.view.View[@content-desc=\"Супы\"]",
        locatorTypeAndroid = LocatorType.XPATH,
        locatorIOS = "**/XCUIElementTypeStaticText[`label == \"Супы\"`]",
        locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
        elementName = "Кнопка Суп на экране главного меню"
        )
    }

    fun clickPumpkinSoup () {
        clickToElement(
            locatorAndroid = "//android.widget.ImageView[@content-desc=\"270 ₽\"]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeImage[`label == \"270 ₽\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Тыквенный суп на экране главного меню"
        )
    }

    fun clickButtonProfile (){
        clickToElement(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Кнопка профиля"
        )
    }

    fun clickButtonMenu (){
        clickToElement(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "ККнопка главного меню"
        )
    }

}