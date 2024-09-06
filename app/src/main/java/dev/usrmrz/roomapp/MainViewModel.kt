package dev.usrmrz.roomapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras

@Suppress("UNCHECKED_CAST")
class MainViewModel : ViewModel() {
    companion object{
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory{
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras): T {
                (checkNotNull(extras[APPLICATION_KEY]) as App).database
                return MainViewModel() as T
            }
        }
    }
}