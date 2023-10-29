package screens

object ProfileScreen {

    val buttonEnter = ScreenConstructor (
        androidAccessibilityId = "Войти",
        elementName = "Кнопка Войти на экране профиля"
    )

    val authorizationPerson = ScreenConstructor (
        androidAccessibilityId = "Тест1\n" +
                "+7 (987) 991-59-81\n" +
                "1",
        elementName = "Наименование авторизованного пользователя"
    )

    val buttonExit = ScreenConstructor (
        androidAccessibilityId = "Выйти",
        elementName = "Кнопка Выйти из профиля"
    )

    val buttonMyAddress = ScreenConstructor (
        androidAccessibilityId = "Мои адреса",
        elementName = "Кнопка Мои адреса на экране профиля"
    )
}