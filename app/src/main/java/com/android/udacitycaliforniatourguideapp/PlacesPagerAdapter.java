package com.android.udacitycaliforniatourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlacesPagerAdapter extends FragmentPagerAdapter {
    Context mContext;
    public PlacesPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0 :
                fragment = new CaMajorCitiesFragment();
            break;
            case 1 :
                fragment = new PlacesFragment();
            break;
            case 2 :
                fragment = new RestaurantsFragment();
            break;
            case 3 :
                fragment = new HistoricalPlacesFragment();
            break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = mContext.getString(R.string.major_cities);
            break;
            case 1:
                title = mContext.getString(R.string.popular);
            break;
            case 2:
                title = mContext.getString(R.string.restaurants);
            break;
            case 3:
                title = mContext.getString(R.string.historical);
            break;
        }
        return title;
    }
}
