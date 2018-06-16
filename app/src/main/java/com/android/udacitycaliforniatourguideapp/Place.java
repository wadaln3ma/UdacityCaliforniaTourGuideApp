package com.android.udacitycaliforniatourguideapp;

public class Place {
    private String mPlaceName;
    private String hasNoAttribute = null;
    private String mPlaceAttriue = hasNoAttribute;
    private int mPlaceImage;

    public Place(String mPlaceName, int mPlaceImage) {
        this.mPlaceName = mPlaceName;
        this.mPlaceImage = mPlaceImage;
    }

    public Place(String mPlaceName, String mPlaceAttriue, int mPlaceImage) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAttriue = mPlaceAttriue;
        this.mPlaceImage = mPlaceImage;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public int getmPlaceImage() {
        return mPlaceImage;
    }

    public String getmPlaceAttribute() {
        return mPlaceAttriue;
    }

    public boolean hasAttribute(){
        return mPlaceAttriue != hasNoAttribute;
    }
}
