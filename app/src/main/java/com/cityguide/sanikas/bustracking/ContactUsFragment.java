package com.cityguide.sanikas.bustracking;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ContactUsFragment extends Fragment {

    public ContactUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((DashboardActivity)getActivity()).setActionBarTitle("contactus");
        return inflater.inflate(R.layout.fragment_contact_us, container, false);
    }

}

