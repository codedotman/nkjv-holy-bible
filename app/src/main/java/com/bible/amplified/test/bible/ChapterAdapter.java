package com.bible.amplified.test.bible;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bible.amplified.test.bible.Model.Chapter;

import java.util.List;

/**
 * Created by USER on 06/03/2019.
 */

public class ChapterAdapter extends ArrayAdapter<Chapter> {

    Context context;
    int layoutResourceId;
    List<Chapter> data = null;

    public ChapterAdapter(Context context, int layoutResourceId, List<Chapter> data) {
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
            holder.txtBible = (TextView)row.findViewById(R.id.txtBible);

            row.setTag(holder);
        }
        else
        {
            holder = (WeatherHolder)row.getTag();
        }

        Chapter weather = data.get(position);
        String str = weather.toString();
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
