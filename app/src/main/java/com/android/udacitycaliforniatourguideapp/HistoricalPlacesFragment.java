package com.android.udacitycaliforniatourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalPlacesFragment extends Fragment {


    public HistoricalPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_view, container, false);
        ArrayList<Place> cities = new ArrayList<>();
        cities.add(new Place(getString(R.string.paramount_studios), getString(R.string.los_angeles), R.drawable.paramount_studios));
        cities.add(new Place(getString(R.string.hollywood_museum), getString(R.string.los_angeles), R.drawable.the_hollywood_museum));
        cities.add(new Place(getString(R.string.getty_museum), getString(R.string.los_angeles), R.drawable.the_j_paul_getty_museum));
        cities.add(new Place(getString(R.string.fort_point), getString(R.string.san_francisco), R.drawable.fort_point_national_historic_site));
        cities.add(new Place(getString(R.string.getty_villa), getString(R.string.los_angeles), R.drawable.getty_villa));
        cities.add(new Place(getString(R.string.hearst_castle), getString(R.string.coast_of_california), R.drawable.hearst_castle));
        cities.add(new Place(getString(R.string.sutro_baths), getString(R.string.los_angeles), R.drawable.sutro_baths));
        cities.add(new Place(getString(R.string.fort_mason), getString(R.string.san_francisco), R.drawable.fort_mason));
        cities.add(new Place(getString(R.string.castello_amorosa), getString(R.string.calistoga), R.drawable.castello_di_amorosa));
        cities.add(new Place(getString(R.string.mission_santa_barbara), getString(R.string.santa_barbara), R.drawable.mission_santa_barbara));

        PlaceAdapter adapter = new PlaceAdapter(getContext(), cities);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return rootView;
    }

}
