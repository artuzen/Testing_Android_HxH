package screens

object Onboarding {

    val selectLanguage = ScreenConstructor(
        androidXpath = "//android.view.View[@content-desc=\"Русский\"]",
        elementName = "Выбор русского языка на экране онбординга"
    )

    val buttonNext = ScreenConstructor(
        androidAccessibilityId = "Далее",
        elementName = "Кнопка Далее на экране онбординга"
    )
}