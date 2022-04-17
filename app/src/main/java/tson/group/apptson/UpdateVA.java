package tson.group.apptson;

import static android.content.ContentValues.TAG;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
//import com.google.firebase.quickstart.fcm.databinding.ActivityMainBinding;

public class UpdateVA extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update);

//        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            // Create channel to show notifications.
//            String channelId  = getString(R.string.default_notification_channel_id);
//            String channelName = getString(R.string.default_notification_channel_name);
//            NotificationManager notificationManager =
//                    getSystemService(NotificationManager.class);
//            notificationManager.createNotificationChannel(new NotificationChannel(channelId,
//                    channelName, NotificationManager.IMPORTANCE_LOW));
//        }
//
//        if (getIntent().getExtras() != null) {
//            for (String key : getIntent().getExtras().keySet()) {
//                Object value = getIntent().getExtras().get(key);
//                Log.d(TAG, "Key: " + key + " Value: " + value);
//            }
//        }
//
//        binding.subscribeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "Subscribing to weather topic");
//                // [START subscribe_topics]
//                FirebaseMessaging.getInstance().subscribeToTopic("weather")
//                        .addOnCompleteListener(new OnCompleteListener<Void>() {
//                            @Override
//                            public void onComplete(@NonNull Task<Void> task) {
//                                String msg = getString(R.string.msg_subscribed);
//                                if (!task.isSuccessful()) {
//                                    msg = getString(R.string.msg_subscribe_failed);
//                                }
//                                Log.d(TAG, msg);
//                                Toast.makeText(UpdateVA.this, msg, Toast.LENGTH_SHORT).show();
//                            }
//                        });
//                // [END subscribe_topics]
//            }
//        });
//
//        binding.logTokenButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Get token
//                // [START log_reg_token]
//                FirebaseMessaging.getInstance().getToken()
//                        .addOnCompleteListener(new OnCompleteListener<String>() {
//                            @Override
//                            public void onComplete(@NonNull Task<String> task) {
//                                if (!task.isSuccessful()) {
//                                    Log.w(TAG, "Fetching FCM registration token failed", task.getException());
//                                    return;
//                                }
//
//                                // Get new FCM registration token
//                                String token = task.getResult();
//
//                                // Log and toast
//                                String msg = getString(R.string.msg_token_fmt, token);
//                                Log.d(TAG, msg);
//                                Toast.makeText(UpdateVA.this, msg, Toast.LENGTH_SHORT).show();
//                            }
//                        });
//                // [END log_reg_token]
//            }
//        });

        WebView webView = findViewById(R.id.WV_U);
        webView.getSettings().setJavaScriptEnabled(true);



        ConnectivityManager CM = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        if (CM.getNetworkInfo(0).getState() == NetworkInfo.State.CONNECTED || CM.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED) {
            webView.loadUrl("https://sites.google.com/view/update-tson/%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F-%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        } else {
            setContentView(R.layout.no_internet);
        }
        webView.setWebViewClient(new MyWebViewClient());

    }

    public void Update_VersionApp(View view) {
        View layout = getLayoutInflater().inflate(R.layout.loading, findViewById(R.id.loading));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

        Intent SchoolUpdate = new Intent("android.intent.action.VIEW", Uri.parse("https://drive.google.com/file/d/1XdBEYDxSqn_tePLEkdlrRHY3yBaGwQ7_/view?usp=sharing"));
        Intent CollegeUpdate = new Intent("android.intent.action.VIEW", Uri.parse("https://drive.google.com/file/d/1fNw4Q1crT73WksM9dHpLQDnwVWxk8oPs/view?usp=sharing"));
        startActivity(SchoolUpdate);
    }



    public void Back(View view) {
        onBackPressed();
    }

    public void Retry(View view) {
        onBackPressed();
        startActivity(new Intent(this, UpdateVA.class));
    }
}
