package tson.group.apptson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeworkCollege extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_college);

        ListView LV_College = (ListView) findViewById(R.id.LV_college);
        LV_College.setAdapter(new ArrayAdapter<>(this, R.layout.my_list_item, getResources().getStringArray(R.array.Classes)));

        LV_College.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                switch (position) {
                    case 0:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, Astronomy.class));
                        return;
                    case 1:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, ITTP.class));
                        return;
                    case 2:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, ClassHour.class));
                        return;
                    case 3:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, Math.class));
                        return;
                    case 4:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, SocialScience.class));
                        return;
                    case 5:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, LSB.class));
                        return;
                    case 6:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, Russian.class));
                        return;
                    case 7:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, SoftSkills.class));
                        return;
                    case 8:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, SocialPsychology.class));
                        return;
                    case 9:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, TimeManagement.class));
                        return;
                    case 10:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, Physics.class));
                        return;
                    case 11:
                        HomeworkCollege.this.startActivity(new Intent(HomeworkCollege.this, PE.class));
                        return;
                    default:
                        return;
                }
            }
        });
    }

    public void Back(View v) {
        onBackPressed();
    }

    public void Menu(View view) {
        startActivity(new Intent(this, Menu.class));
    }
}