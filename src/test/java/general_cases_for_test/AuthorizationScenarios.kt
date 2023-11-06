package general_cases_for_test

import general_cases_for_test.Authorization.authorization
import screens.MainScreen.clickButtonMenu
import screens.MainScreen.clickButtonProfile
import screens.ProfileScreen.checkAuthorizationPerson
import screens.ProfileScreen.clickButtonExit
import java.util.concurrent.TimeUnit

object AuthorizationScenarios {

    fun checkAuthorizationUser(needAuthorizationUser: Boolean) {
        /* тут должна быть логика проверки авторизации пользователя
        на входе одна и нужных булевых переменных, вторую нужно получить путем
        проверки доступности элемента
         */

        // нужно описать 4 ветки
        var userIsAuthorization: Boolean
        try {
            // нам нужно получить true, что это сделать, нужно найти элемент, если он не будет
            // найден, то должна обработаться ошибка и установить значение false
            clickButtonProfile()
            TimeUnit.SECONDS.sleep(5)

            userIsAuthorization = checkAuthorizationPerson ()
            TimeUnit.SECONDS.sleep(5)

        } catch (e: org.openqa.selenium.NoSuchElementException) {
            userIsAuthorization = false
        }
        when {
            needAuthorizationUser && userIsAuthorization -> {
                clickButtonMenu()
                TimeUnit.SECONDS.sleep(5)
            }

            needAuthorizationUser && !userIsAuthorization -> {
                authorization()
            }

            !needAuthorizationUser && userIsAuthorization -> {
                clickButtonExit ()
                TimeUnit.SECONDS.sleep(5)

                clickButtonMenu()
                TimeUnit.SECONDS.sleep(5)
            }

            !needAuthorizationUser && !userIsAuthorization -> {
                clickButtonMenu()
                TimeUnit.SECONDS.sleep(5)
            }
        }

    }
}