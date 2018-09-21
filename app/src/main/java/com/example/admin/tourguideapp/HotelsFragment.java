package com.example.admin.tourguideapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private TourAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList <Tour> stringArrayList = new ArrayList <>();

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         /*
        Fragment will use the recycler_list_view XML layout resource because it will be displaying a list of words.
         */
        View rootView = inflater.inflate(R.layout.fragment_view, container, false);

        //Set up the tour adapter

        mRecyclerView = rootView.findViewById(R.id.my_recycler_view);
        adapter = new TourAdapter(getActivity(), stringArrayList);
        mRecyclerView.setAdapter(adapter);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        tourGuideData();
        return rootView;
    }

    //Method containing the defined arrayList
    public void tourGuideData() {
        stringArrayList.add(new Tour(R.drawable.lamu, "Best Guac!!"));
        stringArrayList.add(new Tour(R.drawable.lamu, "Best Guac!!"));
        stringArrayList.add(new Tour(R.drawable.lamu, "Best Guac!!"));


        adapter.notifyDataSetChanged();
    }

}
