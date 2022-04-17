package tson.group.apptson;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AboutApp extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_app);
    }

    public void Update_VA(View view) {
        View layout = getLayoutInflater().inflate(R.layout.loading, findViewById(R.id.loading));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
        startActivity(new Intent(this, UpdateVA.class));
    }

    public void WhatsNew(View view) {
        startActivity(new Intent(this, WhatsNew.class));
    }

    public void Developer(View view) {
        startActivity(new Intent(this, Developer.class));
    }

    public void Back(View view) {
        onBackPressed();
    }
}
