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

import com.example.sathya.stories.BedtimeStories.Beginning_shows_the_End;
import com.example.sathya.stories.BedtimeStories.City_rat_village_rat;
import com.example.sathya.stories.BedtimeStories.Dog_in_a_manager;
import com.example.sathya.stories.BedtimeStories.Encounter_with_Ghost;
import com.example.sathya.stories.BedtimeStories.Everyone_care_for_his_end;
import com.example.sathya.stories.BedtimeStories.Never_challege_nature;
import com.example.sathya.stories.BedtimeStories.Once_bitten_twice_shy;
import com.example.sathya.stories.BedtimeStories.The_Mistaken_Complaint;
import com.example.sathya.stories.BedtimeStories.Tom_and_wonderboy;
import com.example.sathya.stories.BedtimeStories.Wind_and_Sun;
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
import com.google.android.gms.ads.InterstitialAd;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoralStoryList extends Fragment {

    private InterstitialAd mInterstitialAd;
    ListView lv1;
    String[] listItem={"NEVER GIFT A THING USELESS TO YOU",
            "BLIND LOVE BRINGS IN ILL LUCK",
            "FRIENDSHIP IS A STRONG WEAPON",
            "TIME IS VALUABLE",
            "ALWAYS BE TRUTHFUL",
            "A SMALL THING COSTS MUCH",
            "THE FOOLISH BOY",
            "TASTE OF A DISH",
            "LEARN TO LIVE WITH YOUR WEAKNESSES",
            "SMALL THINGS DO BIG JOBS"
            ,"BLAMING NEEDS WISDOM"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_moral_story_list, container, false);
        View v= inflater.inflate(R.layout.fragment_moral_story_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("Moral Stories");
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, listItem);
        lv1.setAdapter(adapter);
        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId("ca-app-pub-3643602219143275/2250844071");
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
                    Never_gift_a_thing_useless homefragment=new Never_gift_a_thing_useless();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                    Blind_Love_Bring_You homefragment=new Blind_Love_Bring_You();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==2){
                    Friendship_Strong_weapon homefragment=new Friendship_Strong_weapon();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==3){
                    Time_Valuable homefragment=new Time_Valuable();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==4){
                    Alwaya_Truthful homefragment=new Alwaya_Truthful();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==5){
                    Small_thing_cost_much homefragment=new Small_thing_cost_much();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==6){
                    FoolishBoy homefragment=new FoolishBoy();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==7){
                    Taste_Of_Dish homefragment=new Taste_Of_Dish();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==8){
                    Learn_to_Live_With_Weekness homefragment=new Learn_to_Live_With_Weekness();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==9){
                    Small_things_Big_Jobs homefragment=new Small_things_Big_Jobs();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==10){
                    Blaming_needs_wisdom homefragment=new Blaming_needs_wisdom();
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
