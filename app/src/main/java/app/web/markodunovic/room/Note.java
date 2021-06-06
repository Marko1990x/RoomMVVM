package app.web.markodunovic.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {
        // by default the name of the table is the same as the class it was made from but
        // it can be changed like this

    //member variables for our table

    // auto generates i and increments them
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;

    private String description;

    //@ColumnInfo(name = "priority_name")
    private int priority;


    // need constructor for later create note object and reacreate from database

    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    // room will use this to set id later
    public void setId(int id) {
        this.id = id;
    }

    // need get methods in order to presist this data


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
