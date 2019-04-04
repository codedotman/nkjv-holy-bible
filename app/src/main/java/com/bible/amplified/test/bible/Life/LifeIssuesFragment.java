package com.bible.amplified.test.bible.Life;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bible.amplified.test.bible.ChapterFragment;
import com.bible.amplified.test.bible.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LifeIssuesFragment extends Fragment {


    public LifeIssuesFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_life_issues, container, false);


        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word ("Anger"));
        words.add(new word ("Anxiety"));
        words.add(new word ("Addiction"));
        words.add(new word ("Adultery"));
        words.add(new word ("Believing"));
        words.add(new word ("Change"));
        words.add(new word ("Confidence"));
        words.add(new word ("Compassion"));
        words.add(new word ("Courage"));
        words.add(new word ("Endurance"));
        words.add(new word ("Enemies"));
        words.add(new word ("Evil"));
        words.add(new word ("Faith"));
        words.add(new word ("Family"));
        words.add(new word ("Fear"));
        words.add(new word ("Forgiveness"));
        words.add(new word ("Friendship"));
        words.add(new word ("Generosity"));
        words.add(new word ("Gentleness"));
        words.add(new word ("Heaven"));



        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = view.findViewById(R.id.life_issues_listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 19);
                    bundle.putInt("Chapter1", 9);
                    bundle.putInt("verse1", 11);

                    bundle.putInt("Book2", 58);
                    bundle.putInt("Chapter2", 0);
                    bundle.putInt("verse2", 18);

                    bundle.putInt("Book3", 48);
                    bundle.putInt("Chapter3", 3);
                    bundle.putInt("verse3", 25);

                    bundle.putInt("Book4", 19);
                    bundle.putInt("Chapter4", 13);
                    bundle.putInt("verse4", 28);

                    bundle.putInt("Book5", 18);
                    bundle.putInt("Chapter5", 36);
                    bundle.putInt("verse5", 7);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 1) {
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 59);
                    bundle.putInt("Chapter1", 4);
                    bundle.putInt("verse1", 6);

                    bundle.putInt("Book2", 19);
                    bundle.putInt("Chapter2", 11);
                    bundle.putInt("verse2", 24);

                    bundle.putInt("Book3", 22);
                    bundle.putInt("Chapter3", 40);
                    bundle.putInt("verse3", 9);

                    bundle.putInt("Book4", 54);
                    bundle.putInt("Chapter4", 0);
                    bundle.putInt("verse4", 6);

                    bundle.putInt("Book5", 18);
                    bundle.putInt("Chapter5", 54);
                    bundle.putInt("verse5", 21);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 2){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 47);
                    bundle.putInt("Chapter1", 4);
                    bundle.putInt("verse1", 0);

                    bundle.putInt("Book2", 61);
                    bundle.putInt("Chapter2", 1);
                    bundle.putInt("verse2", 15);

                    bundle.putInt("Book3", 58);
                    bundle.putInt("Chapter3", 3);
                    bundle.putInt("verse3", 6);

                    bundle.putInt("Book4", 42);
                    bundle.putInt("Chapter4", 7);
                    bundle.putInt("verse4", 35);

                    bundle.putInt("Book5", 39);
                    bundle.putInt("Chapter5", 25);
                    bundle.putInt("verse5", 40);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 3){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 19);
                    bundle.putInt("Chapter1", 5);
                    bundle.putInt("verse1", 31);

                    bundle.putInt("Book2", 39);
                    bundle.putInt("Chapter2", 4);
                    bundle.putInt("verse2", 27);

                    bundle.putInt("Book3", 45);
                    bundle.putInt("Chapter3", 5);
                    bundle.putInt("verse3", 8);

                    bundle.putInt("Book4", 45);
                    bundle.putInt("Chapter4", 5);
                    bundle.putInt("verse4", 17);

                    bundle.putInt("Book5", 41);
                    bundle.putInt("Chapter5", 15);
                    bundle.putInt("verse5", 17);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 4){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 39);
                    bundle.putInt("Chapter1", 20);
                    bundle.putInt("verse1", 21);

                    bundle.putInt("Book2", 43);
                    bundle.putInt("Chapter2", 15);
                    bundle.putInt("verse2", 30);

                    bundle.putInt("Book3", 57);
                    bundle.putInt("Chapter3", 10);
                    bundle.putInt("verse3", 5);

                    bundle.putInt("Book4", 22);
                    bundle.putInt("Chapter4", 39);
                    bundle.putInt("verse4", 30);

                    bundle.putInt("Book5", 42);
                    bundle.putInt("Chapter5", 2);
                    bundle.putInt("verse5", 17);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 5){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 4);
                    bundle.putInt("Chapter1", 30);
                    bundle.putInt("verse1", 5);

                    bundle.putInt("Book2", 20);
                    bundle.putInt("Chapter2", 2);
                    bundle.putInt("verse2", 0);

                    bundle.putInt("Book3", 22);
                    bundle.putInt("Chapter3", 42);
                    bundle.putInt("verse3", 18);

                    bundle.putInt("Book4", 58);
                    bundle.putInt("Chapter4", 0);
                    bundle.putInt("verse4", 16);

                    bundle.putInt("Book5", 46);
                    bundle.putInt("Chapter5", 4);
                    bundle.putInt("verse5", 16);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 6){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 61);
                    bundle.putInt("Chapter1", 4);
                    bundle.putInt("verse1", 13);

                    bundle.putInt("Book2", 48);
                    bundle.putInt("Chapter2", 2);
                    bundle.putInt("verse2", 11);

                    bundle.putInt("Book3", 57);
                    bundle.putInt("Chapter3", 3);
                    bundle.putInt("verse3", 15);

                    bundle.putInt("Book4", 23);
                    bundle.putInt("Chapter4", 16);
                    bundle.putInt("verse4", 6);

                    bundle.putInt("Book5", 49);
                    bundle.putInt("Chapter5", 0);
                    bundle.putInt("verse5", 5);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 7){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 48);
                    bundle.putInt("Chapter1", 3);
                    bundle.putInt("verse1", 31);

                    bundle.putInt("Book2", 59);
                    bundle.putInt("Chapter2", 2);
                    bundle.putInt("verse2", 7);

                    bundle.putInt("Book3", 50);
                    bundle.putInt("Chapter3", 2);
                    bundle.putInt("verse3", 11);

                    bundle.putInt("Book4", 18);
                    bundle.putInt("Chapter4", 102);
                    bundle.putInt("verse4", 12);

                    bundle.putInt("Book5", 22);
                    bundle.putInt("Chapter5", 29);
                    bundle.putInt("verse5", 17);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 8){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 12);
                    bundle.putInt("Chapter1", 27);
                    bundle.putInt("verse1", 19);

                    bundle.putInt("Book2", 4);
                    bundle.putInt("Chapter2", 30);
                    bundle.putInt("verse2", 5);

                    bundle.putInt("Book3", 48);
                    bundle.putInt("Chapter3", 5);
                    bundle.putInt("verse3", 9);

                    bundle.putInt("Book4", 22);
                    bundle.putInt("Chapter4", 53);
                    bundle.putInt("verse4", 3);

                    bundle.putInt("Book5", 18);
                    bundle.putInt("Chapter5", 26 );
                    bundle.putInt("verse5", 0);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 9){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 58);
                    bundle.putInt("Chapter1", 0);
                    bundle.putInt("verse1", 24);

                    bundle.putInt("Book2", 49);
                    bundle.putInt("Chapter2", 3);
                    bundle.putInt("verse2", 12);

                    bundle.putInt("Book3", 50);
                    bundle.putInt("Chapter3", 0);
                    bundle.putInt("verse3", 10);

                    bundle.putInt("Book4", 44);
                    bundle.putInt("Chapter4", 11);
                    bundle.putInt("verse4", 11);

                    bundle.putInt("Book5", 58);
                    bundle.putInt("Chapter5", 0 );
                    bundle.putInt("verse5", 24);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 10){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 44);
                    bundle.putInt("Chapter1", 11);
                    bundle.putInt("verse1", 19);

                    bundle.putInt("Book2", 4);
                    bundle.putInt("Chapter2", 19);
                    bundle.putInt("verse2", 0);

                    bundle.putInt("Book3", 18);
                    bundle.putInt("Chapter3", 137);
                    bundle.putInt("verse3", 6);

                    bundle.putInt("Book4", 19);
                    bundle.putInt("Chapter4", 15);
                    bundle.putInt("verse4", 6);

                    bundle.putInt("Book5", 59);
                    bundle.putInt("Chapter5", 2);
                    bundle.putInt("verse5", 8);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 11){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 44);
                    bundle.putInt("Chapter1", 11);
                    bundle.putInt("verse1", 20);

                    bundle.putInt("Book2", 18);
                    bundle.putInt("Chapter2", 120);
                    bundle.putInt("verse2", 6);

                    bundle.putInt("Book3", 44);
                    bundle.putInt("Chapter3", 15);
                    bundle.putInt("verse3", 16);

                    bundle.putInt("Book4", 19);
                    bundle.putInt("Chapter4", 7);
                    bundle.putInt("verse4", 12);

                    bundle.putInt("Book5", 44);
                    bundle.putInt("Chapter5", 11 );
                    bundle.putInt("verse5", 8);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 12){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 57);
                    bundle.putInt("Chapter1", 10);
                    bundle.putInt("verse1", 0);

                    bundle.putInt("Book2", 44);
                    bundle.putInt("Chapter2", 9);
                    bundle.putInt("verse2", 9);

                    bundle.putInt("Book3", 57);
                    bundle.putInt("Chapter3", 10);
                    bundle.putInt("verse3", 5);

                    bundle.putInt("Book4", 40);
                    bundle.putInt("Chapter4", 10);
                    bundle.putInt("verse4", 23);

                    bundle.putInt("Book5", 61);
                    bundle.putInt("Chapter5", 4 );
                    bundle.putInt("verse5", 4);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 13){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 43);
                    bundle.putInt("Chapter1", 15);
                    bundle.putInt("verse1", 30);

                    bundle.putInt("Book2", 45);
                    bundle.putInt("Chapter2", 0);
                    bundle.putInt("verse2", 9);

                    bundle.putInt("Book3", 19);
                    bundle.putInt("Chapter3", 5);
                    bundle.putInt("verse3", 19);

                    bundle.putInt("Book4", 61);
                    bundle.putInt("Chapter4", 3);
                    bundle.putInt("verse4", 19);

                    bundle.putInt("Book5", 18);
                    bundle.putInt("Chapter5", 132 );
                    bundle.putInt("verse5", 0);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 14){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 22);
                    bundle.putInt("Chapter1", 40);
                    bundle.putInt("verse1", 9);

                    bundle.putInt("Book2", 18);
                    bundle.putInt("Chapter2", 55);
                    bundle.putInt("verse2", 2);

                    bundle.putInt("Book3", 5);
                    bundle.putInt("Chapter3", 0);
                    bundle.putInt("verse3", 8);

                    bundle.putInt("Book4", 22);
                    bundle.putInt("Chapter4", 40);
                    bundle.putInt("verse4", 12);

                    bundle.putInt("Book5", 18);
                    bundle.putInt("Chapter5", 117 );
                    bundle.putInt("verse5", 5);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 15){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 48);
                    bundle.putInt("Chapter1", 3);
                    bundle.putInt("verse1", 31);

                    bundle.putInt("Book2", 39);
                    bundle.putInt("Chapter2", 5);
                    bundle.putInt("verse2", 13);

                    bundle.putInt("Book3", 50);
                    bundle.putInt("Chapter3", 2);
                    bundle.putInt("verse3", 12);

                    bundle.putInt("Book4", 46);
                    bundle.putInt("Chapter4", 6);
                    bundle.putInt("verse4", 13);

                    bundle.putInt("Book5", 41);
                    bundle.putInt("Chapter5", 5 );
                    bundle.putInt("verse5", 36);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 16){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 42);
                    bundle.putInt("Chapter1", 14);
                    bundle.putInt("verse1", 12);

                    bundle.putInt("Book2", 18);
                    bundle.putInt("Chapter2", 132);
                    bundle.putInt("verse2", 0);

                    bundle.putInt("Book3", 61);
                    bundle.putInt("Chapter3", 3);
                    bundle.putInt("verse3", 6);

                    bundle.putInt("Book4", 58);
                    bundle.putInt("Chapter4", 3);
                    bundle.putInt("verse4", 3);

                    bundle.putInt("Book5", 45);
                    bundle.putInt("Chapter5", 14 );
                    bundle.putInt("verse5", 32);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 17){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 19);
                    bundle.putInt("Chapter1", 10);
                    bundle.putInt("verse1", 24);

                    bundle.putInt("Book2", 45);
                    bundle.putInt("Chapter2", 8);
                    bundle.putInt("verse2", 6);

                    bundle.putInt("Book3", 41);
                    bundle.putInt("Chapter3", 5);
                    bundle.putInt("verse3", 37);

                    bundle.putInt("Book4", 58);
                    bundle.putInt("Chapter4", 0);
                    bundle.putInt("verse4", 4);

                    bundle.putInt("Book5", 22);
                    bundle.putInt("Chapter5", 39 );
                    bundle.putInt("verse5", 28);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 18){

                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 50);
                    bundle.putInt("Chapter1", 2);
                    bundle.putInt("verse1", 11);

                    bundle.putInt("Book2", 19);
                    bundle.putInt("Chapter2", 14);
                    bundle.putInt("verse2", 0);

                    bundle.putInt("Book3", 19);
                    bundle.putInt("Chapter3", 15);
                    bundle.putInt("verse3", 23);

                    bundle.putInt("Book4", 47);
                    bundle.putInt("Chapter4", 5);
                    bundle.putInt("verse4", 9);

                    bundle.putInt("Book5", 44);
                    bundle.putInt("Chapter5", 13);
                    bundle.putInt("verse5", 12);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
                else if (position == 19){
                    Fragment fragment2 = new LifeIssuesDetailFragment();
                    Bundle bundle = new Bundle();

                    bundle.putInt("Book1", 42);
                    bundle.putInt("Chapter1", 13);
                    bundle.putInt("verse1", 1);

                    bundle.putInt("Book2", 65);
                    bundle.putInt("Chapter2", 20);
                    bundle.putInt("verse2", 3);

                    bundle.putInt("Book3", 45);
                    bundle.putInt("Chapter3", 1);
                    bundle.putInt("verse3", 8);

                    bundle.putInt("Book4", 42);
                    bundle.putInt("Chapter4", 14 );
                    bundle.putInt("verse4", 18);

                    bundle.putInt("Book5", 39);
                    bundle.putInt("Chapter5", 5 );
                    bundle.putInt("verse5", 23);

                    fragment2.setArguments(bundle);
                    android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.li_containerr, fragment2).addToBackStack(null).commit();
                }
            }
        });

        return view;
    }

}
