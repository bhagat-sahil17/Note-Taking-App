package com.example.notetakingapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.notetakingapp.model.Note
import com.example.notetakingapp.repository.NoteRepository
import kotlinx.coroutines.launch

class NoteViewModel(
    app : Application,
    private var noterepository: NoteRepository ) : AndroidViewModel(app)

{

    fun addNote( note : Note) =
        viewModelScope.launch {
            noterepository.insertNote(note)
        }
    fun updateNote( note : Note ) =
        viewModelScope.launch {
            noterepository.updateNote(note)
        }
    fun deleteNote( note: Note ) =
        viewModelScope.launch {
            noterepository.deleteNote(note)
        }

    fun searchNote( query : String? ) =
            noterepository.searchNote(query)

    fun getAllNotes() = noterepository.getAllNotes()

}