package dev.usrmrz.roomapp

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras
import dev.usrmrz.roomapp.data.MainDb

@Suppress("UNCHECKED_CAST")
class MainViewModel(database: MainDb) : ViewModel() {
    val itemsList = database.dao.getAllItems()
    val newText = mutableStateOf("")

    companion object{
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory{
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras): T {
                val database = (checkNotNull(extras[APPLICATION_KEY]) as App).database
                return MainViewModel(database) as T
            }
        }
    }
}