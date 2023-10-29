package screens

object DeliveryScreen {

    val buttonAddAddress = ScreenConstructor (
        androidAccessibilityId = "Добавить новый адрес",
        elementName = "Кнопка Добавить адрес на экране Доставки"
    )

    val sendAddress = ScreenConstructor (
        androidClassName = "android.widget.EditText",
        elementName = "Окно ввода адреса"
    )

    val windowApartment = ScreenConstructor (
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]",
        elementName = "Окно ввода квартиры"
    )

    val windowEntrance = ScreenConstructor (
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]",
        elementName = "Окно ввода подьезда"
    )

    val windowIntercom = ScreenConstructor (
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]",
        elementName = "Окно ввода домофона"
    )

    val windowFloor = ScreenConstructor (
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[4]",
        elementName = "Окно ввода этажа"
    )

    val windowComment = ScreenConstructor (
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[5]",
        elementName = "Окно ввода коментария"
    )

    val buttonSafe = ScreenConstructor (
        androidAccessibilityId = "Сохранить",
        elementName = "Кнопка сохранить в добавлении адреса"
    )

    val buttonUseDoNotAllow = ScreenConstructor (
        androidAccessibilityId = "com.android.permissioncontroller:id/permission_deny_button",
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]",
        elementName = "Кнопка Don't allow"
    )

    val buttonCross = ScreenConstructor (
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.EditText/android.widget.ImageView",
        elementName = "Удаление адреса"
    )

    val myAddress = ScreenConstructor (
        androidAccessibilityId = "улица Радищева, 35, Санкт-Петербург",
        elementName = "Выбор нужного адреса"
    )

    val myFullAddress = ScreenConstructor (
        androidAccessibilityId = "улица Радищева, 35\n" +
                "кв 17, 1 подъезд, 5 этаж. Домофон: 17. Привезите быстрее, хочу кушать",
        elementName = "Полный адрес"
    )

    val screenMyAddress = ScreenConstructor (
        androidXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View",
        elementName = "Скрин всех моих адресов"
    )


    val deleteAddedAddress = ScreenConstructor (
        androidAccessibilityId = "Удалить",
        elementName = "Кнопка удалить при свайпе адреса на удаление"
    )

}