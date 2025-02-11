package com.bapenda.notes_app.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bapenda.notes_app.data.dao.NoteDao
import com.bapenda.notes_app.data.entity.Note

@Database(entities = arrayOf(Note::class), version = 1)
abstract class NoteDatabase :RoomDatabase(){
    abstract  fun noteDao():NoteDao
}