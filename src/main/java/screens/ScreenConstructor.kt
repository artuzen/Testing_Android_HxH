package screens

data class ScreenConstructor (
    var androidAccessibilityId: String = "",
    val androidId: String = "",
    var androidXpath: String = "",
    val elementName: String = "",
    val androidClassName: String = "",

    var iosAccessibilityId: String = "",
    val iosId: String = "",
    val iosXpath: String = "",
    val iosClassName: String = "",
    var iosClassChain: String = "",
    val iosPredicate: String = ""
)