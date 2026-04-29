package oop_00000126931_PaulusMarchionniSadipun.week8

class NotificationService {

    fun sendEmail(emailAdress: String) {
        println("Sending email: $emailAdress")

    }

    fun processUser(user: UserProfile) {

        if (user.email != null) {
            sendEmail(user.email)

        }else {
            println("User ${user.name} does not have an email")
        }
    }

}