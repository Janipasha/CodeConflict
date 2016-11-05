package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Where are you going?", "minto wuksus",-1,R.raw.phrase_where_are_you_going));
        words.add(new word(" What is your name?", " tinnә oyaase'nә",-1,R.raw.phrase_what_is_your_name));
        words.add(new word("My name is...", "oyaaset...",-1,R.raw.phrase_my_name_is));
        words.add(new word("How are you feeling?", "michәksәs?",-1,R.raw.phrase_how_are_you_feeling));
        words.add(new word("I’m feeling good.", "kuchi achit",-1,R.raw.phrase_im_feeling_good));
        words.add(new word("Are you coming?", "әәnәs'aa?",-1,R.raw.phrase_are_you_coming));
        words.add(new word("Yes, I’m coming.", "hәә’ әәnәm",-1,R.raw.phrase_yes_im_coming));
        words.add(new word("I’m coming.", "әәnәm",-1,R.raw.phrase_im_coming));
        words.add(new word("Let’s go.", "yoowutis",-1,R.raw.phrase_lets_go));
        words.add(new word("Come here.", "әnni'nem",-1,R.raw.phrase_come_here));




        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.phraseslist);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
