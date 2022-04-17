package tson.group.apptson;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class ScheduleOfClass extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_of_class);

        WebView webView = (WebView) findViewById(R.id.WVSC);
        webView.getSettings().setJavaScriptEnabled(true);


        ConnectivityManager CM = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        if (CM.getNetworkInfo(0).getState() == NetworkInfo.State.CONNECTED || CM.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED) {
            int currentNightMode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
            switch (currentNightMode) {
                case Configuration.UI_MODE_NIGHT_NO:
                    webView.loadUrl("https://sites.google.com/view/schedule-class-light/%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F-%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
                    break;
                case Configuration.UI_MODE_NIGHT_YES:
                    webView.loadUrl("https://sites.google.com/view/schedule-class-night/%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F-%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
                    break;
            }
        } else {
            setContentView(R.layout.no_internet);
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
        startActivity(new Intent(this, ScheduleOfClass.class));
    }
}
