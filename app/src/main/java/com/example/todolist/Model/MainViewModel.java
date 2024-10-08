package com.example.todolist.Model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;


import com.example.todolist.App;

import java.util.List;


public class MainViewModel extends ViewModel {

    private LiveData<List<Note>> noteLiveData = App.getInstance().getNoteDao().getAllLiveData();

    public LiveData<List<Note>> getNoteLiveData() {
        return noteLiveData;
    }
}