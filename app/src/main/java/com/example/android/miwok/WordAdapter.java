package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    //stores the resource id of a color that we want to set as background for textview in list item
    private int mColorRecourceId;
    public WordAdapter(Activity context, ArrayList<Word> words , int colorRecourceId){
        super(context,0,words);
        mColorRecourceId = colorRecourceId;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageRecourceId = (ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            imageRecourceId.setImageResource(currentWord.getImageRecourceId());
            imageRecourceId.setVisibility(View.VISIBLE);
        }
        else {
            imageRecourceId.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorRecourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
