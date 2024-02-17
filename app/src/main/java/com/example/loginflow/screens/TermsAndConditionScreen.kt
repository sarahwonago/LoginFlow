package com.example.loginflow.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginflow.R
import com.example.loginflow.components.HeadingTextComponent
import com.example.loginflow.navigation.PostOfficeAppRouter
import com.example.loginflow.navigation.Screen
import com.example.loginflow.navigation.SystemBackButtonHandler
import com.example.loginflow.ui.theme.WhiteColor

@Composable
fun TermsAndConditionScreen(){
    Surface (
        modifier = Modifier
            .fillMaxSize()
            .background(color = WhiteColor)
            .padding(16.dp)
    ){
        HeadingTextComponent(value = stringResource(id = R.string.terms_heading))
    }

    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview(showSystemUi = true)
@Composable
fun TermsAndConditionScreenPreview(){
    TermsAndConditionScreen()
}