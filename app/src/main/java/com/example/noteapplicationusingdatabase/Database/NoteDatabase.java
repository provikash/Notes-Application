package com.example.noteapplicationusingdatabase.Database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.noteapplicationusingdatabase.Model.Note;
import com.example.noteapplicationusingdatabase.Dao.NoteDao;

import org.jetbrains.annotations.NotNull;

@Database(entities= Note.class,version = 1)
public abstract class NoteDatabase extends RoomDatabase {

    public static NoteDatabase instance;

    public abstract NoteDao noteDao();

    public static NoteDatabase getInstance(Context context){


        if(instance==null) {
            instance= Room.databaseBuilder(context.getApplicationContext()
                            , NoteDatabase.class,
                    "Note_Database").build();


        }

        return instance;
    }


//    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback(){
//
//        @Override
//        public  void onCreate(@NotNull SupportSQLiteDatabase db){
//
//            super.onCreate(db);
//
//           new PopulateDbAsyncTask(instance).execute();
//
//
//        }
//
//    };

//    private static class PopulateDbAsyncTask extends AsyncTask< Void,Void,Void>{
//
//
//        private NoteDao noteDao;
//
//        private PopulateDbAsyncTask(NoteDatabase database){
//
//            noteDao= database.noteDao();
//        }

//        @Override
//        protected Void doInBackground(Void... voids){
//
//            noteDao.insert(new Note( "Title 1", "Description1"));
//
//            noteDao.insert(new Note( "Title 2", "Description2"));
//            noteDao.insert(new Note( "Title 3", "Description3"));
//            noteDao.insert(new Note( "Title 4", "Description4"));
//            return null;
//        }
//    }


}
