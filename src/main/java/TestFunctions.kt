
import GlobalVariable.androidDriver
import GlobalVariable.iosDriver
import GlobalVariable.platformType
import io.appium.java_client.AppiumBy
import io.qameta.allure.Attachment
import io.qameta.allure.Step
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Pause
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import org.testng.Assert
import java.time.Duration.ofMillis
import java.util.*
import java.util.concurrent.TimeUnit

object TestFunctions {

    @Step("Нажатие на {elementName}")
    fun clickToElement (
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ) {
        chooseLocator (
            locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS,
            findElementWithoutCatching
        ).click()
        TimeUnit.SECONDS.sleep(3)
    }

    @Step("Ввод текста {text} в поле {elementName}")
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

    @Step("Очистка поля {elementName}")
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

    @Step("Проверка наличия элемента {elementName}")
    fun checkAvailableElement(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ) : Boolean {

        return chooseLocator (
            locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS,
            findElementWithoutCatching
        ).isEnabled
    }

    @Step("Тап по координатам x:{cordX} y:{cordY}")
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

    @Step("Свайп по экрану от ({startCordX}, {startCordY}) до ({moveCordX}, {moveCordY})")
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
        locatorType: LocatorType,
        findElementWithoutCatching: Boolean = false
    ) : WebElement {
        lateinit var element: WebElement

        if (findElementWithoutCatching) {
            when (locatorType) {
                LocatorType.ID -> {
                    if (platformType == TypeOS.ANDROID) {
                        element = androidDriver.findElement(AppiumBy.id(locator))
                    } else {
                        element = iosDriver.findElement(AppiumBy.id(locator))
                    }
                }

                LocatorType.XPATH -> {
                    if (platformType == TypeOS.ANDROID) {
                        element = androidDriver.findElement(AppiumBy.xpath(locator))
                    } else {
                        element = iosDriver.findElement(AppiumBy.id(locator))
                    }
                }

                LocatorType.ACCESSIBILITY_ID -> {
                    if (platformType == TypeOS.ANDROID) {
                        element = androidDriver.findElement(AppiumBy.accessibilityId(locator))
                    } else {
                        element = iosDriver.findElement(AppiumBy.accessibilityId(locator))
                    }
                }

                LocatorType.CLASS_NAME -> {
                    if (platformType == TypeOS.ANDROID) {
                        element = androidDriver.findElement(AppiumBy.className(locator))
                    } else {
                        element = iosDriver.findElement(AppiumBy.className(locator))
                    }
                }

                LocatorType.IOS_CLASS_CHAIN -> element = iosDriver.findElement(AppiumBy.iOSClassChain(locator))
                LocatorType.IOS_PREDICATE_STRING -> element =
                    iosDriver.findElement(AppiumBy.iOSNsPredicateString(locator))

            }
        }else {
            runCatching {
                when (locatorType) {
                    LocatorType.ID -> {
                        if (platformType == TypeOS.ANDROID) {
                            element = androidDriver.findElement(AppiumBy.id(locator))
                        } else {
                            element = iosDriver.findElement(AppiumBy.id(locator))
                        }
                    }

                    LocatorType.XPATH -> {
                        if (platformType == TypeOS.ANDROID) {
                            element = androidDriver.findElement(AppiumBy.xpath(locator))
                        } else {
                            element = iosDriver.findElement(AppiumBy.id(locator))
                        }
                    }

                    LocatorType.ACCESSIBILITY_ID -> {
                        if (platformType == TypeOS.ANDROID) {
                            element = androidDriver.findElement(AppiumBy.accessibilityId(locator))
                        } else {
                            element = iosDriver.findElement(AppiumBy.accessibilityId(locator))
                        }
                    }

                    LocatorType.CLASS_NAME -> {
                        if (platformType == TypeOS.ANDROID) {
                            element = androidDriver.findElement(AppiumBy.className(locator))
                        } else {
                            element = iosDriver.findElement(AppiumBy.className(locator))
                        }
                    }

                    LocatorType.IOS_CLASS_CHAIN -> element = iosDriver.findElement(AppiumBy.iOSClassChain(locator))
                    LocatorType.IOS_PREDICATE_STRING -> element =
                        iosDriver.findElement(AppiumBy.iOSNsPredicateString(locator))

                }
            }.onSuccess {

            }.onFailure {
                makeScreenshotOfScreen(Date().toString())
                Assert.fail("Элемент не был найден по локатору - $locator")
            }
        }
        return element
    }

    private fun chooseLocator (
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        findElementWithoutCatching: Boolean = false
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

        return findElement(finalLocator, finalLocatorType, findElementWithoutCatching)
    }

    @Attachment(value = "Screenshot - {dateOnSystem}", type = "image/png")
    fun makeScreenshotOfScreen(dateOnSystem: String?): ByteArray {
        return if (platformType == TypeOS.IOS) {
            (iosDriver as TakesScreenshot?)!!.getScreenshotAs(OutputType.BYTES)
        } else (androidDriver as TakesScreenshot?)!!.getScreenshotAs(OutputType.BYTES)

        // использование - makeScreenshotOfScreen(String.valueOf(new Date()))
    }

}