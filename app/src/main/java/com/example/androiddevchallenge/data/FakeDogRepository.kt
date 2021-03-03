/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

object FakeDogRepository {
    val dogList = mutableListOf<Dog>().apply {
        add(
            Dog(
                id = "1",
                name = "Lola",
                gender = Gender.FEMALE,
                age = "3 months",
                photoUrl = "https://images.unsplash.com/photo-1583511655826-05700d52f4d9?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTd8fGRvZ3xlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=40"
            )
        )
        add(
            Dog(
                id = "2",
                name = "Nina",
                gender = Gender.FEMALE,
                age = "2 years",
                photoUrl = "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NHx8ZG9nfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=40"
            )
        )
        add(
            Dog(
                id = "3",
                name = "Spike",
                gender = Gender.MALE,
                age = "3 weeks",
                photoUrl = "https://images.unsplash.com/photo-1517423440428-a5a00ad493e8?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxzZWFyY2h8NDh8fGRvZ3xlbnwwfHwwfA%3D%3D&auto=format&fit=crop&w=500&q=40"
            )
        )
        add(
            Dog(
                id = "4",
                name = "Clarita",
                gender = Gender.FEMALE,
                age = "7 years",
                photoUrl = "https://images.unsplash.com/photo-1560525821-d5615ef80c69?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTN8fGRvZ3xlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=40"
            )
        )
        add(
            Dog(
                id = "5",
                name = "Thunder",
                gender = Gender.MALE,
                age = "5 months",
                photoUrl = "https://images.unsplash.com/photo-1583511655857-d19b40a7a54e?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MXx8ZG9nfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=40"
            )
        )
        add(
            Dog(
                id = "6",
                name = "Quincy",
                gender = Gender.MALE,
                age = "2 years",
                photoUrl = "https://images.unsplash.com/photo-1517849845537-4d257902454a?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MjZ8fGRvZ3xlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=40"
            )
        )
        add(
            Dog(
                id = "7",
                name = "Milo",
                gender = Gender.MALE,
                age = "5 years",
                photoUrl = "https://images.unsplash.com/photo-1561037404-61cd46aa615b?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MjB8fGRvZ3xlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=40"
            )

        )
        add(
            Dog(
                id = "8",
                name = "Al",
                gender = Gender.MALE,
                age = "1 year",
                photoUrl = "https://images.unsplash.com/photo-1549291981-56d443d5e2a2?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NTh8fGRvZ3xlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=40"
            )
        )
        add(
            Dog(
                id = "9",
                name = "Eve",
                gender = Gender.FEMALE,
                age = "7 months",
                photoUrl = "https://images.unsplash.com/photo-1509005084666-3cbc75184cbb?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NDJ8fGRvZ3xlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=40"
            )
        )
        add(
            Dog(
                id = "10",
                name = "Pep",
                gender = Gender.MALE,
                age = "9 months",
                photoUrl = "https://images.unsplash.com/photo-1583512603805-3cc6b41f3edb?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NXx8ZG9nfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=40"
            )
        )
    }
}
