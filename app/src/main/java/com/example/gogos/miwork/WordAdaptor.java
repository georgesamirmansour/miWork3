package com.example.gogos.miwork;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gogos on 2017-10-27.
 */

public class WordAdaptor extends ArrayAdapter<word> {
    private int mColorRecourseId;
    public WordAdaptor(Activity context, ArrayList<word> word, int colorRecourseId) {
        super(context, 0, word);
        mColorRecourseId = colorRecourseId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        word currentWord = getItem(position);
        TextView miworkTextView = listItemView.findViewById(R.id.miwork_text_view);
        miworkTextView.setText(currentWord.getMiWorkWord());
        TextView englishTextView = listItemView.findViewById(R.id.default_text_view);
        englishTextView.setText(currentWord.getEnglishWord());
        ImageView imageView = listItemView.findViewById(R.id.miwork_image_view);
        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }else {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorRecourseId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
