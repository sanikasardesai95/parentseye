package com.cityguide.sanikas.bustracking;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends Fragment {

    private CheckBox checkbox1,checkBox2,checkBox3,checkBox4;
    private Dialog mdialog;

    public SettingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((DashboardActivity)getActivity()).setActionBarTitle("Settings");
        return inflater.inflate(R.layout.fragment_settings, container, false);


    }

}
