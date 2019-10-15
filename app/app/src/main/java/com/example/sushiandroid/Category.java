package com.example.sushiandroid;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.ViewGroup.MarginLayoutParams;

import static java.security.AccessController.getContext;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catergory);

        Bundle extras = getIntent().getExtras();

        TextView textView = (TextView) findViewById(R.id.titleTextView);
        ImageView imageView = (ImageView) findViewById(R.id.categoryBackground);
        if (extras != null) {
            String title = extras.getString("title");

            textView.setText((String) title);
            assert title != null;
            switch ((String) title.toLowerCase()) {
                case "nigiri":
                    imageView.setImageResource(R.drawable.nigiri);
                    String[] nigiriArray = {"nigiri A", "nigiri B", "nigiri C", "nigiri D"};
                    drawProducts(nigiriArray);
                    break;
                case "shasimi":
                    imageView.setImageResource(R.drawable.nigiri);
                    break;
                case "uramaki":
                    imageView.setImageResource(R.drawable.uramaki);
                    break;
                case "maki":
                    imageView.setImageResource(R.drawable.maki);
                    break;
                default:
                    // code block
            }
        }
    }

    public void drawProducts(String[] products) {

        Log.i("Creating Views Products", "started");
        // the layout the products go int
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll);

        // a for loop for every product
        for (String product : products) {

            // loging the product name
            Log.i("Creating View Product", product);

            // creates a layout for the text-layout and the image with the "holder" style
            ConstraintLayout holder = new ConstraintLayout(new ContextThemeWrapper(this, R.style.holder));
            // todo: figure out why the margin isn't working (declared in styles.xml line 24

            // creates a textview to test if the string variable works with the "title" style
            TextView text = new TextView(new ContextThemeWrapper(this, R.style.title));


            // nests it and it's it to the view
            text.setText((String) product);
            holder.addView(text);
            ll.addView(holder);
        }

        // confirms the function has finished
        Log.i("Creating Views Products", "ended");
    }
}
