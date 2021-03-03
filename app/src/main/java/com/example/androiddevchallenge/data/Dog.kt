package com.example.androiddevchallenge.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Dog(
    val id: String,
    val name: String,
    val gender: Gender,
    val age: String,
    val photoUrl: String): Parcelable

enum class Gender {
    MALE, FEMALE
}
