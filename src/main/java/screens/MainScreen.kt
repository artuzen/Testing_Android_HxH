package screens

object MainScreen {

    val nonExistentButton = ScreenConstructor (
        androidAccessibilityId = "Zakuski",
        elementName = "Несуществующая кнопка на экране главного меню"
    )

    val tabSoup = ScreenConstructor (
        androidXpath = "//android.view.View[@content-desc=\"Супы\"]",
        elementName = "Кнопка Суп на экране главного меню"
    )

    val pumpkinSoup = ScreenConstructor (
        androidXpath = "//android.widget.ImageView[@content-desc=\"270 ₽\"]",
        elementName = "Тыквенный суп на экране главного меню"
    )

    val buttonProfile = ScreenConstructor (
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]",
        elementName = "Кнопка профиля"
    )

    val buttonMenu = ScreenConstructor (
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]",
        elementName = "Кнопка главного меню"
    )
}