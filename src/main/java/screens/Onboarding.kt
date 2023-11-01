package screens

object Onboarding {

    val selectLanguage = ScreenConstructor(
        androidXpath = "//android.view.View[@content-desc=\"Русский\"]",
        iosAccessibilityId = "Русский",
        iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Русский\"`]",
        elementName = "Выбор русского языка на экране онбординга"
    )

    val buttonNext = ScreenConstructor(
        androidAccessibilityId = "Далее",
        iosAccessibilityId = "ДалееД",
        iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Далее\"`]",
        elementName = "Кнопка Далее на экране онбординга"
    )

    val buttonNextWindow = ScreenConstructor (
        androidXpath = "",
        iosAccessibilityId = "Далее",
        iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Далее\"`]",
        elementName = "Кнопка Далее во всплывающем окне онбординга"
    )

    val buttonAllow = ScreenConstructor (
        androidXpath = "",
        iosClassChain = "**/XCUIElementTypeOther[`label == \"Горизонтальная полоса прокрутки, 1 страница\"`][2]",
        elementName = "Кнопка Разрешить во всплывающем окне онбординга"
    )
}