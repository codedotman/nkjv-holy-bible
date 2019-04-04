package com.bible.amplified.test.bible.DailyVerse;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bible.amplified.test.bible.NetworkClass;
import com.bible.amplified.test.bible.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.Calendar;
import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 */
public class DailyVerseFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {


    public DailyVerseFragment() {
        // Required empty public constructor
    }

    SwipeRefreshLayout mSwipeRefreshLayout;
    SwipeRefreshLayout.OnRefreshListener listener;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_daily_verse, container, false);

        TextView dateTxt = view.findViewById(R.id.date_txt);
        Calendar calendar = Calendar.getInstance();
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("MMM dd, yyyy", Locale.getDefault());
        String currentDate = dateFormat.format(calendar.getTime());

        dateTxt.setText(currentDate);
        isNetworkAvailable();

        // SwipeRefreshLayout
        mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.mainrl);
        mSwipeRefreshLayout.setOnRefreshListener(listener);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary,
                android.R.color.holo_green_dark,
                android.R.color.holo_orange_dark,
                android.R.color.holo_blue_dark);

        /**
         * Showing Swipe Refresh animation on activity create
         * As animation won't start on onCreate, post runnable is used
         */
        mSwipeRefreshLayout.post(new Runnable() {

            @Override
            public void run() {

                mSwipeRefreshLayout.setRefreshing(false);

                // Fetching data from server
                isNetworkAvailable();
            }
        });


        return view;
    }


    private void isNetworkAvailable() {
        if (!NetworkClass.isConnected(getActivity())) {
            //Snackbar.make(view.findViewById(android.R.id.content),
              //      "text to show", Snackbar.LENGTH_LONG).show();
            //Snackbar.make(view, "Check your connection for today's verse", Snackbar.LENGTH_LONG)
                    //.setAction("Action", null).show();
        } else {
            isValidated();
        }
    }


    private void isValidated() {

        final ImageView card1 = view.findViewById(R.id.image_daily_verse);
        DatabaseReference mFirstCard = FirebaseDatabase.getInstance().getReference("Card_1");
        mFirstCard.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                    String value = dataSnapshot.getValue(String.class);

                    Picasso.with(getActivity())
                            .load(value)
                            .fit()
                            .centerCrop()
                            .into(card1);
                mSwipeRefreshLayout.setRefreshing(false);



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    @Override
    public void onRefresh() {
        isNetworkAvailable();
    }
}
