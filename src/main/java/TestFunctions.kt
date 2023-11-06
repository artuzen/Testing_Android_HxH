import GlobalVariable.androidDriver
import GlobalVariable.iosDriver
import GlobalVariable.platformType
import io.appium.java_client.AppiumBy
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Pause
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import java.time.Duration.ofMillis
import java.util.concurrent.TimeUnit

object TestFunctions {

    fun clickToElement (
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String
    ) {
        chooseLocator (
            locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS
        ).click()
        TimeUnit.SECONDS.sleep(3)
    }

    fun sendText (
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        text: String,
        elementName: String
    ) {
        chooseLocator (
            locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS
        ).sendKeys(text)
    }

    fun clearField(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String
    ) {
        chooseLocator (
            locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS
        ).clear()
    }

    fun checkAvailableElement(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String
    ) : Boolean {

        return chooseLocator (
            locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS
        ).isEnabled
    }

    fun tapByCoordinates(cordX: Int, cordY: Int) {
        val finger = PointerInput(PointerInput.Kind.TOUCH, "finger")
        val actions = Sequence(finger, 1)

        actions.addAction(finger.createPointerMove(ofMillis(0), PointerInput.Origin.viewport(), cordX, cordY))
        actions.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
        actions.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()))

        if (platformType == TypeOS.IOS) {
            iosDriver.perform(listOf(actions))
        } else {
            androidDriver.perform(listOf(actions))
        }
    }

    fun swipeOnScreen(startCordX: Int, startCordY: Int, moveCordX: Int, moveCordY: Int) {
        val finger = PointerInput(PointerInput.Kind.TOUCH, "finger")
        val actions = Sequence(finger, 1)

        actions.addAction(finger.createPointerMove(ofMillis(0), PointerInput.Origin.viewport(), startCordX, startCordY))
        actions.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
        actions.addAction(Pause(finger, ofMillis(600)))
        actions.addAction(finger.createPointerMove(ofMillis(1000), PointerInput.Origin.viewport(), moveCordX, moveCordY))
        actions.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()))

        if (platformType == TypeOS.IOS) {
            iosDriver.perform(listOf(actions))
        } else {
            androidDriver.perform(listOf(actions))
        }
    }

    fun findElement(
        locator: String,
        locatorType: LocatorType
    ) : WebElement{
        return when (locatorType) {
            LocatorType.ID -> {
                if (platformType == TypeOS.ANDROID) {
                    androidDriver.findElement(AppiumBy.id(locator))
                    } else {
                        iosDriver.findElement(AppiumBy.id(locator))
                }
            }
            LocatorType.XPATH -> {
                if (platformType == TypeOS.ANDROID) {
                    androidDriver.findElement(AppiumBy.xpath(locator))
                } else {
                    iosDriver.findElement(AppiumBy.id(locator))
                }
            }
            LocatorType.ACCESSIBILITY_ID -> {
                if (platformType == TypeOS.ANDROID) {
                    androidDriver.findElement(AppiumBy.accessibilityId(locator))
                } else {
                    iosDriver.findElement(AppiumBy.accessibilityId(locator))
                }
            }
            LocatorType.CLASS_NAME -> {
                if (platformType == TypeOS.ANDROID) {
                    androidDriver.findElement(AppiumBy.className(locator))
                } else {
                    iosDriver.findElement(AppiumBy.className(locator))
                }
            }

            LocatorType.IOS_CLASS_CHAIN -> iosDriver.findElement(AppiumBy.iOSClassChain(locator))
            LocatorType.IOS_PREDICATE_STRING -> iosDriver.findElement(AppiumBy.iOSNsPredicateString(locator))

        }
    }

    private fun chooseLocator (
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType
    ) : WebElement {

        val finalLocator: String
        val finalLocatorType: LocatorType
        if (platformType == TypeOS.ANDROID) {
            finalLocator = locatorAndroid
            finalLocatorType = locatorTypeAndroid
        } else {
            finalLocator = locatorIOS
            finalLocatorType = locatorTypeIOS
        }

        return findElement(finalLocator, finalLocatorType)
    }
}