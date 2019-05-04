package com.example.sathya.stories.StoryList;


import android.os.Bundle;
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
import com.example.sathya.stories.FriendshipStories.Having_Best_Friend;
import com.example.sathya.stories.FriendshipStories.The_True_friend;
import com.example.sathya.stories.FriendshipStories.TwoGoats;
import com.example.sathya.stories.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * A simple {@link Fragment} subclass.
 */
public class FriendshipStoriesList extends Fragment {




    private InterstitialAd mInterstitialAd;

    ListView lv1;
    String[] listItem={"Two Goats",
            "The True Friend",
            "The Bear and The Two Friends",
            "Having a Best Friend",
            "SNOW WHITE",
            "THE LITTLE MERMAID",
            "GOLDILOCKS AND THE THREE BEARS",
            "HANSEL AND GRETEL",
            "THE UGLY DUCKLING",
            "THE FROG PRINCE"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_friendship_stories_list, container, false);
        View v= inflater.inflate(R.layout.fragment_friendship_stories_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("Freienship Stories");
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3643602219143275/2250844071");
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, listItem);

        lv1.setAdapter(adapter);
        for(int i=0;i<2000;i++) {

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
                    TwoGoats homefragment=new TwoGoats();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                    The_True_friend homefragment=new The_True_friend();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==2){
                    Bear_And_Two_Friends homefragment=new Bear_And_Two_Friends();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==3){
                    Having_Best_Friend homefragment=new Having_Best_Friend();
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
