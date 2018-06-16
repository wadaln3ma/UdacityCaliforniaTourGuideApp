package com.android.udacitycaliforniatourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, ArrayList<Place> cities) {
        super(context, 0, cities);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.place_list_items,parent,false);
        }

        Place currentPlace = getItem(position);

        TextView cityName = listItemView.findViewById(R.id.place_name);
        cityName.setText(currentPlace.getmPlaceName());

        TextView cityPopulation = listItemView.findViewById(R.id.place_attribute);
        if (currentPlace.hasAttribute()){
            cityPopulation.setText(currentPlace.getmPlaceAttribute());
        }else {
            cityPopulation.setVisibility(View.GONE);
        }

        ImageView imageView = listItemView.findViewById(R.id.place_image);
        imageView.setImageResource(currentPlace.getmPlaceImage());

        return listItemView;
    }
}
