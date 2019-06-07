package com.example.sathya.stories;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class WishList extends AppCompatActivity {
    private RewardedVideoAd mRewardedVideoAd;
    Handler hos = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_list);
        MobileAds.initialize(this, "ca-app-pub-3643602219143275~6670393241");
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.loadAd("ca-app-pub-3643602219143275/7675376781",
                new AdRequest.Builder().build());
        Runnable r = new Runnable() {
            public void run() {
                Log.e("Working","Method") ;
                mRewardedVideoAd.loadAd("ca-app-pub-3643602219143275/7675376781",
                        new AdRequest.Builder().build());
                hos.postDelayed(this, 2000);
            }
        };

        hos.postDelayed(r, 2000);
        mRewardedVideoAd.setRewardedVideoAdListener(new RewardedVideoAdListener() {
            @Override
            public void onRewardedVideoAdLoaded() {
                Log.e("Loading","loaded");
            }

            @Override
            public void onRewardedVideoAdOpened() {

            }

            @Override
            public void onRewardedVideoStarted() {

            }

            @Override
            public void onRewardedVideoAdClosed() {
                Log.e("onRewardedVideoAdClosed","onRewardedVideoAdClosed");
            }

            @Override
            public void onRewarded(RewardItem rewardItem) {
                Log.e("rewardItem","rewardItem");
            }

            @Override
            public void onRewardedVideoAdLeftApplication() {

            }

            @Override
            public void onRewardedVideoAdFailedToLoad(int i) {
                Log.e("onRewardedVideoAdFailed",i+"");
            }

            @Override
            public void onRewardedVideoCompleted() {
                Log.e("RewardedVideoCompleted","onRewardedVideoCompleted");
            }
        });
    }
}
