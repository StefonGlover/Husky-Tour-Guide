package android.example.huskytourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

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
        //Inflate current View object in attractions_list.xml
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        //ArrayList to hold theme parks
        ArrayList<AttractionInformation> restaurants = new ArrayList<>();
        restaurants.add(new AttractionInformation(getString(R.string.rays_on_the_river), getString(R.string.rays_location), getString(R.string.rays_details),
                R.drawable.rays, getString(R.string.level3), getString(R.string.rays_webSite)));
        restaurants.add(new AttractionInformation(getString(R.string.fogo_de_chao), getString(R.string.fogo_location), getString(R.string.fogo_details),
                R.drawable.fogo, getString(R.string.level4), getString(R.string.fogo_webSite)));
        restaurants.add(new AttractionInformation(getString(R.string.sugar_factory), getString(R.string.sugar_location), getString(R.string.sugar_details),
                R.drawable.sugar, getString(R.string.level3), getString(R.string.sugar_webSite)));
        restaurants.add(new AttractionInformation(getString(R.string.atl_fish_market), getString(R.string.fish_location), getString(R.string.fish_details), R.drawable.fish2, getString(R.string.level3), getString(R.string.fish_webSite)));


        //Create adapter to hold list
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.attraction_List);
        listView.setAdapter(placeAdapter);
        return rootView;
    }
}
