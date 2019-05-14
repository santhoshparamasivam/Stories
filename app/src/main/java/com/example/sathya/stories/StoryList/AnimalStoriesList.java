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

import com.example.sathya.stories.AnimalStories.And_Grashhopper;
import com.example.sathya.stories.AnimalStories.Ass_As_Lion;
import com.example.sathya.stories.AnimalStories.Cats_And_Monkey;
import com.example.sathya.stories.AnimalStories.Clever_Monkey;
import com.example.sathya.stories.AnimalStories.FisherMan_Little_Fish;
import com.example.sathya.stories.AnimalStories.Fox_Goat;
import com.example.sathya.stories.AnimalStories.Hare_Hound;
import com.example.sathya.stories.AnimalStories.Lion_And_Boar;
import com.example.sathya.stories.AnimalStories.TheTwo_Goats;
import com.example.sathya.stories.AnimalStories.The_Dog_And_Shadow;
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
import com.example.sathya.stories.GeneralStories.Fox_And_Goat;
import com.example.sathya.stories.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnimalStoriesList extends Fragment {

    InterstitialAd mInterstitialAd;

    ListView lv1;
    String[] listItem={"The Two Goats",
            "The Hare And The Hound",
            "The Fisherman And The Little Fish",
            "The Fox And The Goat",
            "The Lion And The Boar",
            "The Ant And The Grasshopper",
            "Two Cats And A Monkey",
            "An Ass In Lion’s Skin",
            "The Dog And The Shadow",
            "The Clever Monkey"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_animal_stories_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("Animal Stories");
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
                    TheTwo_Goats homefragment=new TheTwo_Goats();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                    Hare_Hound homefragment=new Hare_Hound();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==2){
                    FisherMan_Little_Fish homefragment=new FisherMan_Little_Fish();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==3){
                    Fox_Goat homefragment=new Fox_Goat();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==4){
                    Lion_And_Boar homefragment=new Lion_And_Boar();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==5){
                    And_Grashhopper homefragment=new And_Grashhopper();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==6){
                    Cats_And_Monkey homefragment=new Cats_And_Monkey();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==7){
                    Ass_As_Lion homefragment=new Ass_As_Lion();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==8){
                    The_Dog_And_Shadow homefragment=new The_Dog_And_Shadow();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==9){
                    Clever_Monkey homefragment=new Clever_Monkey();
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
