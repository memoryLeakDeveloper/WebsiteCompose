package com.compose.website.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        LIGHT_BLUE(color = Color.rgb(r = 168, g = 236, b = 255)),
        DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
        GRADIENT_ONE_DARK(color = Color.rgb(r = 19, g = 38, b = 58)),
        GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
        GRADIENT_TWO_DARK(color = Color.rgb(r = 20, g = 46, b = 73)),
        BLACK(color = Color.rgb(r = 0, g = 0, b = 0))
    }

    object Icon {
        const val TELEGRAM = "telegram_icon.svg"
        const val GITHUB = "github.svg"
        const val GITHUB_LIGHT = "github_light.svg"
        const val SUN = "sun.svg"
        const val MOON = "moon.svg"
        const val DOT = "dot.svg"
    }

    object Image {
        const val PROFILE_PHOTO =
            "https://img10.reactor.cc/pics/post/full/anon-%D0%9A%D0%B0%D1%80%D1%82%D0%B8%D0%BD%D0%BA%D0%B0-2191131.jpeg"
    }

    object String {
        const val NAME = "Marchenko Alexander"
        const val PROFESSION = "Android Developer"
        const val SUMMARY = "SUMMARY"
            const val DESCRIPTION =
            "Android developer with 2 years of experience. I love more than android development only my mom and wife."
        const val BUTTON_TEXT = "Write me in Telegram"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val TELEGRAM_LINK = "https://t.me/san9Stone"
        const val SAVED_THEME = "theme"
        const val SKILLS = "Skills"
        const val LANGUAGES = "Kotlin, Java"
        const val SKD = "Android SDK, Jetpack"
        const val VIEW = "View, Jetpack Compose"
        const val PATTERNS = "MVI, MVVM, MvRx(Maverics)"
        const val CLEAN = "Clean Architecture, SOLID"
        const val DI = "Dagger2, Hilt, Koin"
        const val COROUTINES = "Coroutine, Flow"
        const val RXJAVA = "RxJava2"
        const val FIREBASE = "Firebase"
        const val APP_METRICA = "App metrica"
        const val BLUETOOTH = "Bluetooth"
        const val SERVICES = "Services, WorkManager"
        const val CONTENT_PROVIDER = "Content provider"
        const val CUSTOM_VIEW = "Custom view"
        const val SQL = "Room, SQLite"
        const val RETROFIT = "Retrofit, Ktor"
        const val ROOT = "Root, accessibility service"
        const val EXOPLAYER = "Exoplayer"
        const val TEST = "Junit, Mockito"
        const val GIT = "Git"
        const val GOOGLE_PLAY = "Google play"

        val LIST_SKILLS = listOf(
            LANGUAGES, SKD, VIEW, PATTERNS, CLEAN, DI, COROUTINES, RXJAVA, FIREBASE, APP_METRICA, BLUETOOTH, SERVICES,
            CONTENT_PROVIDER, CUSTOM_VIEW, SQL, RETROFIT, ROOT, EXOPLAYER, TEST, GIT, GOOGLE_PLAY
        )
    }

    object Dimens {
        const val BORDER_RADIUS = 10
        const val MAX_CARD_WIDTH = 1000
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}