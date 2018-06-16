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
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_view, container, false);
        ArrayList<Place> cities = new ArrayList<>();
        cities.add(new Place(getString(R.string.disney_land), R.drawable.disneyland));
        cities.add(new Place(getString(R.string.yosemite_national_park), R.drawable.yosemite_national_park));
        cities.add(new Place(getString(R.string.golden_gate_bridge), R.drawable.golden_gate_bridge));
        cities.add(new Place(getString(R.string.sequoia_park), R.drawable.sequoia_national_park));
        cities.add(new Place(getString(R.string.fisherman_wharf), R.drawable.fishermans_whraf));
        cities.add(new Place(getString(R.string.universal_studios), R.drawable.universall_studios_hollywood));
        cities.add(new Place(getString(R.string.redwood_park), R.drawable.redwood_national_park));
        cities.add(new Place(getString(R.string.alcatraz_island), R.drawable.alcatraz_island));
        cities.add(new Place(getString(R.string.union_square), R.drawable.union_square));
        cities.add(new Place(getString(R.string.golden_gate_park), R.drawable.golden_gate_park));

        PlaceAdapter adapter = new PlaceAdapter(getContext(), cities);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return rootView;
    }

}
