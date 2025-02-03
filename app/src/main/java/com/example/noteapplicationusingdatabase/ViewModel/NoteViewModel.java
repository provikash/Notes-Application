package com.example.noteapplicationusingdatabase.ViewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.noteapplicationusingdatabase.Dao.NoteDao;
import com.example.noteapplicationusingdatabase.Model.Note;
import com.example.noteapplicationusingdatabase.Repository.NoteRepository;

import java.util.List;

public class  NoteViewModel extends AndroidViewModel {


    private NoteRepository repository;
    private LiveData<List<Note>> getallNotes;
    public NoteViewModel( Application application) {
        super(application);

        repository = new NoteRepository(application);

        getallNotes= repository.getAllNotes();
    }

    public void insertNote(Note note){

        repository.insertNotes(note);
    }

    public void updateNotes(Note note){

        repository.updateNotes(note);
    }


    public void deleteNotes(int id){

        repository.deleteNotes(id);
    }

  



}
