package screens

import GlobalVariable.platformType
import LocatorType
import TestFunctions.clickToElement
import TestFunctions.findElement
import TestFunctions.sendText
import TestFunctions.swipeOnScreen
import TestFunctions.tapByCoordinates
import TypeOS
import java.util.concurrent.TimeUnit

class DeliveryScreen {

    fun clickButtonAddAddress () {
        clickToElement(
            locatorAndroid = "Добавить новый адрес",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "**/XCUIElementTypeImage[`label == \"Добавить новый адрес\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Кнопка Добавить адрес на экране Доставки"
        )
    }

    fun clickSendAddress () {
        clickToElement(
            locatorAndroid = "android.widget.EditText",
            locatorTypeAndroid = LocatorType.CLASS_NAME,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Адрес\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Окно ввода адреса"
        )
    }

    fun sendTextSendAddress (text: String) {
        sendText(
            locatorAndroid = "android.widget.EditText",
            locatorTypeAndroid = LocatorType.CLASS_NAME,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Адрес\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            text = text,
            elementName = "Окно ввода адреса"
        )
    }

    fun sendWindowApartment (text: String) {
        clickToElement(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Квартира\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Окно ввода квартиры"
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Квартира\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            text = text,
            elementName = "Окно ввода квартиры"
        )
    }

    fun sendWindowEntrance (text: String) {
        clickToElement(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Подъезд\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Окно ввода подьезда"
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Подъезд\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            text = text,
            elementName = "Окно ввода подьезда"
        )
    }

    fun sendWindowIntercom (text: String) {
        clickToElement(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Домофон\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Окно ввода домофона"
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Домофон\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            text = text,
            elementName = "Окно ввода домофона"
        )
    }

    fun sendWindowFloor (text: String) {
        clickToElement(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[4]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Этаж\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Окно ввода этажа"
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[4]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Этаж\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            text = text,
            elementName = "Окно ввода этажа"
        )
    }

    fun sendWindowComment (text: String) {
        clickToElement(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[5]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Комментарий для курьера\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Окно ввода коментария"
        )
        TimeUnit.SECONDS.sleep(5)
        sendText(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[5]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeTextField[`label == \"Комментарий для курьера\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            text = text,
            elementName = "Окно ввода коментария"
        )
    }

    fun clickButtonSafe () {
        clickToElement(
            locatorAndroid = "Сохранить",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "**/XCUIElementTypeStaticText[`label == \"Сохранить\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Кнопка сохранить в добавлении адреса"
        )
    }

    fun clickButtonUseDoNotAllow (findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeOther[`label == \"Горизонтальная полоса прокрутки, 1 страница\"`][2]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Кнопка Don't allow",
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickButtonCross () {
        clickToElement(
            locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.EditText/android.widget.ImageView",
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Удаление адреса"
        )
    }

    fun clickMyAddress () {
        clickToElement(
            locatorAndroid = "улица Радищева, 35, Санкт-Петербург",
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = "**/XCUIElementTypeStaticText[`label == \"улица Радищева, 35, Санкт-Петербург\"`]",
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = "Выбор нужного адреса"
        )
    }

    fun swipeMyFullAddressToLeft (findElementWithoutCatching: Boolean = false) {
        val locatorAndroid = myFullAddress.androidAccessibilityId
        val locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID
        val locatorIOS = myFullAddress.iosAccessibilityId
        val locatorTypeIOS = LocatorType.ACCESSIBILITY_ID

        val element  = if (platformType == TypeOS.IOS) {
            findElement(locatorIOS, locatorTypeIOS, findElementWithoutCatching)
        } else {
            findElement(locatorAndroid, locatorTypeAndroid, findElementWithoutCatching)
        }

        val point = element.location
        val size = element.size

        swipeOnScreen(
            point.x + size.width/2,
            point.y + size.height/2,
            point.x,
            point.y + size.height/2
        )
    }

    fun swipeScreenMyAddressDown () {
        val locatorAndroid = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View"
        val locatorTypeAndroid = LocatorType.XPATH
        val locatorIOS = "type == \"XCUIElementTypeScrollView\""
        val locatorTypeIOS = LocatorType.IOS_PREDICATE_STRING

        val element  = if (platformType == TypeOS.IOS) {
            findElement(locatorIOS, locatorTypeIOS)
        } else {
            findElement(locatorAndroid, locatorTypeAndroid)
        }

        val point = element.location
        val size = element.size

        swipeOnScreen(
            point.x + size.width/2,
            point.y + 15,
            point.x + size.width/2,
            point.y + size.height
        )
    }

    fun clickButtonDeleteAddedAddress () {
        val locatorAndroid = "Удалить"
        val locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID
        val locatorIOS = "Удалить"
        val locatorTypeIOS = LocatorType.ACCESSIBILITY_ID

        val element  = if (platformType == TypeOS.IOS) {
            findElement(locatorIOS, locatorTypeIOS)
        } else {
            findElement(locatorAndroid, locatorTypeAndroid)
        }

        tapByCoordinates(
            element.size.width - 10,
            element.location.y + 10

        )
    }

    fun updateAddress(
        street: String?, flat: String?, floor: String?,
        entrance: String?, doorphone: String?, comment: String?
    ) {
        myFullAddress.androidAccessibilityId = "${street}\n" +
                "кв ${flat}, ${entrance} подъезд, ${floor} этаж. Домофон: ${doorphone}. ${comment}"
        myFullAddress.iosAccessibilityId = "${street}\n" +
                "кв ${flat}, ${entrance} подъезд, ${floor} этаж. Домофон: ${doorphone}. ${comment}"
    }

    private val myFullAddress = ScreenConstructor (
        androidAccessibilityId = "",
        iosAccessibilityId = "",
        elementName = "Мой полный адрес"

    )
}