package io.zenandroid.onlinego.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = salmon,
    primaryVariant = accent,
    secondary = brownMedium,
    secondaryVariant = salmon,
    background = background,
    onSurface = brown,
    onBackground = brownLite,
    onPrimary = lightOnPrimary,
    onSecondary = lightOnPrimary,

    /* Other default colors to override
background = Color.White,
surface = Color.White,
onPrimary = Color.White,
onSecondary = Color.Black,
onBackground = Color.Black,
onSurface = Color.Black,
*/
)

private val DarkColorPalette = darkColors(
    primary = nightBlue,
    primaryVariant = darkBlue,
    secondary = salmon,
    secondaryVariant = darkBlue,
    surface = nightSurface,
    onSurface = nightOnSurface,
    background = nightBackground,
    onBackground = nightOnBackground,
    onPrimary = nightOnPrimary,
    onSecondary = nightOnPrimary,
)

@Composable
fun OnlineGoTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
            colors = colors,
            typography = typography,
            shapes = shapes,
            content = content
    )
}