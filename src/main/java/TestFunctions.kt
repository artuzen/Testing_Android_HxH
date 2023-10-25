import GlobalVariable.androidDriver
import io.appium.java_client.AppiumBy
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Pause
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import java.time.Duration.ofMillis

object TestFunctions {

    fun clickToElement (locator: String, locatorType: LocatorType) {
        val element = findElement(locator, locatorType)
        element.click()
    }

    fun sendText (locator: String, locatorType: LocatorType, text: String) {
        val element = findElement(locator, locatorType)
        element.sendKeys(text)
    }

    fun clearField(locator: String,locatorType: LocatorType) {
        val element = findElement(locator, locatorType)
        element.clear()
    }

    fun checkAvailableElement(locator: String,locatorType: LocatorType) : Boolean {
        val element = findElement(locator, locatorType)
        return element.isEnabled
    }

    fun tapByCoordinates(cordX: Int, cordY: Int) {
        val finger = PointerInput(PointerInput.Kind.TOUCH, "finger")
        val actions = Sequence(finger, 1)

        actions.addAction(finger.createPointerMove(ofMillis(0), PointerInput.Origin.viewport(), cordX, cordX))
        actions.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
        actions.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()))

        androidDriver.perform(listOf(actions))
    }

    fun swipeOnScreen(startCordX: Int, startCordY: Int, moveCordX: Int, moveCordY: Int) {
        val finger = PointerInput(PointerInput.Kind.TOUCH, "finger")
        val actions = Sequence(finger, 1)

        actions.addAction(finger.createPointerMove(ofMillis(0), PointerInput.Origin.viewport(), startCordX, startCordY))
        actions.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
        actions.addAction(Pause(finger, ofMillis(600)))
        actions.addAction(finger.createPointerMove(ofMillis(1000), PointerInput.Origin.viewport(), startCordX, startCordY))
        actions.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()))

        androidDriver.perform(listOf(actions))
    }

    private fun findElement(locator: String, locatorType: LocatorType) : WebElement{
        return when (locatorType) {
            LocatorType.ID -> androidDriver.findElement(AppiumBy.id(locator))
            LocatorType.XPATH ->  androidDriver.findElement(AppiumBy.xpath(locator))
            LocatorType.ACCESSIBILITY_ID -> androidDriver.findElement(AppiumBy.accessibilityId(locator))
            LocatorType.CLASS_NAME -> androidDriver.findElement(AppiumBy.className(locator))
        }
    }
}