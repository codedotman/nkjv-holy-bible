package com.bible.amplified.test.bible.Life;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bible.amplified.test.bible.R;

import java.util.ArrayList;

/**
 * Created by USER on 14/03/2019.
 */

public class WordAdapter extends ArrayAdapter<word> {

    public WordAdapter(Context context, ArrayList<word> words) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        word currentWord = getItem(position);

        TextView defaultTextView = listItemView.findViewById(R.id.txtBible);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }

}
