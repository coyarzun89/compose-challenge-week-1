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
package com.example.androiddevchallenge

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.PetDetailsActivity.Companion.DOG_SELECTED
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.FakeDogRepository
import com.example.androiddevchallenge.ui.theme.MyTheme

class PetListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                PetListView()
            }
        }
    }

    @Composable
    fun HachikoIcon() {
        Icon(
            painter = painterResource(id = R.drawable.ic_hachiko),
            contentDescription = null // decorative element
        )
    }

    @Composable
    fun PetListView() {
        Column {
            TopAppBar(
                title = { Text(text = "Adopt a pet") },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        HachikoIcon()
                    }
                },
                elevation = 4.dp
            )
            DoggyGrid(dogs = FakeDogRepository.dogList)
        }
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun DoggyGrid(dogs: List<Dog>) {
        LazyVerticalGrid(
            cells = GridCells.Adaptive(minSize = 200.dp)
        ) {
            items(dogs) { dog ->
                GridItem(dog) { onGridItemClick(dog) }
            }
        }
    }

    private fun onGridItemClick(dog: Dog) {
        startActivity(
            Intent(this, PetDetailsActivity::class.java)
                .putExtra(DOG_SELECTED, dog)
        )
    }

    @Preview("Light Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun PetListLightPreview() {
        MyTheme {
            PetListView()
        }
    }

    @Preview("Dark Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun PetListDarkPreview() {
        MyTheme(darkTheme = true) {
            PetListView()
        }
    }
}
