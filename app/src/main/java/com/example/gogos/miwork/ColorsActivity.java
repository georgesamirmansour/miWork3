package com.example.gogos.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private ArrayList<word> words = new ArrayList<word>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        arrayList();
        arrayAdaptor();
    }

    private void arrayList() {

        words.add(new word("red", "weṭeṭṭi", R.drawable.color_red));
        words.add(new word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
        words.add(new word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new word("green", "chokokki", R.drawable.color_green));
        words.add(new word("brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new word("gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new word("black", "kululli", R.drawable.color_black));
        words.add(new word("white", "kelelli", R.drawable.color_white));
    }

    private void arrayAdaptor() {
        WordAdaptor itemsAdaptor =
                new WordAdaptor(this, words, R.color.category_colors);
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
