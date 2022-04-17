package tson.group.apptson;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class Homework extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework);

        ListView LV = (ListView) findViewById(R.id.LV);
        LV.setAdapter(new ArrayAdapter<>(this, R.layout.my_list_item, getResources().getStringArray(R.array.Lessons)));

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                switch (position) {
                    case 0:
                        Homework.this.startActivity(new Intent(Homework.this, Algebra.class));
                        return;
                    case 1:
                        Homework.this.startActivity(new Intent(Homework.this, English.class));
                        return;
                    case 2:
                        Homework.this.startActivity(new Intent(Homework.this, Biology.class));
                        return;
                    case 3:
                        Homework.this.startActivity(new Intent(Homework.this, Geography.class));
                        return;
                    case 4:
                        Homework.this.startActivity(new Intent(Homework.this, Geometry.class));
                        return;
                    case 5:
                        Homework.this.startActivity(new Intent(Homework.this, ComputerScience.class));
                        return;
                    case 6:
                        Homework.this.startActivity(new Intent(Homework.this, History.class));
                        return;
                    case 7:
                        Homework.this.startActivity(new Intent(Homework.this, ClassHour.class));
                        return;
                    case 8:
                        Homework.this.startActivity(new Intent(Homework.this, Literature.class));
                        return;
                    case 9:
                        Homework.this.startActivity(new Intent(Homework.this, Math.class));
                        return;
                    case 10:
                        Homework.this.startActivity(new Intent(Homework.this, MathWorkshop.class));
                        return;
                    case 11:
                        Homework.this.startActivity(new Intent(Homework.this, German.class));
                        return;
                    case 12:
                        Homework.this.startActivity(new Intent(Homework.this, RussianLanguageNorms.class));
                        return;
                    case 13:
                        Homework.this.startActivity(new Intent(Homework.this, SocialScience.class));
                        return;
                    case 14:
                        Homework.this.startActivity(new Intent(Homework.this, SocialScienceUSE.class));
                        return;
                    case 15:
                        Homework.this.startActivity(new Intent(Homework.this, LSB.class));
                        return;
                    case 16:
                        Homework.this.startActivity(new Intent(Homework.this, Law.class));
                        return;
                    case 17:
                        Homework.this.startActivity(new Intent(Homework.this, SchoolProject.class));
                        return;
                    case 18:
                        Homework.this.startActivity(new Intent(Homework.this, Russian.class));
                        return;
                    case 19:
                        Homework.this.startActivity(new Intent(Homework.this, NRL.class));
                        return;
                    case 20:
                        Homework.this.startActivity(new Intent(Homework.this, Essays.class));
                        return;
                    case 21:
                        Homework.this.startActivity(new Intent(Homework.this, ProfessionalCareerTechnology.class));
                        return;
                    case 22:
                        Homework.this.startActivity(new Intent(Homework.this, French.class));
                        return;
                    case 23:
                        Homework.this.startActivity(new Intent(Homework.this, Physics.class));
                        return;
                    case 24:
                        Homework.this.startActivity(new Intent(Homework.this, PE.class));
                        return;
                    case 25:
                        Homework.this.startActivity(new Intent(Homework.this, FinancialLiteracy.class));
                        return;
                    case 26:
                        Homework.this.startActivity(new Intent(Homework.this, Chemistry.class));
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
