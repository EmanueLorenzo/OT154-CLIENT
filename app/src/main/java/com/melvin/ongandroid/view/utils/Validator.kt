package com.melvin.ongandroid.view.utils

import java.util.regex.Pattern

/**
 * Clase para validar entrada de datos
 * Contiene metodo para validacion de email y password
 *
 * @author Martin Re
 */
class Validator {
    companion object {
        private const val EMAIL_PATTERN =
            "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]|[\\w-]{2,}))@" +
                    "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?" +
                    "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\." +
                    "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?" +
                    "[0-9]{1,2}|25[0-5]|2[0-4][0-9]))|" +
                    "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"

        fun isEmailValid(email: String): Boolean {
            return Pattern.compile(EMAIL_PATTERN)
                .matcher(email).matches()
        }


        private const val PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])" +
                    "(?=.*[a-zA-Z])(?=.*[@#$%^&+=])" +
                    "(?=\\S+$).{8,}$"

        fun isPasswordValid(password: String): Boolean{
            return Pattern.compile(PASSWORD_PATTERN)
                .matcher(password).matches()
        }
    }
}