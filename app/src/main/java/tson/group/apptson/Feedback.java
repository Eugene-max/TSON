package tson.group.apptson;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class Feedback extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);

        WebView webView = (WebView) findViewById(R.id.WV);
        webView.getSettings().setJavaScriptEnabled(true);

        ConnectivityManager CM = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        if (CM.getNetworkInfo(0).getState() == NetworkInfo.State.CONNECTED || CM.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED) {
            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfjG_KNq5PE9EqEcnMuz6PY1wfIPLRri016DLrsODUSE-nY1w/viewform?usp=pp_url");
        } else {
            setContentView(R.layout.no_internet);
        }
        webView.setWebViewClient(new MyWebViewClient());

    }

    public void Back(View view) {
        onBackPressed();
    }

    public void Retry(View view) {
        onBackPressed();
        startActivity(new Intent(this, Feedback.class));
    }
}
