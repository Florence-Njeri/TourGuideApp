package com.example.admin.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ImageView imageView = findViewById(R.id.destination_image_view);
        TextView textView = findViewById(R.id.destination_text_view);
        /*
       Get the data sent from the adapter and set it to the imageview and textview
         */
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("Destination")) {
                String destinationName = intent.getStringExtra("Destination");
                textView.setText(destinationName);
            }
            if (intent.hasExtra("Image")) {
                int destinationImage = intent.getIntExtra("Image", 0);
                imageView.setImageResource(destinationImage);
            }
      //Setting an intent to open up google maps on clicking on the maps icon

            ImageView maps = findViewById(R.id.maps_icon);
            maps.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri gmmIntentUri = Uri.parse("geo:2.2696,40.9006");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    if (mapIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(mapIntent);
                    }
                }
            });

        }
    }
}
