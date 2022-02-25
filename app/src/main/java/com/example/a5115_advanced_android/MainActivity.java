package com.example.a5115_advanced_android;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String CHANNEL_ID = "0";

    private int lastNotificationId = 0;

    private TextView locationText;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.locationText = (TextView) findViewById(R.id.locationText);
        createNotificationChannel();
    }

    public void createNotification(View view) {
        // Create a Notification
    }

    public void getLocation() {
        // Get the Location
    }

    private void createNotificationChannel() {
        // Create the NotificationChannel
    }
}