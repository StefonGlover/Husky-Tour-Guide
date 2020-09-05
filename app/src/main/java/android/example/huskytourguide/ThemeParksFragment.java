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
public class ThemeParksFragment extends Fragment {

    public ThemeParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate current View object in attractions_list.xml
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        //ArrayList to hold theme parks
        ArrayList<AttractionInformation> themeParks = new ArrayList<>();
        themeParks.add(new AttractionInformation(getString(R.string.six_flags), getString(R.string.six_location), getString(R.string.six_details), R.drawable.sixflags, getString(R.string.level3), getString(R.string.sixflags_webSite)));
        themeParks.add(new AttractionInformation(getString(R.string.stone_mountain), getString(R.string.stone_location), getString(R.string.stone_details), R.drawable.stonemountain, getString(R.string.level2), getString(R.string.stone_webSite)));
        themeParks.add(new AttractionInformation(getString(R.string.lanier_islands), getString(R.string.lanier_location), getString(R.string.lanier_details), R.drawable.lanier, getString(R.string.level2), getString(R.string.lanier_webSite)));
        themeParks.add(new AttractionInformation(getString(R.string.legoland), getString(R.string.lego_location), getString(R.string.lego_details), R.drawable.legoland, getString(R.string.level2), getString(R.string.legoland_webSite)));

        //Create adapter to hold list
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), themeParks);
        ListView listView = (ListView) rootView.findViewById(R.id.attraction_List);
        listView.setAdapter(placeAdapter);
        return rootView;
    }
}
