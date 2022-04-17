package tson.group.apptson;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SocialScience extends AppCompatActivity {
    private static final String FILENAME = "homework_social_studie.tson";
    private EditText mEditText;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.homework_page);

        TextView Heading = findViewById(R.id.Heading);
        Heading.setText(R.string.Social_Science);

        this.mEditText = findViewById(R.id.Edit);
        openFile(FILENAME);
    }

    private void openFile(String fileName) {
        try {
            InputStream inputStream = openFileInput(fileName);
            if (inputStream != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder builder = new StringBuilder();
                while (true) {
                    String readLine = reader.readLine();
                    String line = readLine;
                    if (readLine != null) {
                        builder.append(line + "\n");
                    } else {
                        inputStream.close();
                        this.mEditText.setText(builder.toString());
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            View layout = getLayoutInflater().inflate(R.layout.error, findViewById(R.id.custom_toast_container));
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }
    }

    private void saveFile(String fileName) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(openFileOutput(fileName, 0));
            osw.write(this.mEditText.getText().toString());
            osw.close();
        } catch (Throwable th) {
            View layout = getLayoutInflater().inflate(R.layout.error, findViewById(R.id.custom_toast_container));
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }
    }

    public void Open(View view) {
        openFile(FILENAME);
    }

    public void Save(View view) {
        saveFile(FILENAME);
        View layout = getLayoutInflater().inflate(R.layout.custom_toast, findViewById(R.id.custom_toast_container));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    public void Back(View view) {
        saveFile(FILENAME);
        onBackPressed();
    }

    public void Menu(View view) {
        startActivity(new Intent(this, Menu.class));
    }
}
