package tson.group.apptson;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ScheduleOfCallsCollege extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_of_calls_college);
    }

    public void Back(View v) {
        onBackPressed();
    }

    public void Menu(View view) {
        startActivity(new Intent(this, Menu.class));
    }
}
