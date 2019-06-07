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

import com.example.sathya.stories.LoveStories.Blindman_Love;
import com.example.sathya.stories.LoveStories.Bond_Of_Love_truth;
import com.example.sathya.stories.LoveStories.Dilemma_Love_Regret_Lifetime;
import com.example.sathya.stories.LoveStories.FullFilling_Promise;
import com.example.sathya.stories.LoveStories.Story_Regret;
import com.example.sathya.stories.LoveStories.The_ConversitionLove_Marriage;
import com.example.sathya.stories.LoveStories.Untill_Death_Does_Apart;
import com.example.sathya.stories.LoveStories.Who_What_do_we_love_morw;
import com.example.sathya.stories.LoveStories.keep_hatred_your_heart;
import com.example.sathya.stories.MotivationalStories.Keep_Your_dream;
import com.example.sathya.stories.MotivationalStories.King_Painting;
import com.example.sathya.stories.MotivationalStories.Lazy_Man_Gods_Plan;
import com.example.sathya.stories.MotivationalStories.Lesson_Hastening_Judgement;
import com.example.sathya.stories.MotivationalStories.Looking_Mirror;
import com.example.sathya.stories.MotivationalStories.Mothers_Love_For_Boy;
import com.example.sathya.stories.MotivationalStories.Never_Give_Up;
import com.example.sathya.stories.MotivationalStories.The_Travelers_The_Plane_Tree;
import com.example.sathya.stories.MotivationalStories.The_Way_God_Helps;
import com.example.sathya.stories.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

/**
 * A simple {@link Fragment} subclass.
 */
public class MotivationalStoriesList extends Fragment {

    private InterstitialAd mInterstitialAd;

    ListView lv1;
    String[] listItem={"A King’s Painting",
            "The Way God Helps",
            "The Lazy Man and the God’s Plan",
            "Mother’s Love for a Boy",
            "Lesson of Hastening the Judgement",
            "The Travelers and The Plane Tree",
            "Keep Your Dream",
            "Never to Give Up",
            "Looking at Mirror",

    };
    AdView mAdView,adView1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_motivational_stories_list, container, false);
        View v= inflater.inflate(R.layout.fragment_motivational_stories_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("Motivational Stories");
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3643602219143275/2250844071");
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, listItem);
        mAdView = v.findViewById(R.id.adView);
        adView1 = v.findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        AdRequest adRequest1 = new AdRequest.Builder().build();
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
//                Intent in = new Intent(SplashScreen.this, Profile.class);
//                startActivity(in);
                AdRequest adRequest = new AdRequest.Builder().build();
                mAdView.loadAd(adRequest);
                AdRequest adRequest1 = new AdRequest.Builder().build();
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
                    King_Painting homefragment=new King_Painting();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                    The_Way_God_Helps homefragment=new The_Way_God_Helps();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==2){
                    Lazy_Man_Gods_Plan homefragment=new Lazy_Man_Gods_Plan();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==3){
                    Mothers_Love_For_Boy homefragment=new Mothers_Love_For_Boy();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==4){
                    Lesson_Hastening_Judgement homefragment=new Lesson_Hastening_Judgement();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==5){
                    The_Travelers_The_Plane_Tree homefragment=new The_Travelers_The_Plane_Tree();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==6){
                    Keep_Your_dream homefragment=new Keep_Your_dream();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==7){
                    Never_Give_Up homefragment=new Never_Give_Up();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==8){
                    Looking_Mirror homefragment=new Looking_Mirror();
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

