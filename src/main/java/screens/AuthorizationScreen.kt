package screens

object AuthorizationScreen {

    val enterPhone = ScreenConstructor (
        androidXpath = "//android.view.View[@content-desc=\"Укажите телефон\n" +
                "На него отправим код подтверждения\"]/android.widget.EditText",
        iosClassName = "XCUIElementTypeTextField",
        iosXpath = "//XCUIElementTypeApplication[@name=\"School\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField",
        elementName = "Поле указание номера отправления кода для авторизации"
    )

    val buttonGetCode = ScreenConstructor (
        androidAccessibilityId = "Получить код",
        iosAccessibilityId = "Получить код",
        iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Получить код\"`]",
        elementName = "Кнопка получения кода авторизации"
    )

    val enterCode = ScreenConstructor (
        androidClassName = "android.widget.EditText",
        iosClassName = "XCUIElementTypeTextField",
        elementName = "Поле ввода кода авторизации"
    )


}