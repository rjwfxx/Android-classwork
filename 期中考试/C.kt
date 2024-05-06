package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Cpage(navController: NavController){
    Column {
        Text(text = "Home")

        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text = "home")
        }
    }

}
