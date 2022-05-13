package com.example.gardenapp;

public class GardenModel {

    private String plantName;
    private int imageID;

    public GardenModel(String plantName, int imageID) {
        this.plantName = plantName;
        this.imageID = imageID;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public int getImageID() {
        return imageID;
    }
}
