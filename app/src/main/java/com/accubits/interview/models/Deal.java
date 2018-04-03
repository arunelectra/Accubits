package com.accubits.interview.models;

import com.accubits.interview.variables.Keys;

import org.json.JSONException;
import org.json.JSONObject;

public class Deal {

    private String vendorName;
    private String vendorItem;
    private String vendorAddress;
    private String vendorLogoUrl;
    private String vendorImgUrl;
    private float vendorRating = 0.0f;
    private double vendorRebate = 0.0;
    private boolean isOnlinePaymentAvailable = false;

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorItem() {
        return vendorItem;
    }

    public void setVendorItem(String vendorItem) {
        this.vendorItem = vendorItem;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorLogoUrl() {
        return vendorLogoUrl;
    }

    public void setVendorLogoUrl(String vendorLogoUrl) {
        this.vendorLogoUrl = vendorLogoUrl;
    }

    public String getVendorImgUrl() {
        return vendorImgUrl;
    }

    public void setVendorImgUrl(String vendorImgUrl) {
        this.vendorImgUrl = vendorImgUrl;
    }


    public float getVendorRating() {
        return vendorRating;
    }

    public void setVendorRating(float vendorRating) {
        this.vendorRating = vendorRating;
    }

    public double getVendorRebate() {
        return vendorRebate;
    }

    public void setVendorRebate(double vendorRebate) {
        this.vendorRebate = vendorRebate;
    }
    public boolean isOnlinePaymentAvailable() {
        return isOnlinePaymentAvailable;
    }

    public void setOnlinePaymentAvailable(boolean onlinePaymentAvailable) {
        isOnlinePaymentAvailable = onlinePaymentAvailable;
    }

    /*****************************
     * Method to get an obj
     * with pre-filled values
     *****************************/
    public boolean initialize(JSONObject jObj){

        try {
            setVendorName(jObj.getString(Keys.VendorName));
            setVendorItem(jObj.getString(Keys.VendorItem));
            setVendorAddress(jObj.getString(Keys.VendorAddress));
            setVendorImgUrl(jObj.getString(Keys.VendorBG));
            setVendorLogoUrl(jObj.getString(Keys.VendorLogo));
            setVendorRating(Float.valueOf(jObj.getString(Keys.VendorRating)));
            setVendorRebate(jObj.getDouble(Keys.VendorRebate));
            setOnlinePaymentAvailable(jObj.getBoolean(Keys.IsOnlinePaymentAvailable));

            return true;

        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }


}
