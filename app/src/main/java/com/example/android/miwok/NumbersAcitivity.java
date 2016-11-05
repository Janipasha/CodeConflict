package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.numbers;

public class NumbersAcitivity extends AppCompatActivity {
    int index =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_acitivity);

        // Create a list of words
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one", "lutti", R.drawable.number_one,R.raw.number_one));
        words.add(new word("two", "otiiko",R.drawable.number_two,R.raw.number_two));
        words.add(new word("three", "tolookosu",R.drawable.number_three,R.raw.number_three));
        words.add(new word("four", "oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new word("five", "massokka",R.drawable.number_five,R.raw.number_five));
        words.add(new word("six", "temmokka",R.drawable.number_six,R.raw.number_six));
        words.add(new word("seven", "kenekaku",R.drawable.number_seven,R.raw.number_seven));
        words.add(new word("eight", "kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new word("nine", "wo’e",R.drawable.number_nine,R.raw.number_nine));
        words.add(new word("ten", "na’aacha",R.drawable.number_ten,R.raw.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);



    }
}
