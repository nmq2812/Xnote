package com.example.xnote.viewmodule

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import com.example.xnote.data.Note
import java.io.File
import java.io.FileInputStream

class NoteViewModel: ViewModel() {
    val listOfNote: MutableList<Note> = mutableListOf()

    @Composable
    fun GetListNote() {
        val context = LocalContext.current
        val file = File(context.filesDir, "notes.txt")
        val fileInputStream = FileInputStream(file)
        val data = fileInputStream.readBytes().decodeToString()
        fileInputStream.close()
    }
}