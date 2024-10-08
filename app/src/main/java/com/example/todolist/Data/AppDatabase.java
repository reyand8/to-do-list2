package com.example.todolist.Data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.todolist.Model.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}