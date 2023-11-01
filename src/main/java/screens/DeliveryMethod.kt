package screens

object DeliveryMethod {

    val buttonPickup = ScreenConstructor (
        androidAccessibilityId = "Самовывоз",
        iosAccessibilityId = "Самовывоз",
        iosClassChain = "**/XCUIElementTypeOther[`label == \"Самовывоз\"`]",
        elementName = "Кнопка Самовывоз на экране выбора способа доставки"
    )
}