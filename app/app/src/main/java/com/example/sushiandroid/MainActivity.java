package com.example.sushiandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToNigiri(View v) {
        String title = "Nigiri";
        Intent i = new Intent(this, Category.class);
        i.putExtra("title",(String) title);
        startActivity(i);
    }
    public void goToShasimi(View v) {
        String title = "Shasimi";
        Intent i = new Intent(this, Category.class);
        i.putExtra("title",(String) title);
        startActivity(i);
    }
    public void goToUramaki(View v) {
        String title = "Uramaki";
        Intent i = new Intent(this, Category.class);
        i.putExtra("title",(String) title);
        startActivity(i);
    }
    public void goToMaki(View v) {
        String title = "Maki";
        Intent i = new Intent(this, Category.class);
        i.putExtra("title",(String) title);
        startActivity(i);
    }

}
