package com.cityguide.sanikas.bustracking;


import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cityguide.sanikas.bustracking.ViewHolder.ListAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((DashboardActivity) getActivity()).setActionBarTitle("Home");

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.rv);
        ListAdapter listAdapter=new ListAdapter();
        recyclerView.setAdapter(listAdapter);




        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
