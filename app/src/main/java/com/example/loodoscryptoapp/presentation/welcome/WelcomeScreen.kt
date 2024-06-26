package com.example.loodoscryptoapp.presentation.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loodoscryptoapp.R
import com.example.loodoscryptoapp.presentation.components.Logo

@Composable
fun WelcomeScreen(navController: NavController) {

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()) {
        Column {
            Logo()
        }

        TextButton(
            onClick = { navController.navigate("signup") }) {
            Text(
                text = "Sign Up With Email",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black)
        }
        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(bottom = 20.dp)){
            TextButton(onClick = { navController.navigate("signin") }){
                Text(
                    text = "Already have an account",
                    fontSize = 14.sp
                )
                Text(
                    text = " Sign in.",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black)
            }
        }

    }

}

