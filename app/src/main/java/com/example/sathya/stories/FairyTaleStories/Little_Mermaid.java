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
public class Little_Mermaid extends Fragment {


    public Little_Mermaid() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_little__mermaid, container, false);

        getActivity().setTitle("THE LITTLE MERMAID");
    return  v;}

}
