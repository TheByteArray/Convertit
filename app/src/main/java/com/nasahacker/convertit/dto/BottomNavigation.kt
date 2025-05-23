package com.nasahacker.convertit.dto

/**
 * @author Tamim Hossain
 * @email tamimh.dev@gmail.com
 * @license Apache-2.0
 *
 * ConvertIt is a free and easy-to-use audio converter app.
 * It supports popular audio formats like MP3 and M4A.
 * With options for high-quality bitrates ranging from 128k to 320k,
 * ConvertIt offers a seamless conversion experience tailored to your needs.
 */

sealed class BottomNavigation(
    val route: String,
    val label: String,
) {
    data object Home : BottomNavigation("home", "Home")

    data object Library : BottomNavigation("library ", "Library ")
}
