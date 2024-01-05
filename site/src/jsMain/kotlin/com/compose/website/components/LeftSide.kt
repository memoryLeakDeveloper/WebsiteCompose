package com.compose.website.components

import androidx.compose.runtime.Composable
import com.compose.website.styles.ButtonStyle
import com.compose.website.styles.SocialIconStyle
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
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.px

@Composable
fun LeftSide(colorMode: ColorMode, breakpoint: Breakpoint) {

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
                text = Res.String.NAME,
                modifier = Modifier
                    .margin(bottom = 12.px)
                    .fontFamily(Res.String.ROBOTO_CONDENSED)
                    .color(if (colorMode.isLight) Colors.Black else Colors.White)
                    .fontSize(50.px)
                    .fontWeight(FontWeight.Bold)
                    .textAlign(
                        if (isMobile) TextAlign.Center
                        else TextAlign.Start
                    )
            )
            SpanText(
                text = Res.String.PROFESSION,
                modifier = Modifier
                    .margin(bottom = 24.px)
                    .fontFamily(Res.String.ROBOTO_REGULAR)
                    .color(if (colorMode.isLight) Colors.Black else Colors.White)
                    .fontSize(18.px)
            )
        }
//        Surface(
//            modifier = Modifier
//                .height(4.px)
//                .width(40.px)
//                .margin(bottom = 24.px)
//                .background(
//                    if (colorMode.isLight) Res.Theme.BLUE.color
//                    else Res.Theme.LIGHT_BLUE.color
//                )
//                .align(
//                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
//                    else Alignment.Start
//                )
//        ) {}
        Column {
            Button(
                modifier = ButtonStyle.toModifier().margin(bottom = 20.px),
                size = ButtonSize.LG,
                onClick = { window.location.href = Res.String.TELEGRAM_LINK }
            ) {
                Image(
                    modifier = Modifier.margin(right = 12.px).size(Res.Dimens.ICON_SIZE.px),
                    src = Res.Icon.TELEGRAM
                )
                SpanText(
                    modifier = Modifier
                        .fontSize(14.px)
                        .color(
                            if (colorMode.isLight) Colors.White
                            else Res.Theme.GRADIENT_ONE_DARK.color
                        )
                        .fontWeight(FontWeight.Bold)
                        .fontFamily(Res.String.ROBOTO_REGULAR),
                    text = Res.String.BUTTON_TEXT
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .gap(12.px),
                horizontalArrangement = if (isMobile) Arrangement.Center else Arrangement.Start
            ) {
                SocialIcon.entries.filter {
                    if (colorMode.isLight) !it.name.contains("Light")
                    else it.name.contains("Light")
                }.forEach {
                    IconButton(
                        modifier = SocialIconStyle.toModifier(),
                        colorMode = colorMode,
                        icon = it.icon,
                        link = it.link
                    )
                }
            }
        }
    }

}