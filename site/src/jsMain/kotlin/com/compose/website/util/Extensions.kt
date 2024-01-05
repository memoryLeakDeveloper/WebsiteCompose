package com.compose.website.util

import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint

fun Breakpoint.isMobile(): Boolean {
    return this <= Breakpoint.SM
}