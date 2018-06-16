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
public class CaMajorCitiesFragment extends Fragment {

    public CaMajorCitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_view, container, false);
        ArrayList<Place> cities = new ArrayList<>();
        cities.add(new Place(getString(R.string.los_angeles), getString(R.string.los_angeles_population), R.drawable.los_angeles));
        cities.add(new Place(getString(R.string.san_diego), getString(R.string.san_diego_population), R.drawable.san_diego));
        cities.add(new Place(getString(R.string.san_jose), getString(R.string.san_jose_population), R.drawable.san_jose));
        cities.add(new Place(getString(R.string.san_francisco), getString(R.string.san_francisco_population), R.drawable.san_francisco));
        cities.add(new Place(getString(R.string.fresno), getString(R.string.fresno_population), R.drawable.fresno));
        cities.add(new Place(getString(R.string.sacramento), getString(R.string.sacramento_population), R.drawable.sacramento));
        cities.add(new Place(getString(R.string.long_beach), getString(R.string.long_beach_population), R.drawable.longbeach));
        cities.add(new Place(getString(R.string.oakland), getString(R.string.oakland_population), R.drawable.oakland));
        cities.add(new Place(getString(R.string.bakersfield), getString(R.string.bakersfield_population), R.drawable.bakersfield));
        cities.add(new Place(getString(R.string.anaheim), getString(R.string.anaheim_population), R.drawable.anheim));

        PlaceAdapter adapter = new PlaceAdapter(getContext(), cities);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return rootView;
    }

}
