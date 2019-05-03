package com.example.sathya.stories.StoryList;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
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
import com.example.sathya.stories.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


/**
 * A simple {@link Fragment} subclass.
 */
public class BedtimeStoriesList extends Fragment {
  InterstitialAd mInterstitialAd;

  ListView lv1;
    String[] listItem={"A CITY RAT AND A VILLAGE RAT",
            "NEVER CHALLENGE THE NATURE",
            "ENCOUNTER WITH A GHOST",
            "ONCE BITTEN TWICE SHY",
            "THE WIND AND THE SUN",
            "DOG IN A MANAGER",
            "EVERYONE CARES FOR HIS ENDS",
            "BEGINNING SHOWS THE END",
            "THE MISTAKEN COMPLAINT",
            "TOM, THE WONDER BOY"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_bedtime_stories_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("Bedtime Stories");
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, listItem);
        lv1.setAdapter(adapter);

        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId("ca-app-pub-3643602219143275/2250844071");
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
                   City_rat_village_rat homefragment=new City_rat_village_rat();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                   Never_challege_nature homefragment=new Never_challege_nature();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==2){
                   Encounter_with_Ghost homefragment=new Encounter_with_Ghost();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==3){
                   Once_bitten_twice_shy homefragment=new Once_bitten_twice_shy();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==4){
                    Wind_and_Sun homefragment=new Wind_and_Sun();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==5){
                    Dog_in_a_manager homefragment=new Dog_in_a_manager();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==6){
                    Everyone_care_for_his_end homefragment=new Everyone_care_for_his_end();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==7){
                    Beginning_shows_the_End homefragment=new Beginning_shows_the_End();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==8){
                    The_Mistaken_Complaint homefragment=new The_Mistaken_Complaint();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==9){
                    Tom_and_wonderboy homefragment=new Tom_and_wonderboy();
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
