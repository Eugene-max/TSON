package tson.group.apptson;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class ScheduleOfLessons extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_of_lessons);

        WebView webView = (WebView) findViewById(R.id.WVSL);
        webView.getSettings().setJavaScriptEnabled(true);


        ConnectivityManager CM = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        if (CM.getNetworkInfo(0).getState() == NetworkInfo.State.CONNECTED || CM.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED) {
            int currentNightMode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
            switch (currentNightMode) {
                case Configuration.UI_MODE_NIGHT_NO:
                    webView.loadUrl("https://clck.ru/atqLa");
                    break;
                case Configuration.UI_MODE_NIGHT_YES:
                    webView.loadUrl("https://clck.ru/atqJ5");
                    break;
            }
        } else {
            setContentView(R.layout.no_internet_sol);
        }
        webView.setWebViewClient(new MyWebViewClient());
    }

    public void Back(View v) {
        onBackPressed();
    }

    public void Menu(View view) {
        startActivity(new Intent(this, Menu.class));
    }

    public void Retry(View view) {
        onBackPressed();
        startActivity(new Intent(this, ScheduleOfLessons.class));
    }
}
