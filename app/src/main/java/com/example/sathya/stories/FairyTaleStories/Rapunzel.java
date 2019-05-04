package com.example.sathya.stories.FairyTaleStories;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sathya.stories.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Rapunzel extends Fragment {


    public Rapunzel() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_rapunzel, container, false);

    return  v;}

}
