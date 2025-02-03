package com.example.noteapplicationusingdatabase.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.noteapplicationusingdatabase.Model.Note;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT *  FROM Note_Database ORDER BY id ASC")
    LiveData<List<Note>> getallNotes();
    @Update
    void UpdateNotes (Note note);

    @Insert
    void insertNotes (Note... notes);


    @Query("DELETE FROM Note_Database WHERE id=:id")
    void deleteNotes(int id);






}
