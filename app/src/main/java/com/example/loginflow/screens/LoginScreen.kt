package com.example.loginflow.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginflow.R
import com.example.loginflow.components.HeadingTextComponent
import com.example.loginflow.components.MyButton
import com.example.loginflow.components.MyClickableLoginRegisterText
import com.example.loginflow.components.MyDivider
import com.example.loginflow.components.MyTextField
import com.example.loginflow.components.NormalTextComponent
import com.example.loginflow.components.UnderlinedTextComponent
import com.example.loginflow.navigation.PostOfficeAppRouter
import com.example.loginflow.navigation.Screen
import com.example.loginflow.navigation.SystemBackButtonHandler
import com.example.loginflow.ui.theme.WhiteColor

@Composable
fun LoginScreen(){

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(WhiteColor)
            .padding(28.dp)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
        ){

            NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))

            Spacer(modifier = Modifier.height(20.dp))

            MyTextField(labelValue = stringResource(id = R.string.email),
                icon = painterResource(id = R.drawable.email))

            MyTextField(labelValue = stringResource(id = R.string.password),
                icon = painterResource(id = R.drawable.password))

            Spacer(modifier = Modifier.height(30.dp))

            UnderlinedTextComponent(value = stringResource(id = R.string.forgot_password))

            Spacer(modifier = Modifier.height(50.dp))

            MyButton(value = stringResource(id = R.string.login))

            Spacer(modifier = Modifier.height(30.dp))
            MyDivider()

            MyClickableLoginRegisterText(tryingToLogIn = false, onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
            })
        }
    }

    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Composable
@Preview
fun LoginScreenPreview(){
    LoginScreen()
}