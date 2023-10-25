package screens

object AuthorizationScreen {

    val enterPhone = ScreenConstructor (
        androidXpath = "//android.view.View[@content-desc=\"Укажите телефон\n" +
                "На него отправим код подтверждения\"]/android.widget.EditText",
        elementName = "Поле указание номера отправления кода для авторизации"
    )

    val buttonGetCode = ScreenConstructor (
        androidAccessibilityId = "Получить код",
        elementName = "Кнопка получения кода авторизации"
    )

    val enterCode = ScreenConstructor (
        androidClassName = "android.widget.EditText",
        elementName = "Поле ввода кода авторизации"
    )


}