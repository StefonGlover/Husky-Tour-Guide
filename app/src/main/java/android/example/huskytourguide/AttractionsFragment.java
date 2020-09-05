package android.example.huskytourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate current View object in attractions_list.xml
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        //ArrayList for different attractions
        ArrayList<AttractionInformation> attractions = new ArrayList<>();

        //Adding to the list
        attractions.add(new AttractionInformation(getString(R.string.georgia_aquarium), getString(R.string.aquarium_location), getString(R.string.aquarium_details), R.drawable.aquarium2, getString(R.string.level3), getString(R.string.aquarium_webSite)));
        attractions.add(new AttractionInformation(getString(R.string.zoo_atlanta), getString(R.string.zoo_location), getString(R.string.zoo_details), R.drawable.zoo, getString(R.string.level3), getString(R.string.zoo_webSite)));
        attractions.add(new AttractionInformation(getString(R.string.centennial_park), getString(R.string.centennial_location), getString(R.string.centennial_details), R.drawable.centennial, getString(R.string.no_cost), getString(R.string.centennial_webSite)));
        attractions.add(new AttractionInformation(getString(R.string.world_coke), getString(R.string.coke_location), getString(R.string.coke_details), R.drawable.coke, getString(R.string.level2), getString(R.string.coke_webSite)));


        //Create adapter to hold list
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.attraction_List);
        listView.setAdapter(placeAdapter);

        return rootView;

    }
}
