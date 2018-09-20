package com.example.admin.tourguideapp;

public class Tour {
    private int imageResource;
    private String destinationName;

    public Tour(int imageResource, String destinationName) {
        this.imageResource = imageResource;
        this.destinationName = destinationName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getDestinationName() {
        return destinationName;
    }
}
