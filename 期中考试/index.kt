package com.example.middleexam


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.Navigator
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.middleexam.ui.theme.MiddleExamTheme
import com.example.middleexam.Homepage as Homepage1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiddleExamTheme {

            }
        }
    }
}

//}

@Composable
fun Navigator(){
// val navController = rememberNavController()
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){ Homepage1(navController = navController) }
        composable("A"){ Apage(navController = navController)}
        composable("B"){ Bpage(navController = navController)}
        composable("C"){ Cpage(navController = navController)}


    }
}

@Composable
fun Homepage(navController: NavController){
    Column {
        Button(onClick = {
            navController.navigate("A")
        }) {
            Text(text="A")
        }
        Button(onClick = {
            navController.navigate("B")
        }) {
            Text(text="B")
        }
        Button(onClick = {
            navController.navigate("C")
        }) {
            Text(text="C")
        }
    }
}




@Composable
@Preview(showSystemUi = true)
fun preview(){
    Navigator()
}
