package com.example.hp.fragmentsample.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.fragmentsample.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashbordFragment extends Fragment {


    public DashbordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashbord, container, false);
        return view;
    }

}
