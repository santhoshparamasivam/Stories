package com.example.sathya.stories.StoryList;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sathya.stories.InspirationalStories.Circle_Good_Deeds;
import com.example.sathya.stories.InspirationalStories.Keeping_The_Root_Stronger;
import com.example.sathya.stories.InspirationalStories.Learn_To_Appreciate;
import com.example.sathya.stories.InspirationalStories.Little_Boy_Meeting_God;
import com.example.sathya.stories.InspirationalStories.Man_With_Lamp;
import com.example.sathya.stories.InspirationalStories.Needy_King_And_Sage;
import com.example.sathya.stories.InspirationalStories.Seven_Wonders;
import com.example.sathya.stories.InspirationalStories.Sometimes_Just_It_Be;
import com.example.sathya.stories.InspirationalStories.White_Elephant;
import com.example.sathya.stories.LifeStories.Bound_Happen;
import com.example.sathya.stories.LifeStories.Choose_Word_Wisely;
import com.example.sathya.stories.LifeStories.Frog_In_Hot_Water;
import com.example.sathya.stories.LifeStories.Last_Delivery;
import com.example.sathya.stories.LifeStories.Limit_Of_Kindness;
import com.example.sathya.stories.LifeStories.OneWho_Read_Future;
import com.example.sathya.stories.LifeStories.Reflection_Action;
import com.example.sathya.stories.LifeStories.Wealth_Without_Value;
import com.example.sathya.stories.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

/**
 * A simple {@link Fragment} subclass.
 */
public class LifeStoriesList extends Fragment {


    private InterstitialAd mInterstitialAd;

    ListView lv1;
    String[] listItem={"A limit of your Kindness",
            "One who read the future",
            "Choose Your Words Wisely",
            "Wealth without a Value",
            "This was bound to happen",
            "The Reflection of Your Actions",
            "The Last Delivery",
            "Little Boy’s Meeting with God",
            "The Frog in Hot Water",

    };

    AdView mAdView,adView1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_life_stories_list, container, false);
        View v= inflater.inflate(R.layout.fragment_life_stories_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("Inspirational Stories");
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3643602219143275/2250844071");
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, listItem);
        mAdView = v.findViewById(R.id.adView);
        adView1 = v.findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        AdRequest adRequest1= new AdRequest.Builder().build();
        adView1.loadAd(adRequest1);

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
        lv1.setAdapter(adapter);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                AdRequest adRequest = new AdRequest.Builder().build();
                mAdView.loadAd(adRequest);
                AdRequest adRequest1= new AdRequest.Builder().build();
                adView1.loadAd(adRequest1);
                AdRequest adRequestInter = new AdRequest.Builder().build();
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdLoaded() {
                        mInterstitialAd.show();
                    }
                });
                mInterstitialAd.loadAd(adRequestInter);
                Log.e("Working","fine");
            }
        }, 2000);

        AdRequest adRequestInter = new AdRequest.Builder().build();
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        mInterstitialAd.loadAd(adRequestInter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
                String value=adapter.getItem(position);
//                Toast.makeText(getActivity(),value,Toast.LENGTH_SHORT).show();
                if(position==0){
                    Limit_Of_Kindness homefragment=new Limit_Of_Kindness();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                    OneWho_Read_Future homefragment=new OneWho_Read_Future();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==2){
                    Choose_Word_Wisely homefragment=new Choose_Word_Wisely();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==3){
                    Wealth_Without_Value homefragment=new Wealth_Without_Value();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==4){
                    Bound_Happen homefragment=new Bound_Happen();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==5) {
                    Reflection_Action homefragment = new Reflection_Action();
                    final FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame, homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
                    if(position==6){
                        Last_Delivery homefragment=new Last_Delivery();
                        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame,homefragment);
                        transaction.addToBackStack(null);
                        transaction.commit();


                }if(position==7){
                    Little_Boy_Meeting_God homefragment=new Little_Boy_Meeting_God();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==8){
                    Frog_In_Hot_Water homefragment=new Frog_In_Hot_Water();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }

            }
        });

        return  v;
    }

}

