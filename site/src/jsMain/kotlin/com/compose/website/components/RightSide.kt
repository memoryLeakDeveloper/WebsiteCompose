package com.compose.website.components

import androidx.compose.runtime.Composable
import com.compose.website.util.Res
import com.compose.website.util.isMobile
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px

@Composable
fun RightSide(colorMode: ColorMode, breakpoint: Breakpoint) {

    val isMobile = breakpoint.isMobile()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 50.px),
        verticalArrangement = if (isMobile) Arrangement.Top else Arrangement.SpaceBetween,
        horizontalAlignment = if (isMobile) Alignment.CenterHorizontally else Alignment.Start
    ) {
        Column {
            SpanText(
                text = Res.String.SKILLS,
                modifier = Modifier
                    .margin(bottom = 12.px)
                    .fontFamily(Res.String.ROBOTO_CONDENSED)
                    .color(if (colorMode.isLight) Colors.Black else Colors.White)
                    .fontSize(24.px)
                    .fontWeight(FontWeight.Bold)
                    .textAlign(
                        if (isMobile) TextAlign.Center
                        else TextAlign.Start
                    )
            )
            Res.String.LIST_SKILLS.forEach {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(src = Res.Icon.DOT, modifier = Modifier.size(10.px))
                    SpanText(
                        text = it,
                        modifier = Modifier
                            .fontFamily(Res.String.ROBOTO_REGULAR)
                            .color(if (colorMode.isLight) Colors.Black else Colors.White)
                            .fontSize(18.px)
                            .margin(left = 10.px)
                    )
                }
            }
        }
    }
}