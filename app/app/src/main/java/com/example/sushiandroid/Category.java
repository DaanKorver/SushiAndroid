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
                    String nigiriArray[] = {"nigiri_tonijn", "nigiri_miami", "nigiri_krab", "nigiri_omelet", "nigiri_palling"};
                    drawProducts(nigiriArray);
                    break;
                case "shasimi":
                    imageView.setImageResource(R.drawable.nigiri);
                    String shasimiArray[] = {"shasimi_tataki_van_zalm", "shasimi_menu_zalm", "shasimi_mix", "shasimi_tonijn", "shasimi_zalm"};
                    drawProducts(shasimiArray);
                    break;
                case "uramaki":
                    imageView.setImageResource(R.drawable.uramaki);
                    String uramakiArray[] = {"uramaki_pittig_tonijn", "uramaki_california", "uramaki_zalm", "uramaki_zeewier", "uramaki_vegetarisch", "uramaki_tempura_ebi"};
                    drawProducts(uramakiArray);
                    break;
                case "maki":
                    imageView.setImageResource(R.drawable.maki);
                    String makiArray[] = {"maki_avocado", "maki_zalm", "maki_komkommer", "maki_garnaal", "maki_daikon", "maki_tonijn"};
                    drawProducts(makiArray);
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
