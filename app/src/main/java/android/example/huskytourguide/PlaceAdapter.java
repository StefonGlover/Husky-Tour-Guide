package android.example.huskytourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<AttractionInformation>{

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param attractions
     */
    public PlaceAdapter(Activity context, ArrayList<AttractionInformation> attractions){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        AttractionInformation currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the attraction name
        TextView attractionName = convertView.findViewById(R.id.attractionName);
        attractionName.setText(currentAttraction.getAttractionName());

        // Find the TextView in the list_item.xml layout with the attraction location
        TextView attractionLocation = (TextView) convertView.findViewById(R.id.attractionLocation);
        attractionLocation.setText(currentAttraction.getAttractionLocation());

        // Find the TextView in the list_item.xml layout with the attraction description
        TextView attractionDescription = (TextView) convertView.findViewById(R.id.attractionDescription);
        attractionDescription.setText(currentAttraction.getAttractionDescription());

        // Find the TextView in the list_item.xml layout with the attraction cost.
        TextView attractionCost = (TextView) convertView.findViewById(R.id.attractionCost);
        attractionCost.setText(currentAttraction.getAttractionCost());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) convertView.findViewById(R.id.picture);
        imageView.setImageResource(currentAttraction.getAttractionResourceID());

        //Find the TextView in the list_item.xml layout with the ID webSite
        TextView webSite = (TextView) convertView.findViewById(R.id.webSite);
        webSite.setText(currentAttraction.getWebsite());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return convertView;
    }
}
