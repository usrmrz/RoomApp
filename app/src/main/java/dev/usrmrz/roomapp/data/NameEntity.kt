package dev.usrmrz.roomapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "entities_table")
data class NameEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "entities_table_id")
    val id: Int? = null,
    @ColumnInfo(name = "entities_table_name")
    val name: String
)
