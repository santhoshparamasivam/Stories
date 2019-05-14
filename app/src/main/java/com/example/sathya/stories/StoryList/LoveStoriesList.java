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

import com.example.sathya.stories.FriendshipStories.Bear_And_Two_Friends;
import com.example.sathya.stories.FriendshipStories.Four_Friends;
import com.example.sathya.stories.FriendshipStories.Happiness_And_Sarrow;
import com.example.sathya.stories.FriendshipStories.Having_Best_Friend;
import com.example.sathya.stories.FriendshipStories.Hundread_Gold_Coins_Birbal;
import com.example.sathya.stories.FriendshipStories.The_Blank_Question_Paper;
import com.example.sathya.stories.FriendshipStories.The_Ship_Of_Friendship;
import com.example.sathya.stories.FriendshipStories.The_True_friend;
import com.example.sathya.stories.FriendshipStories.TwoGoats;
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
public class LoveStoriesList extends Fragment {


    private InterstitialAd mInterstitialAd;

    ListView lv1;
    String[] listItem={"The Conversation of Love and Marriage",
            "A Blind Man’s Love",
            "The Dilemma of Love and Regret of Lifetime",
            "Bond of Love and the Truth",
            "How long can you keep hatred in your heart?",
            "Until Death does us Apart",
            "Who or What do we love more?",
            "Fulfilling a Promise",
            "Story of Regret",

    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_love_stories_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("Love Stories");
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
                    The_ConversitionLove_Marriage homefragment=new The_ConversitionLove_Marriage();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                    Blindman_Love homefragment=new Blindman_Love();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==2){
                    Dilemma_Love_Regret_Lifetime homefragment=new Dilemma_Love_Regret_Lifetime();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==3){
                    Bond_Of_Love_truth homefragment=new Bond_Of_Love_truth();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==4){
                    keep_hatred_your_heart homefragment=new keep_hatred_your_heart();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==5){
                    Untill_Death_Does_Apart homefragment=new Untill_Death_Does_Apart();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==6){
                    Who_What_do_we_love_morw homefragment=new Who_What_do_we_love_morw();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==7){
                    FullFilling_Promise homefragment=new FullFilling_Promise();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==8){
                    Story_Regret homefragment=new Story_Regret();
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

