package com.example.noteapplicationusingdatabase.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Note_Database")
public class Note {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "notes_title")
    public String notesTitle;

    @ColumnInfo(name = "notes_subtitle")
    public String notesSubtitle;

    @ColumnInfo(name = "notes")
    public String notes;
    @ColumnInfo(name = "notes_date")
    public String notesDate;

    @ColumnInfo(name = "notes_priority")
    public String notesPriority;
}



//    public Note(String title, String description) {
//        this.title = title;
//        this.description = description;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//
//    public void setId(int id) {
//        this.id = id;
//    }
//}
