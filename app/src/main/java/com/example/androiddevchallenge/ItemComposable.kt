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

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.Gender

@Composable
fun GridItem(dog: Dog, onClick: () -> Unit) { // helper method
    GridItem(imageUrl = dog.photoUrl, name = dog.name, age = dog.age, gender = dog.gender, onClick = onClick)
}

@Composable
fun GridItem(imageUrl: String, name: String, age: String, gender: Gender, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp)
    ) {
        Card(
            elevation = 4.dp,
            modifier = Modifier.clickable { onClick() },
            shape = RoundedCornerShape(8.dp),
        ) {
            Column {
                GlideImage(
                    contentScale = ContentScale.Crop,
                    url = imageUrl,
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                        .clickable(false, onClick = { })
                )
                Spacer(Modifier.height(8.dp))
                val padding = Modifier.padding(horizontal = 8.dp)
                Text(
                    text = name,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        letterSpacing = 0.15.sp
                    ),
                    modifier = padding
                )
                Spacer(Modifier.height(8.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = age,
                        style = MaterialTheme.typography.subtitle1,
                        modifier = padding,
                        color = Color.Gray
                    )
                    if (gender == Gender.MALE) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_male),
                            contentDescription = "Male",
                            tint = Color(0xFF3C58C0),
                            modifier = Modifier.size(24.dp)
                        )
                    } else {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_female),
                            contentDescription = "Female",
                            tint = Color(0xFFBB75C0),
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}
