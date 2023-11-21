package general_cases_for_test

import screens.DeliveryMethod
import screens.Onboarding
import java.util.concurrent.TimeUnit

object GoToMainMenu {

    fun goToMainMenu() {
        try {
            val onboarding = Onboarding()
            val deliveryMethod = DeliveryMethod()

            onboarding.clicksSelectLanguage (findElementWithoutCatching = true)
            TimeUnit.SECONDS.sleep(5)

            onboarding.clicksButtonNext (findElementWithoutCatching = true)
            TimeUnit.SECONDS.sleep(5)

            try {
                onboarding.clicksButtonNextWindow ()
                TimeUnit.SECONDS.sleep(5)

                onboarding.clicksButtonAllow ()
                TimeUnit.SECONDS.sleep(5)
            } catch (_: Throwable){}

            deliveryMethod.clickButtonPickup()
            TimeUnit.SECONDS.sleep(5)
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            println("Приложение уже на экране главного меню")
            TimeUnit.SECONDS.sleep(5)
        }
    }
}