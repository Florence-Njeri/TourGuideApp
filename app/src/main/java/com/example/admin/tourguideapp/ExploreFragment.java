package com.example.admin.tourguideapp;


import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private TourAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList<Tour> stringArrayList = new ArrayList <>();

    public ExploreFragment() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
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
        stringArrayList.add(new Tour(R.drawable.manda_island, getString(R.string.manda)));
        stringArrayList.add(new Tour(R.drawable.lamu_old_town, getString(R.string.lamu_old_town)));
        stringArrayList.add(new Tour(R.drawable.lamu_museum, getString(R.string.lamu_museum)));
        stringArrayList.add(new Tour(R.drawable.lamu_fort, getString(R.string.lamu_fort)));
        stringArrayList.add(new Tour(R.drawable.masjid_riyadha, getString(R.string.masjid_riyadha)));


        adapter.notifyDataSetChanged();
    }
}
