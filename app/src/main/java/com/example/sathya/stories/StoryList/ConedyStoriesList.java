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

import com.example.sathya.stories.FairyTaleStories.Beauty_Beast;
import com.example.sathya.stories.FairyTaleStories.Cindrella_Story;
import com.example.sathya.stories.FairyTaleStories.Frog_Prince;
import com.example.sathya.stories.FairyTaleStories.Goldilocks_and_Three_Bears;
import com.example.sathya.stories.FairyTaleStories.Hansel_Gretel;
import com.example.sathya.stories.FairyTaleStories.Little_Mermaid;
import com.example.sathya.stories.FairyTaleStories.Rapunzel;
import com.example.sathya.stories.FairyTaleStories.Sleeping_Beauty;
import com.example.sathya.stories.FairyTaleStories.Snow_White;
import com.example.sathya.stories.FairyTaleStories.Ugly_Duck;
import com.example.sathya.stories.FunnyStoriesList.Crocodile_And_Monkey;
import com.example.sathya.stories.FunnyStoriesList.Hansel_and_Gretel;
import com.example.sathya.stories.FunnyStoriesList.Hare_And_Tortoise;
import com.example.sathya.stories.FunnyStoriesList.Lion_And_Rabbit;
import com.example.sathya.stories.FunnyStoriesList.The_Boy_Who_cried_Wolf;
import com.example.sathya.stories.FunnyStoriesList.The_Thirsty_Crow;
import com.example.sathya.stories.FunnyStoriesList.Two_Cats_And_Monkeys;
import com.example.sathya.stories.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConedyStoriesList extends Fragment {


    private InterstitialAd mInterstitialAd;

    ListView lv1;
    String[] listItem={"The Hare and the Tortoise",
            "The Lion and the Rabbit",
            "The Thirsty Crow",
            "The Boy who Cried Wolf",
            "The Crocodile and the Monkey",
            "Hansel and Gretel",
            "Two Cats and the Monkey",
        };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_conedy_stories_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("Comedy Stories");
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
                    Hare_And_Tortoise homefragment=new Hare_And_Tortoise();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                    Lion_And_Rabbit homefragment=new Lion_And_Rabbit();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==2){
                    The_Thirsty_Crow homefragment=new The_Thirsty_Crow();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==3){
                    The_Boy_Who_cried_Wolf homefragment=new The_Boy_Who_cried_Wolf();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==4){
                    Crocodile_And_Monkey homefragment=new Crocodile_And_Monkey();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==5){
                    Hansel_and_Gretel homefragment=new Hansel_and_Gretel();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==6){
                    Two_Cats_And_Monkeys homefragment=new Two_Cats_And_Monkeys();
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
