package com.accubits.interview;

import android.util.SparseArray;
import android.util.SparseIntArray;


class InputJson {

    private static String dummyRestJson = "{\"deal1\":{\"vendor_name\": \"Domino's Pizza\",\"vendor_item\": \"Pizza\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": 3.5,\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal2\":{\"vendor_name\": \"McDonalds\",\"vendor_item\": \"Quick Bites\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"mc_logo.png\",\"vendor_bg\": \"mc_bg.png\",\"vendor_rating\": 4.5,\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal3\":{\"vendor_name\": \"Domino's Pizza\",\"vendor_item\": \"Pizza\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": 2.5,\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal4\":{\"vendor_name\": \"McDonalds\",\"vendor_item\": \"Quick Bites\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"mc_logo.png\",\"vendor_bg\": \"mc_bg.png\",\"vendor_rating\": 3.0,\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal5\":{\"vendor_name\": \"Domino's Pizza\",\"vendor_item\": \"Pizza\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": 1.75,\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal6\":{\"vendor_name\": \"McDonalds\",\"vendor_item\": \"Quick Bites\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"mc_logo.png\",\"vendor_bg\": \"mc_bg.png\",\"vendor_rating\": 1.5,\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal7\":{\"vendor_name\": \"Domino's Pizza\",\"vendor_item\": \"Pizza\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": 3.5,\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal8\":{\"vendor_name\": \"McDonalds\",\"vendor_item\": \"Quick Bites\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"mc_logo.png\",\"vendor_bg\": \"mc_bg.png\",\"vendor_rating\": 3.5,\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal9\":{\"vendor_name\": \"Domino's Pizza\",\"vendor_item\": \"Pizza\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": 3.5,\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal10\":{\"vendor_name\": \"McDonalds\",\"vendor_item\": \"Quick Bites\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"mc_logo.png\",\"vendor_bg\": \"mc_bg.png\",\"vendor_rating\": 3.5,\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal11\":{\"vendor_name\": \"McDonalds\",\"vendor_item\": \"Quick Bites\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"mc_logo.png\",\"vendor_bg\": \"mc_bg.png\",\"vendor_rating\": 3.5,\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal12\":{\"vendor_name\": \"Domino's Pizza\",\"vendor_item\": \"Pizza\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": 3.5,\"vendor_rebate\": 15,\"online_pymnt\" : true}}}";
    private static String dummyElecJson = "{\"deal1\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal2\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal3\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal4\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal5\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal6\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal7\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal8\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal9\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal10\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal11\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal12\":{\"vendor_name\": \"Samsung TV\",\"vendor_item\": \"Television\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true}}";
    private static String dummyFashionJson = "{\"deal1\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal2\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal3\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal4\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal5\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal6\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal7\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal8\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal9\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : false},\"deal10\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal11\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true},\"deal12\":{\"vendor_name\": \"Raymond Shirts\",\"vendor_item\": \"Men's Shirt\",\"vendor_address\": \"Shop 5, 635dd\",\"vendor_logo\": \"dominoz_logo.png\",\"vendor_bg\": \"dominoz_bg.png\",\"vendor_rating\": \"3.5\",\"vendor_rebate\": 15,\"online_pymnt\" : true}}";
    private static SparseArray<String> categories = new SparseArray<>();

    /*************************
     * Method to get data
     * Could be implemented
     * to take data from online
     * @return Data as Json
     **************************/
    static String getRestaurantJson(){
        return dummyRestJson;
    }
    /*************************
     * Method to get data
     * Could be implemented
     * to take data from online
     * @return Data as Json
     **************************/
    public static String getElectronicsJson(){
        return dummyElecJson;
    }
    /*************************
     * Method to get data
     * Could be implemented
     * to take data from online
     * @return Data as Json
     **************************/
    public static String getFashionJson(){
        return dummyFashionJson;
    }


    /*************************
     * Method to get Categories
     **************************/
    public static  SparseArray<String> getCategoris(){
        if(categories.size() != 3) {
            categories.append(0, "Restaurant");
            categories.append(1, "Electronics");
            categories.append(2, "Fashion");
        }
        return categories;
    }
}
