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
import com.example.sathya.stories.LoveStories.Blindman_Love;
import com.example.sathya.stories.LoveStories.Bond_Of_Love_truth;
import com.example.sathya.stories.LoveStories.Dilemma_Love_Regret_Lifetime;
import com.example.sathya.stories.LoveStories.FullFilling_Promise;
import com.example.sathya.stories.LoveStories.Story_Regret;
import com.example.sathya.stories.LoveStories.The_ConversitionLove_Marriage;
import com.example.sathya.stories.LoveStories.Untill_Death_Does_Apart;
import com.example.sathya.stories.LoveStories.Who_What_do_we_love_morw;
import com.example.sathya.stories.LoveStories.keep_hatred_your_heart;
import com.example.sathya.stories.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * A simple {@link Fragment} subclass.
 */
public class InspirationalstoryList extends Fragment {



    private InterstitialAd mInterstitialAd;

    ListView lv1;
    String[] listItem={"A Man with a Lamp",
            "Sometimes Just let it be",
            "The Needy King and a Sage",
            "Keeping the roots stronger",
            "The Seven Wonders",
            "The Circle of Good Deed",
            "Little Boy’s Meeting with God",
            "Learn to Appreciate",
            "The White Elephant",

    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_inspirationalstory_list, container, false);
        View v= inflater.inflate(R.layout.fragment_inspirationalstory_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("Inspirational Stories");
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3643602219143275/2250844071");
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, listItem);

        lv1.setAdapter(adapter);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
//                Intent in = new Intent(SplashScreen.this, Profile.class);
//                startActivity(in);
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
                    Man_With_Lamp homefragment=new Man_With_Lamp();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                    Sometimes_Just_It_Be homefragment=new Sometimes_Just_It_Be();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==2){
                    Needy_King_And_Sage homefragment=new Needy_King_And_Sage();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==3){
                    Keeping_The_Root_Stronger homefragment=new Keeping_The_Root_Stronger();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==4){
                    Seven_Wonders homefragment=new Seven_Wonders();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==5){
                    Circle_Good_Deeds homefragment=new Circle_Good_Deeds();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==6){
                    Little_Boy_Meeting_God homefragment=new Little_Boy_Meeting_God();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==7){
                    Learn_To_Appreciate homefragment=new Learn_To_Appreciate();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==8){
                    White_Elephant homefragment=new White_Elephant();
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

