package com.bible.amplified.test.bible;


import android.content.ClipData;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.bible.amplified.test.bible.Model.Bible;
import com.bible.amplified.test.bible.Model.Library;

import java.io.IOException;


/**
 * A simple {@link Fragment} subclass.
 */
public class BibleFragment extends Fragment {


    public BibleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bible, container, false);

        TextView toolbarTitle = getActivity().findViewById(R.id.toolbar_title);
        toolbarTitle.setText("Bible");



        if (Library.getInstance() != null) {
            try {
                Library.getInstance().init("MyLibrary");

                //add bibles
                XMLPullParserHandler parser = new XMLPullParserHandler();
                Bible Kjv = Library.getInstance().addBible(parser.parse(getActivity().getAssets().open("kjv.xml")));


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BibleAdapter adapter = new BibleAdapter(getActivity(), R.layout.list_item, Library.getInstance().getBible(0).getBooks());
        final ListView BookList = view.findViewById(R.id.list_book);
        BookList.setAdapter(adapter);

        BookList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Fragment fragment2 = new ChapterFragment();
                Bundle bundle = new Bundle();
                String mekat = parent.getAdapter().getItem(position).toString();
                bundle.putInt("key", position); // Put anything what you want
                bundle.putString("book", mekat);
                fragment2.setArguments(bundle);
                android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                fm.beginTransaction().replace(R.id.containerr, fragment2).addToBackStack(null).commit();
                parent.getAdapter().getItem(position);

                Log.d("OriginLatlng", String.valueOf(position));


            }
        });


        return view;


    }


}
