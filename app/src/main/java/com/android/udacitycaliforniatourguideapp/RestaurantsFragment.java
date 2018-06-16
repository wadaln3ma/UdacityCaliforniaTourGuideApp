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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_view, container, false);
        ArrayList<Place> cities = new ArrayList<>();
        cities.add(new Place(getString(R.string.melisse_restaurant), getString(R.string.santa_monica), R.drawable.melissa_santa_monica));
        cities.add(new Place(getString(R.string.providence), getString(R.string.los_angeles) , R.drawable.providence_los_angeles));
        cities.add(new Place(getString(R.string.five_stars_pizza), getString(R.string.ontario), R.drawable.five_star_pizza_ontario_ca));
        cities.add(new Place(getString(R.string.water_grill), getString(R.string.los_angeles) , R.drawable.water_grill_los_angeles));
        cities.add(new Place(getString(R.string.addison), getString(R.string.san_diego) , R.drawable.addison));
        cities.add(new Place(getString(R.string.gary_danko), getString(R.string.san_francisco) , R.drawable.gary_danko));
        cities.add(new Place(getString(R.string.quince), getString(R.string.san_francisco) , R.drawable.quince));
        cities.add(new Place(getString(R.string.biba), getString(R.string.sacramento) , R.drawable.biba));
        cities.add(new Place(getString(R.string.baume), getString(R.string.palo_alto) , R.drawable.baume));
        cities.add(new Place(getString(R.string.acquerello), getString(R.string.san_francisco) , R.drawable.acquerello));

        PlaceAdapter adapter = new PlaceAdapter(getContext(), cities);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return rootView;
    }

}
