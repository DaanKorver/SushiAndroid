package com.example.sushiandroid;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
                    String nigiriArray[] = {"a","b","c","d"};
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

    public void drawProducts(String products[]) {
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll);
        for (String product : products) {
            ConstraintLayout holder = new ConstraintLayout(this);
            TextView text = new TextView(this);
            text.setText((String) product);
            holder.addView(text);
            ll.addView(holder);
        }
    }
}
