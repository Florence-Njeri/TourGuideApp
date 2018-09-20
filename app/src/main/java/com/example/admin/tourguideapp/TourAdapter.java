package com.example.admin.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends RecyclerView.Adapter <TourAdapter.TourViewHolder> {
    private Context context;
    private ArrayList <Tour> stringArrayList;

    public TourAdapter(Context context, ArrayList <Tour> stringArrayList) {
        this.stringArrayList = stringArrayList;
        this.context = context;

    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public TourViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // create a new view and define the layout to inflate with the content ie the recyler_view
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_list_view, viewGroup, false);
        return new TourViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull TourViewHolder tourHolder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Tour tour = stringArrayList.get(position);
        tourHolder.infoText.setText(tour.getDestinationName());
        tourHolder.destinationImageview.setImageResource(tour.getImageResource());
    }

    @Override
    public int getItemCount() {
        return stringArrayList.size();
    }

    //Create a viewHolder for the recyclerview
    public class TourViewHolder extends RecyclerView.ViewHolder {
        private TextView infoText;
        private ImageView destinationImageview;

        public TourViewHolder(@NonNull View itemView) {
            super(itemView);
            infoText = itemView.findViewById(R.id.info_text);
            destinationImageview = itemView.findViewById(R.id.destinationImageView);

            //Create a method to get the details to inflate each view

        }
    }


}
