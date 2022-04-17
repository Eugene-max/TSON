package tson.group.apptson;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void Back(View view) {
        onBackPressed();
    }

    public void AboutApp(View view) {
        startActivity(new Intent(this, AboutApp.class));
    }

    public void Feedback(View view) {
        View layout = getLayoutInflater().inflate(R.layout.loading, findViewById(R.id.loading));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
        startActivity(new Intent(this, Feedback.class));
    }

    public void BugReport(View view) {
        View layout = getLayoutInflater().inflate(R.layout.loading, findViewById(R.id.loading));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
        startActivity(new Intent(this, BugReport.class));
    }
}
