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

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.Gender
import com.example.androiddevchallenge.ui.theme.MyTheme

class PetDetailsActivity : AppCompatActivity() {

    private lateinit var dog: Dog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dog = intent.extras!!.getParcelable(DOG_SELECTED)!!

        setContent {
            MyTheme {
                PetDetailsView(dog)
            }
        }
    }

    @Composable
    fun PetDetailsView(dog: Dog) {
        Column {
            GlideImage(
                contentScale = ContentScale.Crop,
                url = dog.photoUrl,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
            )
            Text(
                text = dog.name,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    letterSpacing = 0.15.sp
                ),
                modifier = Modifier.padding(16.dp)
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = dog.age,
                    style = TextStyle(
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        letterSpacing = 0.15.sp
                    ),
                    modifier = Modifier.padding(horizontal = 16.dp),
                    color = Color.DarkGray
                )
                if (dog.gender == Gender.MALE) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_male),
                        contentDescription = "Male",
                        tint = Color(0xFF3C58C0),
                        modifier = Modifier.size(32.dp)
                    )
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_female),
                        contentDescription = "Female",
                        tint = Color(0xFFBB75C0),
                        modifier = Modifier.size(32.dp)
                    )
                }
            }

            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                    "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim " +
                    "veniam, quis nostrud exercitation ullamco.",
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = 18.sp,
                    letterSpacing = 0.15.sp
                ),
                color = Color.Gray,
                modifier = Modifier.padding(16.dp)
            )

            ExtendedFloatingActionButton(
                modifier = Modifier.padding(vertical = 16.dp, horizontal = 48.dp)
                    .fillMaxWidth(1f).height(60.dp),
                backgroundColor = MaterialTheme.colors.primary,
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_pets),
                        contentDescription = null,
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier.size(32.dp)
                    )
                },
                text = {
                    Text(
                        text = "Adopt me",
                        style = MaterialTheme.typography.h6,
                        color = Color.White,
                    )
                },
                onClick = { showLoveToast() },
                elevation = FloatingActionButtonDefaults.elevation(8.dp)
            )
        }
    }

    private fun showLoveToast() {
        Toast.makeText(this, "Thank you 🥰", Toast.LENGTH_SHORT).show()
    }

    @Preview("Light Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun PetDetailsLightPreview() {
        MyTheme {
            PetDetailsView(dog)
        }
    }

    @Preview("Dark Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun PetDetailsDarkPreview() {
        MyTheme(darkTheme = true) {
            PetDetailsView(dog)
        }
    }

    companion object {
        const val DOG_SELECTED = "DOG_SELECTED"
    }
}
