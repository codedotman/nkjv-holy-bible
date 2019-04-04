package com.bible.amplified.test.bible.Life;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bible.amplified.test.bible.Model.Library;
import com.bible.amplified.test.bible.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LifeIssuesDetailFragment extends Fragment {


    public LifeIssuesDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_life_issues_detail, container, false);

        int Book1 = getArguments().getInt("Book1");
        int chapter1 = getArguments().getInt("Chapter1");
        int verse1 = getArguments().getInt("verse1");

        int Book2 = getArguments().getInt("Book2");
        int chapter2 = getArguments().getInt("Chapter2");
        int verse2 = getArguments().getInt("verse2");

        int Book3 = getArguments().getInt("Book3");
        int chapter3 = getArguments().getInt("Chapter3");
        int verse3 = getArguments().getInt("verse3");

        int Book4 = getArguments().getInt("Book4");
        int chapter4 = getArguments().getInt("Chapter4");
        int verse4 = getArguments().getInt("verse4");

        int Book5 = getArguments().getInt("Book5");
        int chapter5 = getArguments().getInt("Chapter5");
        int verse5 = getArguments().getInt("verse5");
        Log.d("iginLatlng", Library.getInstance().getBible(0).getBook(Book1).toString());


        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word (String.valueOf(Library.getInstance().getBible(0).getBook(Book1)+ " " +Library.getInstance().getBible(0).getBook(Book1).getChapter(chapter1)),Library.getInstance().getBible(0).getBook(Book1).getChapter(chapter1).getVerse(verse1).toString()));
        words.add(new word (String.valueOf(Library.getInstance().getBible(0).getBook(Book2)+ " " +Library.getInstance().getBible(0).getBook(Book2).getChapter(chapter2)),Library.getInstance().getBible(0).getBook(Book2).getChapter(chapter2).getVerse(verse2).toString()));
        words.add(new word (String.valueOf(Library.getInstance().getBible(0).getBook(Book3)+ " " +Library.getInstance().getBible(0).getBook(Book3).getChapter(chapter3)),Library.getInstance().getBible(0).getBook(Book3).getChapter(chapter3).getVerse(verse3).toString()));
        words.add(new word (String.valueOf(Library.getInstance().getBible(0).getBook(Book4)+ " " +Library.getInstance().getBible(0).getBook(Book4).getChapter(chapter4)),Library.getInstance().getBible(0).getBook(Book4).getChapter(chapter4).getVerse(verse4).toString()));
        words.add(new word (String.valueOf(Library.getInstance().getBible(0).getBook(Book5)+ " " +Library.getInstance().getBible(0).getBook(Book5).getChapter(chapter5)),Library.getInstance().getBible(0).getBook(Book5).getChapter(chapter5).getVerse(verse5).toString()));


        DetailWordAdapter adapter = new DetailWordAdapter(getActivity(), words);
        ListView listView = view.findViewById(R.id.life_issues_detail_listview);
        listView.setAdapter(adapter);

        return view;
    }

}
