package screens

object MainScreen {

    val nonExistentButton = ScreenConstructor (
        androidAccessibilityId = "Zakuski",
        iosClassChain = "Zakuski",
        elementName = "Несуществующая кнопка на экране главного меню"
    )

    val tabSoup = ScreenConstructor (
        androidXpath = "//android.view.View[@content-desc=\"Супы\"]",
        iosAccessibilityId = "Супы",
        iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Супы\"`]",
        elementName = "Кнопка Суп на экране главного меню"
    )

    val pumpkinSoup = ScreenConstructor (
        androidXpath = "//android.widget.ImageView[@content-desc=\"270 ₽\"]",
        iosClassChain = "**/XCUIElementTypeImage[`label == \"270 ₽\"`]",
        elementName = "Тыквенный суп на экране главного меню"
    )

    val buttonProfile = ScreenConstructor (
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]",
        iosClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]",
        elementName = "Кнопка профиля"
    )

    val buttonMenu = ScreenConstructor (
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]",
        iosClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]",
        elementName = "Кнопка главного меню"
    )
}