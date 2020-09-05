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
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate current View object in attractions_list.xml
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        //ArrayList to hold shopping centers
        ArrayList<AttractionInformation> shopping = new ArrayList<>();
        shopping.add(new AttractionInformation(getString(R.string.mall_of_ga), getString(R.string.mallga_location), getString(R.string.mallga_details), R.drawable.gamall, getString(R.string.level3), getString(R.string.mallGa_webSite)));
        shopping.add(new AttractionInformation(getString(R.string.lenox_square), getString(R.string.lenox_location), getString(R.string.lenox_details), R.drawable.lenox, getString(R.string.level4), getString(R.string.lenox_webSite)));
        shopping.add(new AttractionInformation(getString(R.string.altanta_station), getString(R.string.atlantic_location), getString(R.string.atlantic_details), R.drawable.atlanticstation, getString(R.string.level3), getString(R.string.atlantic_webSite)));
        shopping.add(new AttractionInformation(getString(R.string.outlet_mall), getString(R.string.outlets_location), getString(R.string.outlets_details), R.drawable.northga, getString(R.string.level3), getString(R.string.outlets_webSite)));


        //Create adapter to hold list
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), shopping);
        ListView listView = (ListView) rootView.findViewById(R.id.attraction_List);
        listView.setAdapter(placeAdapter);
        return rootView;
    }
}
