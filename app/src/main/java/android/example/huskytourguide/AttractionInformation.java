package android.example.huskytourguide;

import androidx.annotation.NonNull;

public class AttractionInformation {

   //Instance variables
    protected String attractionName;
    protected String attractionLocation;
    protected String attractionDescription;
    protected int attractionResourceID;
    protected String attractionCost;
    protected String website;

    /**
     * Default constructor
     */
    public AttractionInformation() {
    }

    public AttractionInformation(String attractionName, String attractionLocation, String attractionDescription,
                                 int attractionResourceID, String attractionCost, String website) {
        this.attractionName = attractionName;
        this.attractionLocation = attractionLocation;
        this.attractionDescription = attractionDescription;
        this.attractionResourceID = attractionResourceID;
        this.attractionCost = attractionCost;
        this.website = website;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public String getAttractionLocation() {
        return attractionLocation;
    }

    public void setAttractionLocation(String attractionLocation) {
        this.attractionLocation = attractionLocation;
    }

    public String getAttractionDescription() {
        return attractionDescription;
    }

    public void setAttractionDescription(String attractionDescription) {
        this.attractionDescription = attractionDescription;
    }

    public int getAttractionResourceID() {
        return attractionResourceID;
    }

    public void setAttractionResourceID(int attractionResourceID) {
        this.attractionResourceID = attractionResourceID;
    }

    public String getAttractionCost() {
        return attractionCost;
    }

    public void setAttractionCost(String attractionCost) {
        this.attractionCost = attractionCost;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "AttractionInformation{" +
                "attractionName='" + attractionName + '\'' +
                ", attractionLocation='" + attractionLocation + '\'' +
                ", attractionDescription='" + attractionDescription + '\'' +
                ", attractionResourceID=" + attractionResourceID +
                ", attractionCost='" + attractionCost + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
