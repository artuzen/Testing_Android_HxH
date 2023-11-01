package screens

object ProfileScreen {

    val buttonEnter = ScreenConstructor (
        androidAccessibilityId = "Войти",
        iosAccessibilityId = "Войти",
        iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Войти\"`]",
        elementName = "Кнопка Войти на экране профиля"
    )

    val authorizationPerson = ScreenConstructor (
        androidAccessibilityId = "Тест1\n" +
                "+7 (987) 991-59-81\n" +
                "1",
        iosAccessibilityId = "Тест1\n" +
                "+7 (987) 991-59-81\n" +
                "1",
        iosClassChain = "**/XCUIElementTypeImage[`label == \"Тест1\n" +
                "+7 (987) 991-59-81\n" +
                "1\"`]",
        elementName = "Наименование авторизованного пользователя"
    )

    val buttonExit = ScreenConstructor (
        androidAccessibilityId = "Выйти",
        iosAccessibilityId = "Выйти",
        iosClassChain = "**/XCUIElementTypeImage[`label == \"Выйти\"`]",
        elementName = "Кнопка Выйти из профиля"
    )

    val buttonMyAddress = ScreenConstructor (
        androidAccessibilityId = "Мои адреса",
        iosAccessibilityId = "Мои адреса",
        iosClassChain = "**/XCUIElementTypeImage[`label == \"Мои адреса\"`]",
        elementName = "Кнопка Мои адреса на экране профиля"
    )
}