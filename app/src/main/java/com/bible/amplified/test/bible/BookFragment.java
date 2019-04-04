package com.bible.amplified.test.bible;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.bible.amplified.test.bible.Model.Library;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookFragment extends Fragment {


    public BookFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_book, container, false);

        int value = getArguments().getInt("book");
        int chapterValue = getArguments().getInt("chapter");
        String bookN= getArguments().getString("bknm");
        int boookNum = getArguments().getInt("nm");


        Log.d("iginLatlng", String.valueOf(value));
        TextView bookChapter = view.findViewById(R.id.bk_n_ch);
        bookChapter.setText(bookN + " " + boookNum);

        BookAdapter adapter = new BookAdapter(getActivity(), R.layout.bible_detail_list_item, Library.getInstance().getBible(0).getBook(value).getChapter(chapterValue).getVerses(), Library.getInstance().getBible(0).getBook(value).getChapter(chapterValue).getVerse(4) );
        ListView chapterList =  view.findViewById(R.id.list_book);
        chapterList.setAdapter(adapter);
        return view;
    }

}
