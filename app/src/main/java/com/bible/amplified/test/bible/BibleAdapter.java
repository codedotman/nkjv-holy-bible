package com.bible.amplified.test.bible;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bible.amplified.test.bible.Model.Book;

import java.util.List;

/**
 * Created by USER on 04/03/2019.
 */

public class BibleAdapter extends ArrayAdapter<Book> {

    Context context;
    int layoutResourceId;
    List<Book> data = null;

    public BibleAdapter(Context context, int layoutResourceId, List<Book> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        WeatherHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new WeatherHolder();
            holder.txtBible = row.findViewById(R.id.txtBible);

            row.setTag(holder);
        }
        else
        {
            holder = (WeatherHolder)row.getTag();
        }

        Book weather = data.get(position);
        String str = weather.getName();
        if(str.length() > 40) {
            str = str.substring(0, 40);
        }
        holder.txtBible.setText(str);

        return row;
    }

    static class WeatherHolder
    {
        TextView txtBible;
    }
}
