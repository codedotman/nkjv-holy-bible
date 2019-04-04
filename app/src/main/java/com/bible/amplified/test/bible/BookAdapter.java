package com.bible.amplified.test.bible;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bible.amplified.test.bible.Model.Verse;

import java.util.List;

/**
 * Created by USER on 07/03/2019.
 */

public class BookAdapter extends ArrayAdapter<Verse> {

    Context context;
    int layoutResourceId;
    List<Verse> data = null;
    Verse meyaa;

    public BookAdapter(Context context, int layoutResourceId, List<Verse> data, Verse meya) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
        this.meyaa = meya;
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
            holder.txtBible = (TextView)row.findViewById(R.id.txtBibleDetail);

            row.setTag(holder);
        }
        else
        {
            holder = (WeatherHolder)row.getTag();
        }

        Verse weather = data.get(position);
        String str = weather.toString();
        //if(str.length() > 40) {
        //    str = str.substring(0, 40);
        //}
        holder.txtBible.setText(str);

        return row;
    }

    static class WeatherHolder
    {
        TextView txtBible;
    }
}
