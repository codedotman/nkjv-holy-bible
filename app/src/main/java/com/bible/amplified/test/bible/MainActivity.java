package com.bible.amplified.test.bible;

import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.bible.amplified.test.bible.DailyVerse.DailyVerseFragment;
import com.bible.amplified.test.bible.Life.LifeIssuesFragment;
import com.bible.amplified.test.bible.Noted.NoteFragment;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private ViewPager viewPager;
    private BottomNavigationView bottom_navigation_view;
    InterstitialAd interstitialAd;
    private AdView adView;
    private int interstitialAdCounter = 0;
    MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

        String type = getIntent().getStringExtra("From");
        if (type != null) {
            fragmentManager.beginTransaction().replace(R.id.viewpager, new DailyVerseFragment()).addToBackStack(null).commit();
        }

        viewPager = findViewById(R.id.viewpager);
        bottom_navigation_view = findViewById(R.id.bottom_navigation);

        bottom_navigation_view.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.navigation_read_bible:
                                viewPager.setCurrentItem(0);
                                break;
                            case R.id.navigation_note:
                                viewPager.setCurrentItem(1);
                                break;
                            case R.id.navigation_life_issues:
                                viewPager.setCurrentItem(2);
                                break;
                            case R.id.navigation_notify:
                                viewPager.setCurrentItem(3);
                                break;
                            case R.id.navigation_settings:
                                viewPager.setCurrentItem(4);
                                break;

                        }
                        return false;
                    }
                });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                } else {
                    bottom_navigation_view.getMenu().getItem(0).setChecked(false);
                }
                Log.d("page", "onPageSelected: " + position);
                bottom_navigation_view.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottom_navigation_view.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        setupViewPager();
        loadAds();

    }

    private void loadAds() {
        adView = findViewById(R.id.adView);
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial_ad_unit_id));
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                interstitialAd.show();
            }
        });

    }

    private void showInterstitialAd() {
        interstitialAd.loadAd(new AdRequest.Builder().build());
    }

    private void setupViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new BibleFragment());
        adapter.addFragment(new NoteFragment());
        adapter.addFragment(new LifeIssuesFragment());
        adapter.addFragment(new DailyVerseFragment());
        adapter.addFragment(new SettingsFragment());
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(4);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Override
    public void onBackPressed() {
        interstitialAdCounter += 1;
        if (interstitialAdCounter == 4) {
            interstitialAdCounter = 0;
            showInterstitialAd();
        }

        int fragments = getSupportFragmentManager().getBackStackEntryCount();
        Log.d("backstackcount", String.valueOf(fragments));

        if (fragments == 0) {
            new AlertDialog.Builder(this)
                    .setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();


        } else {
            if (getFragmentManager().getBackStackEntryCount() > 1) {
                getFragmentManager().popBackStack();
            } else {

                super.onBackPressed();
            }
        }
    }


}
