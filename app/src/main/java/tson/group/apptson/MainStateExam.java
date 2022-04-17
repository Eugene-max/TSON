package tson.group.apptson;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainStateExam extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = findViewById(R.id.WV_MSE);
        webView.getSettings().setJavaScriptEnabled(true);


        ConnectivityManager CM = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        if (CM.getNetworkInfo(0).getState() == NetworkInfo.State.CONNECTED || CM.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED) {
            webView.loadUrl("https://drive.google.com/drive/mobile/folders/1bfWRuxo-Dow3jq74G4FCB7D1m4dH_dNs?usp=sharing");
        } else {
            setContentView(R.layout.no_internet);
        }
        webView.setWebViewClient(new MyWebViewClient());

    }

    public void Back(View view) {
        onBackPressed();
    }

    public void Menu(View view) {
        startActivity(new Intent(this, Menu.class));
    }

    public void Retry(View view) {
        onBackPressed();
        startActivity(new Intent(this, MainStateExam.class));
    }
}
