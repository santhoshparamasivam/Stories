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

import com.example.sathya.stories.ComicalStories.England_London;
import com.example.sathya.stories.ComicalStories.Fear_Of_God;
import com.example.sathya.stories.ComicalStories.In_Zoo;
import com.example.sathya.stories.ComicalStories.Innocent_Man;
import com.example.sathya.stories.ComicalStories.Keepin_Doctor_Away;
import com.example.sathya.stories.ComicalStories.Love_Test;
import com.example.sathya.stories.ComicalStories.Only_For_Love;
import com.example.sathya.stories.ComicalStories.Selling_The_House;
import com.example.sathya.stories.ComicalStories.To_The_City_In_A_Min;
import com.example.sathya.stories.ComicalStories.Two_Targets_in_one_Shot;
import com.example.sathya.stories.ComicalStories.Unfair_World;
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
import com.example.sathya.stories.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * A simple {@link Fragment} subclass.
 */
public class ComicalStoriesList extends Fragment {


    private InterstitialAd mInterstitialAd;
    ListView lv1;
    String[] listItem={"FEAR OF GOD",
            "ENGLAND OR LONDON",
            "SELLING OF THE HOUSE",
            "THE LOVE TEST",
            "ONLY FOR LOVE",
            "THE INNOCENT MAN",
            "TWO TARGETS IN ONE SHOT",
            "TO THE CITY IN A MINUTE",
            "AN UNFAIR WORLD",
            "IN THE ZOO"
            ,"KEEPING THE DOCTOR AWAY"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_classic_stories_list, container, false);
        View v= inflater.inflate(R.layout.fragment_classic_stories_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("Comical Stories");
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
                    Fear_Of_God homefragment=new Fear_Of_God();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                    England_London homefragment=new England_London();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==2){
                    Selling_The_House homefragment=new Selling_The_House();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==3){
                    Love_Test homefragment=new Love_Test();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==4){
                    Only_For_Love homefragment=new Only_For_Love();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==5){
                    Innocent_Man homefragment=new Innocent_Man();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==6){
                    Two_Targets_in_one_Shot homefragment=new Two_Targets_in_one_Shot();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==7){
                    To_The_City_In_A_Min homefragment=new To_The_City_In_A_Min();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==8){
                    Unfair_World homefragment=new Unfair_World();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==9){
                    In_Zoo homefragment=new In_Zoo();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==10){
                    Keepin_Doctor_Away homefragment=new Keepin_Doctor_Away();
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
