package com.example.sathya.stories;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.RewardedVideoAd;

import org.json.JSONException;

public class Mainpage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
     AdView mAdView,adView1;
    private InterstitialAd mInterstitialAd;
//    private PublisherAdView mPublisherAdView;
    Handler hos = new Handler();
    private RewardedVideoAd mRewardedVideoAd;
    private PublisherInterstitialAd mPublisherInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        mPublisherAdView = findViewById(R.id.publisherAdView);
        setSupportActionBar(toolbar);
        MobileAds.initialize(this, "ca-app-pub-3643602219143275~6670393241");
        mPublisherInterstitialAd = new PublisherInterstitialAd(this);
//        mPublisherAdView = new PublisherAdView(this);
        mInterstitialAd = new InterstitialAd(this);
//        mPublisherAdView.setAdSizes(AdSize.BANNER);
//        mPublisherAdView.setAdUnitId("ca-app-pub-3643602219143275/8338698132");
        mPublisherInterstitialAd.setAdUnitId("ca-app-pub-3643602219143275/2250844071");
        mInterstitialAd.setAdUnitId("ca-app-pub-3643602219143275/2250844071");
        AdRequest adRequestInter = new AdRequest.Builder().build();
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        mInterstitialAd.loadAd(adRequestInter);
        mAdView = findViewById(R.id.adView);
//        adView1 = findViewById(R.id.adView1);


        Runnable r = new Runnable() {
            public void run() {
                Log.e("Working","Method") ;
                AdRequest adRequest = new AdRequest.Builder().build();
                mAdView.loadAd(adRequest);
//                PublisherAdRequest adRequest1 = new PublisherAdRequest.Builder().build();
//                mPublisherAdView.loadAd(adRequest1);
                mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
                hos.postDelayed(this, 1000);
            }
        };

        hos.postDelayed(r, 1000);
//    }

//        new Handler().postDelayed(new Runnable() {
//
//            @Override
//            public void run() {
////                Intent in = new Intent(SplashScreen.this, Profile.class);
////                startActivity(in);
////                AdRequest Request = new AdRequest.Builder().build();
////                mAdView.loadAd(Request);
//
////                finish();
//            }
//        }, 2000);

        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
        mPublisherInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                Log.e("mPublisherInterstitial","load");
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                Log.e("mPublisherInterstitial",errorCode+"");

                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
            }
        });

//        adView1.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//
//            }
//
//            @Override
//            public void onAdFailedToLoad(int errorCode) {
//                Log.e("errorcode",errorCode+"");
//            }
//
//            @Override
//            public void onAdOpened() {
//
//            }
//
//            @Override
//            public void onAdClicked() {
//
//            }
//
//            @Override
//            public void onAdLeftApplication() {
//            }
//
//            @Override
//            public void onAdClosed() {
//
//            }
//        });
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                Log.e("errorcode",errorCode+"");
            }

            @Override
            public void onAdOpened() {

            }

            @Override
            public void onAdClicked() {

            }

            @Override
            public void onAdLeftApplication() {
            }

            @Override
            public void onAdClosed() {

            }
        });
        Loadfragment();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Methods();
                Snackbar.make(view, "Contact US : Sandhoshparamasivam@gmail.com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();





            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void Methods() {
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
//                PublisherAdRequest adRequest1 = new PublisherAdRequest.Builder().build();
//                mPublisherAdView.loadAd(adRequest1);
        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
        Log.e("Methids","REwrdvideo");
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.loadAd("ca-app-pub-3643602219143275/7675376781",
                new AdRequest.Builder().build());
    }

    private void Loadfragment() {
    HomeFragment homefragment=new HomeFragment();
    final FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.frame,homefragment);
    transaction.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainpage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {

            mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
            mRewardedVideoAd.loadAd("ca-app-pub-3643602219143275/7675376781",
                    new AdRequest.Builder().build());
            Intent S=new Intent(Mainpage.this,Mainpage.class);
            startActivity(S);

        } else if (id == R.id.about) {

            mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
            mRewardedVideoAd.loadAd("ca-app-pub-3643602219143275/7675376781",
                    new AdRequest.Builder().build());
            Intent S=new Intent(Mainpage.this,AboutUs.class);
            startActivity(S);

        } else if (id == R.id.wishlist) {
            Intent S=new Intent(Mainpage.this,WishList.class);
            startActivity(S);

        } else if (id == R.id.nav_share) {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBodyText = "Story For kids Future Enhance and update for Teenager ";
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT,"Bedtime Story For kids");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(sharingIntent, "Shearing Option"));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
