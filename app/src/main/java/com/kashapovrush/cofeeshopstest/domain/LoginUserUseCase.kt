package com.kashapovrush.cofeeshopstest.domain

import com.kashapovrush.cofeeshopstest.data.model.Token
import com.kashapovrush.cofeeshopstest.data.model.User
import com.kashapovrush.cofeeshopstest.presentation.signInScreen.AuthState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import retrofit2.Call
import javax.inject.Inject

class LoginUserUseCase @Inject constructor(private val repository: AuthRepository) {

    operator fun invoke(user: User): Call<Token> {
       return repository.loginUser(user)
    }
}