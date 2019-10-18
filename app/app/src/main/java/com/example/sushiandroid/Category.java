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
                    Food tonijn  = new Food("Tonijn", "This is a test", 3.95);
                    Food miami   = new Food("Miami", "This is a test", 3.95);
                    Food krab    = new Food("Krab", "This is a test", 4.95);
                    Food omelet  = new Food("Omelet", "This is a test", 3.95);
                    Food palling = new Food("Palling", "This is a test", 8.95);

                    imageView.setImageResource(R.drawable.nigiri);
                    String[] nigiriArray = {"nigiri_tonijn", "nigiri_miami", "nigiri_krab", "nigiri_omelet", "nigiri_palling"};
                    drawProducts(nigiriArray);
                    break;
//                case "shasimi":
//                    imageView.setImageResource(R.drawable.nigiri);
//                    String[] shasimiArray = {"shasimi_tataki_van_zalm", "shasimi_menu_zalm", "shasimi_mix", "shasimi_tonijn", "shasimi_zalm"};
//                    drawProducts(shasimiArray);
//                    break;
//                case "uramaki":
//                    imageView.setImageResource(R.drawable.uramaki);
//                    String[] uramakiArray = {"uramaki_pittig_tonijn", "uramaki_california", "uramaki_zalm", "uramaki_zeewier", "uramaki_vegetarisch", "uramaki_tempura_ebi"};
//                    drawProducts(uramakiArray);
//                    break;
//                case "maki":
//                    imageView.setImageResource(R.drawable.maki);
//                    String[] makiArray = {"maki_avocado", "maki_zalm", "maki_komkommer", "maki_garnaal", "maki_daikon", "maki_tonijn"};
//                    drawProducts(makiArray);
//                    break;
                default:
                    // code block
            }
        }
    }

    public void drawProducts(String[] products) {
        Log.i("Creating Views Products", "started");

        // The layout the products go int
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll);

        // A for loop for every product
        for (String product : products) {
            // Loging the product name
            Log.i("Creating View Product", product);

            // Creates a layout for the text-layout and the image with the "holder" style
            ConstraintLayout holder = new ConstraintLayout(new ContextThemeWrapper(this, R.style.holder));
            // todo: figure out why the margin isn't working (declared in styles.xml line 24

            // Creates a textview to test if the string variable works with the "title" style
            TextView text = new TextView(new ContextThemeWrapper(this, R.style.title));

            // Nests it and it's it to the view
            text.setText(getResources().getIdentifier(product, "string", getPackageName()));

            holder.addView(text);
            ll.addView(holder);
        }

        // Confirms the function has finished
        Log.i("Creating Views Products", "ended");
    }

}
