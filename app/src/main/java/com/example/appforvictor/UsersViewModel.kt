package com.example.appforvictor

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(
    api: Api
): ViewModel() {

    private val usersLiveData = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> = usersLiveData

    init {
        viewModelScope.launch {
            val users = api.getPosts()
            delay(2000)
            usersLiveData.value = users
        }
    }
}