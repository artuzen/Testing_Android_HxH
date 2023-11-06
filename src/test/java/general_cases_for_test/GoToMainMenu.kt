package general_cases_for_test

import screens.DeliveryMethod.clickButtonPickup
import screens.Onboarding.clicksButtonAllow
import screens.Onboarding.clicksButtonNext
import screens.Onboarding.clicksButtonNextWindow
import screens.Onboarding.clicksSelectLanguage
import java.util.concurrent.TimeUnit

object GoToMainMenu {

    fun goToMainMenu() {
        try {
            clicksSelectLanguage ()
            TimeUnit.SECONDS.sleep(5)

            clicksButtonNext ()
            TimeUnit.SECONDS.sleep(5)

            try {
                clicksButtonNextWindow ()
                TimeUnit.SECONDS.sleep(5)

                clicksButtonAllow ()
                TimeUnit.SECONDS.sleep(5)
            } catch (_: Throwable){}

            clickButtonPickup ()
            TimeUnit.SECONDS.sleep(5)
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            println("Приложение уже на экране главного меню")
            TimeUnit.SECONDS.sleep(5)
        }
    }
}