package com.example.sushiandroid;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {
    // After completion of 2000 ms, the next activity will get started.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // This method is used so that your splash activity can cover the entire screen.

        setContentView(R.layout.activity_splash);
        // This will bind your MainActivity.class file with activity_main.

        int SPLASH_SCREEN_TIME_OUT = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this,
                        MainActivity.class);
                // Intent is used to switch from one activity to another.

                startActivity(i);
                // Invoke the SecondActivity.

                finish();
                // The current activity will get finished.
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}
