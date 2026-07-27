package com.swadiaking.androidtemplate;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a text view programmatically
        TextView textView = new TextView(this);
        textView.setText("Hello World");
        textView.setTextSize(24);
        textView.setGravity(Gravity.CENTER);

        // Display the text view on the screen
        setContentView(textView);
    }
}
