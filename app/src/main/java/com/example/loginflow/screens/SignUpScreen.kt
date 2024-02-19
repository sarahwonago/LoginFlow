package com.example.loginflow.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.loginflow.R
import com.example.loginflow.components.HeadingTextComponent
import com.example.loginflow.components.MyButton
import com.example.loginflow.components.MyCheckBox
import com.example.loginflow.components.MyClickableLoginRegisterText
import com.example.loginflow.components.MyDivider
import com.example.loginflow.components.MyTextField
import com.example.loginflow.components.NormalTextComponent
import com.example.loginflow.data.LoginViewModel
import com.example.loginflow.data.UIEvent
import com.example.loginflow.navigation.PostOfficeAppRouter
import com.example.loginflow.navigation.Screen
import com.example.loginflow.ui.theme.WhiteColor

@Composable
fun SignUpScreen(loginViewModel: LoginViewModel = viewModel()){

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(WhiteColor)
            .padding(28.dp)
    ) {

        Column(
            modifier = Modifier
            .fillMaxSize(),
        )
        {

            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_an_account))

            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(
                labelValue = stringResource(id = R.string.first_name),
                icon = painterResource(id = R.drawable.profile),
                onTextSelected = {

                    loginViewModel.onEvent(UIEvent.FirstNameChanged(it))
                }
            )
            MyTextField(
                labelValue = stringResource(id = R.string.last_name),
                icon = painterResource(id = R.drawable.profile),
                onTextSelected = {

                    loginViewModel.onEvent(UIEvent.LastNameChanged(it))
                }
            )

            MyTextField(
                labelValue = stringResource(id = R.string.email),
                icon = painterResource(id = R.drawable.email),
                onTextSelected = {

                    loginViewModel.onEvent(UIEvent.EmailChanged(it))
                }
            )

            MyTextField(
                labelValue = stringResource(id = R.string.password),
                icon = painterResource(id = R.drawable.password),
                onTextSelected = {

                    loginViewModel.onEvent(UIEvent.PasswordChanged(it))
                }
            )

            MyCheckBox(value = stringResource(id = R.string.terms_and_conditions)
                , onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionScreen)
                })

            Spacer(modifier = Modifier.height(40.dp))

            MyButton(value = stringResource(id = R.string.register),
                onButtonCLicked = {
                    loginViewModel.onEvent(UIEvent.RegisterButtonClicked)
                })

            Spacer(modifier = Modifier.height(20.dp))

            MyDivider()

            MyClickableLoginRegisterText(tryingToLogIn = true, onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
            })
        }
    }
}

@Preview
@Composable
fun SignUpScreenPreview(){

    SignUpScreen()
}