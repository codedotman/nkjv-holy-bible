package com.bible.amplified.test.bible.Life;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bible.amplified.test.bible.R;

import java.util.ArrayList;

/**
 * Created by USER on 21/03/2019.
 */

public class DetailWordAdapter extends ArrayAdapter<word> {

    public DetailWordAdapter(Context context, ArrayList<word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.life_issues_detail_list_item, parent, false);
        }
        word CurrentWord = getItem(position);

        TextView bookTextView = listItemView.findViewById(R.id.life_bk_nm);
        bookTextView.setText(CurrentWord.getBibleBook());

        TextView bookWordTextView = listItemView.findViewById(R.id.life_txtBible);
        bookWordTextView.setText(CurrentWord.getBibleWord());


        return listItemView;
    }
}
