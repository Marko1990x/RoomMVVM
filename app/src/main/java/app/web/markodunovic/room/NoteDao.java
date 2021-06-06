package app.web.markodunovic.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {

    //must be either interface or abstract classes because we dont provide the method body
    // room will generate necesary coede

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    // qurry is different because room doesnt have some premade options like delete all from table
    // so i have to query

    @Query("DELETE FROM note_table")
    void deleteAllNotes();

    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes();

    // the live data gimmick is that it can be observed unlike the list
    // so any changes will be automaticly shown and updated by room

    // annotate , define a method name the return type and the arguments
    // and room will generate the neccesary code
}
