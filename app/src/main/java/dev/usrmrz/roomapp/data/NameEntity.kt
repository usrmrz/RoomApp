package dev.usrmrz.roomapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "roomapp_table")
data class NameEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String
)
