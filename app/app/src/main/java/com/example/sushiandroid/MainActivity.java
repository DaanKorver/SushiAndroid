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

    public void createFoodGroup(View v) {
        String tag =  (String) v.getTag();
        Intent i = new Intent(this, Category.class);
        i.putExtra("title", tag);
        startActivity(i);
    }

}
