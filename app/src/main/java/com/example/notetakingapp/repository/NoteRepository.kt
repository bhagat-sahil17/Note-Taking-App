package com.example.notetakingapp.repository

import com.example.notetakingapp.database.NoteDatabase
import com.example.notetakingapp.model.Note

class NoteRepository( private var db : NoteDatabase) {


    suspend fun insertNote( note: Note ) = db.getNoteDao().insertNote( note )
    suspend fun updateNote( note: Note ) = db.getNoteDao().updateNote( note )
    suspend fun deleteNote( note: Note ) = db.getNoteDao().deleteNote( note )


    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote( query : String? ) = db.getNoteDao().searchNotes( query )

}