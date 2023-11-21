package screens

import LocatorType
import TestFunctions.clickToElement

class MainScreen {

    fun clickTabSoup() {
        clickToElement(
        locatorAndroid = tabSoup.androidXpath,
        locatorTypeAndroid = LocatorType.XPATH,
        locatorIOS = tabSoup.iosClassChain,
        locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
        elementName = "Кнопка Суп на экране главного меню"
        )
    }

    fun clickShiSoup () {
        clickToElement(
            locatorAndroid = ShiSoup.androidXpath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = ShiSoup.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Щи на экране главного меню"
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
            elementName = "Кнопка главного меню"
        )
    }

    fun updateCategory(neededCategory: String){
        tabSoup.androidXpath = "//android.view.View[@content-desc=\"${neededCategory}\"]"
        tabSoup.iosClassChain = "**/XCUIElementTypeStaticText[`label == \"${neededCategory}\"`]"
    }

    fun updateSoup(priceSoup: Int) {
        ShiSoup.androidXpath = "//android.widget.ImageView[@content-desc=\"${priceSoup} ₽\"]"
        ShiSoup.iosClassChain = "**/XCUIElementTypeImage[`label == \"${priceSoup} ₽\"`]"
    }

    private val ShiSoup = ScreenConstructor (
        androidXpath = "",
        iosClassChain = "",
        elementName = "Щи на экране главного меню"
    )
    private val tabSoup = ScreenConstructor (
        androidXpath = "",
        iosClassChain = "",
        elementName = "Кнопка Супы"
    )

}