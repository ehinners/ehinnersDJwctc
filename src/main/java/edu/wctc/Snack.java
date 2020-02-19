package edu.wctc;

public class Snack
{
    private String flavorProfile;
    private int snackID;
    private String description;
    private int timesOrdered;
    private double servings;
    private int tier;
    private String snackName;
    private String snackType;

    public Snack() {
    }

    public String getFlavorProfile() {
        return flavorProfile;
    }

    public void setFlavorProfile(String flavorProfile) {
        this.flavorProfile = flavorProfile;
    }

    public int getSnackID() {
        return snackID;
    }

    public void setSnackID(int snackID) {
        this.snackID = snackID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTimesOrdered() {
        return timesOrdered;
    }

    public void setTimesOrdered(int timesOrdered) {
        this.timesOrdered = timesOrdered;
    }

    public double getServings() {
        return servings;
    }

    public void setServings(double servings) {
        this.servings = servings;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public String getSnackType() {
        return snackType;
    }

    public void setSnackType(String snackType) {
        this.snackType = snackType;
    }
}
