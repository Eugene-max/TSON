package tson.group.apptson;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;

public class Notes extends AppCompatActivity {
    static ArrayAdapter<String> arrayAdapter;
    static ArrayList<String> notes = new ArrayList<>();

    public void AddNote(View view) {
        startActivity(new Intent(getApplicationContext(), NoteDefault.class));
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        ListView OldNote = (ListView) findViewById(R.id.OldNote);
        OldNote.setAdapter(new ArrayAdapter<>(this, R.layout.design_old_note, getResources().getStringArray(R.array.OldNote)));
        OldNote.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                Notes.this.startActivity(new Intent(Notes.this, OldNote.class));
            }
        });
    }

    public void FAB(View view) {
        Snackbar.make(view, (int) R.string.Soon, BaseTransientBottomBar.LENGTH_SHORT).setAction((CharSequence) "Action", (View.OnClickListener) null).show();
    }

    public void Back(View view) {
        onBackPressed();
    }

    public void Menu(View view) {
        startActivity(new Intent(this, Menu.class));
    }
}
