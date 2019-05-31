package com.cityguide.sanikas.bustracking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutSchoolFragment extends Fragment {


    public AboutSchoolFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((DashboardActivity)getActivity()).setActionBarTitle("About");
        return inflater.inflate(R.layout.fragment_about_school, container, false);
    }

}
