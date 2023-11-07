package general_cases_for_test

import general_cases_for_test.Authorization.authorization
import screens.MainScreen
import screens.ProfileScreen
import java.util.concurrent.TimeUnit

object AuthorizationScenarios {

    fun checkAuthorizationUser(needAuthorizationUser: Boolean) {
        /* тут должна быть логика проверки авторизации пользователя
        на входе одна и нужных булевых переменных, вторую нужно получить путем
        проверки доступности элемента
         */

        // нужно описать 4 ветки
        val mainScreen = MainScreen()
        val profileScreen = ProfileScreen()
        var userIsAuthorization: Boolean
        try {
            // нам нужно получить true, что это сделать, нужно найти элемент, если он не будет
            // найден, то должна обработаться ошибка и установить значение false
            mainScreen.clickButtonProfile()
            TimeUnit.SECONDS.sleep(5)

            userIsAuthorization = profileScreen.checkAuthorizationPerson ()
            TimeUnit.SECONDS.sleep(5)

        } catch (e: org.openqa.selenium.NoSuchElementException) {
            userIsAuthorization = false
        }
        when {
            needAuthorizationUser && userIsAuthorization -> {
                mainScreen.clickButtonMenu()
                TimeUnit.SECONDS.sleep(5)
            }

            needAuthorizationUser && !userIsAuthorization -> {
                authorization()
            }

            !needAuthorizationUser && userIsAuthorization -> {
                profileScreen.clickButtonExit ()
                TimeUnit.SECONDS.sleep(5)

                mainScreen.clickButtonMenu()
                TimeUnit.SECONDS.sleep(5)
            }

            !needAuthorizationUser && !userIsAuthorization -> {
                mainScreen.clickButtonMenu()
                TimeUnit.SECONDS.sleep(5)
            }
        }

    }
}