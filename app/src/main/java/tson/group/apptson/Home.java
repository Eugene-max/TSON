package tson.group.apptson;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
//        setContentView(R.layout.home_college);
    }

    public void ScheduleOfCalls(View v) {
        startActivity(new Intent(this, ScheduleOfCalls.class));
    }

    public void ScheduleOfLessons(View v) {
        startActivity(new Intent(this, ScheduleOfLessons.class));
    }

    public void ScheduleOfCallsCollege(View v) {
        startActivity(new Intent(this, ScheduleOfCallsCollege.class));
    }

    public void ScheduleOfClass(View v) {
        startActivity(new Intent(this, ScheduleOfClass.class));
    }

    public void Homework(View v) {
        startActivity(new Intent(this, Homework.class));
    }

    public void Homework_College(View v) {
        startActivity(new Intent(this, HomeworkCollege.class));
    }

    public void Menu(View view) {
        startActivity(new Intent(this, Menu.class));
    }

    public void Calculator(View view) {
        startActivity(new Intent(this, Calculator.class));
    }

    public void MSE(View view) {
        View layout = getLayoutInflater().inflate(R.layout.loading, findViewById(R.id.loading));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
        startActivity(new Intent(this, MainStateExam.class));
    }

    public void USE(View view) {
        View layout = getLayoutInflater().inflate(R.layout.loading, findViewById(R.id.loading));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
        startActivity(new Intent(this, MainStateExam.class));
    }

    public void Notes(View view) {
        startActivity(new Intent(this, OldNote.class));
    }
}
