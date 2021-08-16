package com.oguzdogdu.navigation.model

import android.os.Parcelable

@kotlinx.parcelize.Parcelize
data class User(
        val firstName : String,
        val lastName : String
) : Parcelable
