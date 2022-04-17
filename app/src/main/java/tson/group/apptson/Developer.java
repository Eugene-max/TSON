package tson.group.apptson;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Developer extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developer);
    }

    public void VK_Eugene(View view) {
        View layout = getLayoutInflater().inflate(R.layout.loading, findViewById(R.id.loading));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://vk.com/id349245301")));
    }

    public void Instagram_Eugene(View view) {
        View layout = getLayoutInflater().inflate(R.layout.loading, findViewById(R.id.loading));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/eugenelavrentev/")));
    }

    public void VK_Evgenia(View view) {
        View layout = getLayoutInflater().inflate(R.layout.loading, findViewById(R.id.loading));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://vk.com/id571997484")));
    }

    public void Instagram_Evgenia(View view) {
        View layout = getLayoutInflater().inflate(R.layout.loading, findViewById(R.id.loading));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/jenyfrog/")));
    }

    public void Back(View view) {
        onBackPressed();
    }
}
