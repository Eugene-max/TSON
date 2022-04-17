package tson.group.apptson;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.faendir.rhino_android.BuildConfig;
import java.util.HashSet;

public class NoteDefault extends AppCompatActivity {
    int noteID;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note_default);
        EditText editText = (EditText) findViewById(R.id.ET);
        int intExtra = getIntent().getIntExtra("noteID", -1);
        this.noteID = intExtra;
        if (intExtra != -1) {
            editText.setText(Notes.notes.get(this.noteID));
        } else {
            Notes.notes.add(BuildConfig.FLAVOR);
            this.noteID = Notes.notes.size() - 1;
            Notes.arrayAdapter.notifyDataSetChanged();
        }
        editText.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Notes.notes.set(NoteDefault.this.noteID, String.valueOf(s));
                Notes.arrayAdapter.notifyDataSetChanged();
                SharedPreferences sharedPreferences = NoteDefault.this.getApplicationContext().getSharedPreferences("com.tanay.thunderbird.deathnote", 0);
                sharedPreferences.edit().putStringSet("notes", new HashSet<>(Notes.notes)).apply();
            }

            public void afterTextChanged(Editable s) {
            }
        });
    }
}
