package com.cityguide.sanikas.bustracking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class EditLocationFragment extends Fragment {


    public EditLocationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((DashboardActivity)getActivity()).setActionBarTitle("Location");
        return inflater.inflate(R.layout.fragment_edit_location, container, false);
    }

}
