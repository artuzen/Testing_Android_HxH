package general_cases_for_test

import LocatorType
import TestFunctions.clickToElement
import screens.DeliveryMethod.buttonPickup
import screens.Onboarding.buttonNext
import screens.Onboarding.selectLanguage
import java.util.concurrent.TimeUnit

object GoToMainMenu {

    fun goToMainMenu() {
        try {
            clickToElement(
                selectLanguage.androidXpath,
                LocatorType.XPATH)

            clickToElement(
                buttonNext.androidAccessibilityId,
                LocatorType.ACCESSIBILITY_ID)
            TimeUnit.SECONDS.sleep(5)

            clickToElement(
                buttonPickup.androidAccessibilityId,
                LocatorType.ACCESSIBILITY_ID)

        } catch (e: org.openqa.selenium.NoSuchElementException) {
            println("Приложение уже на экране главного меню")
            TimeUnit.SECONDS.sleep(5)
        }
    }
}