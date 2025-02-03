package com.example.noteapplicationusingdatabase.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.noteapplicationusingdatabase.Dao.NoteDao;
import com.example.noteapplicationusingdatabase.Database.NoteDatabase;
import com.example.noteapplicationusingdatabase.Model.Note;

import java.util.List;



public class NoteRepository {

    private NoteDao noteDao;
    private LiveData<List<Note>> getallNotes;


    public NoteRepository(Application application) {


        NoteDatabase database = NoteDatabase.getInstance(application);

        noteDao = database.noteDao();

        getallNotes = noteDao.getallNotes();

    }

    public void insertNotes(Note note) {

        noteDao.insertNotes(note);

    }

    public void updateNotes(Note note) {

        noteDao.UpdateNotes(note);
    }

    public void deleteNotes(int id) {
        noteDao.deleteNotes(id);


    }

    public LiveData<List<Note>> getAllNotes() {

        return noteDao.getallNotes();
    }

//    private static class InsertNoteAsyncTask extends AsyncTask<Note, Void, Void> {
//
//
//        private NoteDao noteDao;
//
//        private InsertNoteAsyncTask(NoteDao noteDao) {
//
//            this.noteDao = noteDao;
//        }
//
//        @Override
//        protected Void doInBackground(Note... notes) {
//
//            noteDao.insert(notes[0]);
//            return null;
//        }
//    }


//    private static class UpdateNoteAsyncTask extends AsyncTask<Note, Void, Void> {
//
//
//        private NoteDao noteDao;
//
//        private UpdateNoteAsyncTask(NoteDao noteDao) {
//
//            this.noteDao = noteDao;
//        }
//
//        @Override
//        protected Void doInBackground(Note... notes) {
//
//            noteDao.Update(notes[0]);
//            return null;
//        }
//
//    }

//    private static class DeleteNoteAsyncTask extends AsyncTask<Note, Void, Void> {
//
//
//        private NoteDao noteDao;
//
//        private DeleteNoteAsyncTask(NoteDao noteDao) {
//
//            this.noteDao = noteDao;
//        }
//
//        @Override
//        protected Void doInBackground(Note... notes) {
//
//            noteDao.Delete(notes[0]);
//            return null;
//        }
//
//    }

}
