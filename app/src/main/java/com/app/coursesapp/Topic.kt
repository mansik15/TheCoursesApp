package com.app.coursesapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val courseName: Int,
    val courseAvailable: Int,
    @DrawableRes val courseImage: Int
)
