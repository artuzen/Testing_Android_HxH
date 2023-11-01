package general_cases_for_test

import LocatorType
import TestFunctions.clickToElement
import screens.DeliveryMethod.buttonPickup
import screens.Onboarding.buttonAllow
import screens.Onboarding.buttonNext
import screens.Onboarding.buttonNextWindow
import screens.Onboarding.selectLanguage
import java.util.concurrent.TimeUnit

object GoToMainMenu {

    fun goToMainMenu() {
        try {
            clickToElement(
                selectLanguage.androidXpath,
                LocatorType.XPATH,
                selectLanguage.iosClassChain,
                LocatorType.IOS_CLASS_CHAIN)

            clickToElement(
                buttonNext.androidAccessibilityId,
                LocatorType.ACCESSIBILITY_ID,
                buttonNext.iosClassChain,
                LocatorType.IOS_CLASS_CHAIN)
            TimeUnit.SECONDS.sleep(5)

            try {
                clickToElement(
                    buttonNextWindow.androidXpath,
                    LocatorType.XPATH,
                    buttonNextWindow.iosClassChain,
                    LocatorType.IOS_CLASS_CHAIN)
                TimeUnit.SECONDS.sleep(5)

                clickToElement(
                    buttonAllow.androidXpath,
                    LocatorType.XPATH,
                    buttonAllow.iosClassChain,
                    LocatorType.IOS_CLASS_CHAIN)
                TimeUnit.SECONDS.sleep(5)
            } catch (_: Throwable){}


            clickToElement(
                buttonPickup.androidAccessibilityId,
                LocatorType.ACCESSIBILITY_ID,
                buttonPickup.iosClassChain,
                LocatorType.IOS_CLASS_CHAIN)

        } catch (e: org.openqa.selenium.NoSuchElementException) {
            println("Приложение уже на экране главного меню")
            TimeUnit.SECONDS.sleep(5)
        }
    }
}