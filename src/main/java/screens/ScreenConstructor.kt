package screens

data class ScreenConstructor (
    val androidAccessibilityId: String = "",
    val androidId: String = "",
    val androidXpath: String = "",
    val elementName: String = "",
    val androidClassName: String = "",

    val iosAccessibilityId: String = "",
    val iosId: String = "",
    val iosXpath: String = "",
    val iosClassName: String = "",
    val iosClassChain: String = "",
    val iosPredicate: String = ""
)