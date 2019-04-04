package com.bible.amplified.test.bible;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bible.amplified.test.bible.Model.Library;
import com.bible.amplified.test.bible.Model.Verse;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChapterFragment extends Fragment {

    public ChapterFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chapter, container, false);

        final int value = getArguments().getInt("key");
        final String bookName = getArguments().getString("book");

        TextView selectedBook = view.findViewById(R.id.bk_n_);
        selectedBook.setText(bookName);
        ChapterAdapter adapter = new ChapterAdapter(getActivity(), R.layout.list_item, Library.getInstance().getBible(0).getBook(value).getChapters());
        ListView chapterList =  view.findViewById(R.id.list_chapter);
        chapterList.setAdapter(adapter);

        chapterList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Fragment fragmentBook = new BookFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("book", value);
                bundle.putInt("chapter", position); // Put anything what you want
                bundle.putString("bknm", bookName);
                bundle.putInt("nm", Integer.parseInt(parent.getAdapter().getItem(position).toString()));
                fragmentBook.setArguments(bundle);
                android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                fm.beginTransaction().replace(R.id.chapter_container, fragmentBook).addToBackStack(null).commit();

            }
        });

        return view;
    }


}
