package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.color.black;
import static android.R.color.white;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("red", "weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        words.add(new word("green", "otiiko",R.drawable.color_green,R.raw.color_green));
        words.add(new word("brown", "tolookosu",R.drawable.color_brown,R.raw.color_brown));
        words.add(new word("gray", "oyyisa",R.drawable.color_gray,R.raw.color_gray));
        words.add(new word("black", "massokka",R.drawable.color_black,R.raw.color_black));
        words.add(new word("white", "temmokka",R.drawable.color_white,R.raw.color_white));
        words.add(new word("dusty yellow", "kenekaku",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new word("mustard yellow", "kawinta",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView colorView = (ListView) findViewById(R.id.colors);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        colorView.setAdapter(adapter);


    }
}
