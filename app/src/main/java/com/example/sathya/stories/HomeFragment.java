package com.example.sathya.stories;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.sathya.stories.StoryList.AnimalStoriesList;
import com.example.sathya.stories.StoryList.BedtimeStoriesList;
import com.example.sathya.stories.StoryList.ComicalStoriesList;
import com.example.sathya.stories.StoryList.ConedyStoriesList;
import com.example.sathya.stories.StoryList.FairyTaleStoriesList;
import com.example.sathya.stories.StoryList.FriendshipStoriesList;
import com.example.sathya.stories.StoryList.GeneralStoryList;
import com.example.sathya.stories.StoryList.InspirationalstoryList;
import com.example.sathya.stories.StoryList.LifeStoriesList;
import com.example.sathya.stories.StoryList.LoveStoriesList;
import com.example.sathya.stories.StoryList.MoralStoryList;
import com.example.sathya.stories.StoryList.MotivationalStoriesList;
import com.example.sathya.stories.Utilities.CustomGridViewAdapter;
import com.example.sathya.stories.Utilities.Item;

import java.util.ArrayList;



public class HomeFragment extends Fragment {


    GridView simpleList;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    String[] web = {
            "Bedtime Stories",
            "Moral Stories",
            "General Stories",
            "Comical Stories",
            "Fairytales Stories",
            "Animal Stories",
            "Comedy Stories",
            "Friendship Stories",
            "Love Stories",
            "Motivational Stories",
            "Inspirational Stories",
            "Life Stories"

    } ;
    int[] imageId = {
            R.drawable.bedtime,
            R.drawable. moralstory,
            R.drawable.generalstory,
            R.drawable.comicalstory,
            R.drawable.fairytalestory,
            R.drawable.animal,
            R.drawable.funnystory,
            R.drawable.friendshipstory,
            R.drawable.lovestory,
            R.drawable.motivationalstories,
            R.drawable.inspirationalstories,
            R.drawable.lifestories,



    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_home, container, false);
        simpleList = (GridView)v.findViewById(R.id.grid);
        CustomGridViewAdapter adapter = new  CustomGridViewAdapter(getActivity(), web, imageId);
        simpleList.setAdapter(adapter);
        getActivity().setTitle("Home");
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
    if(position==0){
        BedtimeStoriesList homefragment=new BedtimeStoriesList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }    if(position==1){
        MoralStoryList homefragment=new MoralStoryList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }  if(position==2){
        GeneralStoryList homefragment=new GeneralStoryList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }if(position==3){
        ComicalStoriesList homefragment=new ComicalStoriesList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }if(position==4){
        FairyTaleStoriesList homefragment=new FairyTaleStoriesList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }if(position==5){
        AnimalStoriesList homefragment=new AnimalStoriesList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }if(position==6){
        ConedyStoriesList homefragment=new ConedyStoriesList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }if(position==7){
        FriendshipStoriesList homefragment=new FriendshipStoriesList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }if(position==8){
        LoveStoriesList homefragment=new LoveStoriesList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }if(position==9){
        MotivationalStoriesList homefragment=new MotivationalStoriesList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }if(position==10){
        InspirationalstoryList homefragment=new InspirationalstoryList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }if(position==11){
        LifeStoriesList homefragment=new LifeStoriesList();
        final FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,homefragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

            }
        });



    return v;
    }

}
