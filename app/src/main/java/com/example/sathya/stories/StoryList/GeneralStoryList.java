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
import android.widget.Toast;

import com.example.sathya.stories.GeneralStories.Abode_God;
import com.example.sathya.stories.GeneralStories.Bell_The_Cat;
import com.example.sathya.stories.GeneralStories.Fox_And_Goat;
import com.example.sathya.stories.GeneralStories.Giraffe_neck;
import com.example.sathya.stories.GeneralStories.Honest_Wood_Cutter;
import com.example.sathya.stories.GeneralStories.Laughing_Stock;
import com.example.sathya.stories.GeneralStories.Nature_Observes_Her_Law;
import com.example.sathya.stories.GeneralStories.Plan_Murder;
import com.example.sathya.stories.GeneralStories.Poor_Little_Girl;
import com.example.sathya.stories.GeneralStories.Who_Is_Better;
import com.example.sathya.stories.GeneralStories.Witty_Reply;
import com.example.sathya.stories.Moralstories.Alwaya_Truthful;
import com.example.sathya.stories.Moralstories.Blaming_needs_wisdom;
import com.example.sathya.stories.Moralstories.Blind_Love_Bring_You;
import com.example.sathya.stories.Moralstories.FoolishBoy;
import com.example.sathya.stories.Moralstories.Friendship_Strong_weapon;
import com.example.sathya.stories.Moralstories.Learn_to_Live_With_Weekness;
import com.example.sathya.stories.Moralstories.Never_gift_a_thing_useless;
import com.example.sathya.stories.Moralstories.Small_thing_cost_much;
import com.example.sathya.stories.Moralstories.Small_things_Big_Jobs;
import com.example.sathya.stories.Moralstories.Taste_Of_Dish;
import com.example.sathya.stories.Moralstories.Time_Valuable;
import com.example.sathya.stories.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

/**
 * A simple {@link Fragment} subclass.
 */
public class GeneralStoryList extends Fragment {

    private InterstitialAd mInterstitialAd;
    ListView lv1;
    String[] listItem={"BELL THE CAT",
            "NATURE OBSERVES HER LAWS",
            "LAUGHING STOCK",
            "THE GIRAFFE'S NECK",
            "PLAN OF MURDER",
            "A POOR LITTLE GIRL",
            "WHO IS BETTER ?",
            "A FOX AND A GOAT",
            "AN HONEST WOODCUTTER",
            "A WITTY REPLY"
            ,"THE ABODE OF GOD"};

    AdView mAdView,adView1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_general_story_list, container, false);
        View v= inflater.inflate(R.layout.fragment_general_story_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("General Stories");
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, listItem);
        lv1.setAdapter(adapter);
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
        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId("ca-app-pub-3643602219143275/2250844071");
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
//                Intent in = new Intent(SplashScreen.this, Profile.class);
//                startActivity(in);
                AdRequest adRequest1= new AdRequest.Builder().build();
                adView1.loadAd(adRequest1);
                AdRequest adRequest = new AdRequest.Builder().build();
                mAdView.loadAd(adRequest);
                AdRequest adRequestInter = new AdRequest.Builder().build();
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdLoaded() {
                        mInterstitialAd.show();
                    }
                });
                mInterstitialAd.loadAd(adRequestInter);
                Log.e("Working","fine");
//                finish();
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
                    Bell_The_Cat homefragment=new Bell_The_Cat();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                    Nature_Observes_Her_Law homefragment=new Nature_Observes_Her_Law();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==2){
                    Laughing_Stock homefragment=new Laughing_Stock();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==3){
                    Giraffe_neck homefragment=new Giraffe_neck();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==4){
                    Plan_Murder homefragment=new Plan_Murder();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==5){
                    Poor_Little_Girl homefragment=new Poor_Little_Girl();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==6){
                    Who_Is_Better homefragment=new Who_Is_Better();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==7){
                    Fox_And_Goat homefragment=new Fox_And_Goat();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==8){
                    Honest_Wood_Cutter homefragment=new Honest_Wood_Cutter();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==9){
                    Witty_Reply homefragment=new Witty_Reply();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==10){
                    Abode_God homefragment=new Abode_God();
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
