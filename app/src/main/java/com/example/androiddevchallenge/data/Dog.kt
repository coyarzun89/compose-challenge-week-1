package com.example.androiddevchallenge.data

data class Dog(val id: String, val name: String, val gender: Gender, val age: String, val photoUrl: String)

enum class Gender {
    MALE, FEMALE
}
