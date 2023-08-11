package com.example.callbackexample;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_main);

        EventNotifier eventNotifier = new EventNotifier();
        eventNotifier.setCallbackListener(new CallbackListener() {
            @Override
            public void onCallback(String message) {
                displayMessage(message);
            }
        });

        eventNotifier.performEvent();
    }
    public void displayMessage(String message){
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}


