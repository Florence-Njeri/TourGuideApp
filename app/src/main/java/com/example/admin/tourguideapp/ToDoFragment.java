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
public class ToDoFragment extends android.support.v4.app.Fragment {
    private RecyclerView mRecyclerView;
    private TourAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList <Tour> stringArrayList = new ArrayList <>();

    public ToDoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         /*
        Fragment will use the recycler_list_view XML layout resource because it will be displaying a list of words.
         */
        View rootView = inflater.inflate(R.layout.fragment_view, container, false);


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
        stringArrayList.add(new Tour(R.drawable.dhow_sail, getString(R.string.sail_dhow)));
        stringArrayList.add(new Tour(R.drawable.explore_lamu_streets, getString(R.string.explore_lamu)));
        stringArrayList.add(new Tour(R.drawable.ruined_city_takwa, getString(R.string.visit_takwa)));
        stringArrayList.add(new Tour(R.drawable.sunset_gaze_manda, getString(R.string.sunset_gaze)));
        stringArrayList.add(new Tour(R.drawable.swahili_house, getString(R.string.rent_swahilihouse)));
        stringArrayList.add(new Tour(R.drawable.beaches, getString(R.string.walk_on_a_beach)));

        adapter.notifyDataSetChanged();
    }

}
