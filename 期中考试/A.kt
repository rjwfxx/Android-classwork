package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Apage(navController: NavController){
    Column {
        Text(text = "教师信息")
        
        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text = "home")
        }
    }
    
}
