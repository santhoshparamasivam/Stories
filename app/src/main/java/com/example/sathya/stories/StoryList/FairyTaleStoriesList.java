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
import com.example.sathya.stories.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * A simple {@link Fragment} subclass.
 */
public class FairyTaleStoriesList extends Fragment {


    public FairyTaleStoriesList() {
        // Required empty public constructor
    }
    private InterstitialAd mInterstitialAd;

    ListView lv1;
    String[] listItem={"CINDRELLA",
            "BEAUTY AND BEAST",
            "SLEEPING BEAUTY",
            "RAPUNZEL",
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
//        return inflater.inflate(R.layout.fragment_fairy_tale_stories_list, container, false);
        View v= inflater.inflate(R.layout.fragment_fairy_tale_stories_list, container, false);
        lv1=(ListView)v.findViewById(R.id.lv1);
        getActivity().setTitle("FairyTale Stories");
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
                    Cindrella_Story homefragment=new Cindrella_Story();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==1){
                    Beauty_Beast homefragment=new Beauty_Beast();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==2){
                    Sleeping_Beauty homefragment=new Sleeping_Beauty();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==3){
                    Rapunzel homefragment=new Rapunzel();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }   if(position==4){
                    Snow_White homefragment=new Snow_White();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==5){
                    Little_Mermaid homefragment=new Little_Mermaid();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==6){
                    Goldilocks_and_Three_Bears homefragment=new Goldilocks_and_Three_Bears();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==7){
                    Hansel_Gretel homefragment=new Hansel_Gretel();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==8){
                    Ugly_Duck homefragment=new Ugly_Duck();
                    final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame,homefragment);
                    transaction.addToBackStack(null);
                    transaction.commit();

                }if(position==9){
                    Frog_Prince homefragment=new Frog_Prince();
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
