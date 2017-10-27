package com.example.gogos.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private ArrayList<word> words = new ArrayList<word>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        arrayList();
        arrayAdaptor();
    }

    private void arrayList() {

        words.add(new word("Where are you going?", "minto wuksus"));
        words.add(new word("what is your name?", "tinnә oyaase'nә"));
        words.add(new word("my name is", "oyaaset..."));
        words.add(new word("How are you feeling?", "michәksәs?"));
        words.add(new word("I’m feeling good.", "kuchi achit"));
        words.add(new word("Are you coming?", "әәnәs'aa?"));
        words.add(new word("Yes, I’m coming", "hәә’ әәnәm"));
        words.add(new word("I’m coming.", "әәnәm"));
        words.add(new word("Let’s go. ", "yoowutis"));
        words.add(new word("Come here", "әnni'nem"));
    }

    private void arrayAdaptor() {
        WordAdaptor itemsAdaptor =
                new WordAdaptor(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdaptor);
    }

//    public void fillInTextView() {
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        for (int index = 0; index < words.size(); index++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//        }
//    }
}
