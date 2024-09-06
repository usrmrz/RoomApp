package dev.usrmrz.roomapp

import android.app.Application
import dev.usrmrz.roomapp.data.MainDb

class App : Application() {
    val database by lazy { MainDb.createDataBase(this) }
}