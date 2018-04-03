package com.accubits.interview;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.accubits.interview.adapters.Adpt_Deals;
import com.accubits.interview.models.Deal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

/******************************
 * A placeholder fragment
 ******************************/
public class Frg_Section extends Fragment {

    //region Declarations
    private int sectionNumber;
    private RecyclerView mRecycler;
    private ArrayList<Deal> dealsList = new ArrayList<>();
    private Adpt_Deals mAdapterDeals;
    private Context context;

    //ednregion

    //region Constructors
    public Frg_Section() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static Frg_Section newInstance(int sectionNumber) {
        Frg_Section fragment = new Frg_Section();
        fragment.sectionNumber = sectionNumber;
        return fragment;
    }
    //endregion

    //region Lifecycle
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frg_section, container, false);
        mRecycler = rootView.findViewById(R.id.main_recycler);


        return rootView;
    }

    /*******************************
     * OnActivity Created Method
     *******************************/
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        context = getActivity().getApplicationContext();

        Initialize();
    }
    //endregion

    //region Initialize

    /***************************
     * Initializing Method
     ***************************/
    private void Initialize() {

        LinearLayoutManager mMonthDateManager = new LinearLayoutManager(context);
        mMonthDateManager.setOrientation(LinearLayoutManager.VERTICAL);
//        mMonthDateManager.setStackFromEnd(true);
//        mMonthDateManager.setReverseLayout(true);
        mRecycler.setLayoutManager(mMonthDateManager);

        mAdapterDeals = new Adpt_Deals(context, dealsList);
        mRecycler.setAdapter(mAdapterDeals);

        PrepareAndShowDeals();
    }

    //endregion


    //region Functions

    /***************************
     * Initializing Method
     ***************************/
    private void PrepareAndShowDeals() {
        String jsonDeals;
        switch (sectionNumber){
            case 1:
                jsonDeals = InputJson.getRestaurantJson();
                break;
            case 2:
                jsonDeals = InputJson.getElectronicsJson();
                break;
            case 3:
                jsonDeals = InputJson.getFashionJson();
                break;
            default:
                jsonDeals = InputJson.getRestaurantJson();
                break;
        }

        try {


            JSONObject jsonDealsObj = new JSONObject(jsonDeals);

            JSONArray keys = jsonDealsObj.names ();

            for (int i = 0; i < keys.length (); ++i) {
                String key = keys.getString (i);
                Deal dealObj = new Deal();
                if(dealObj.initialize(jsonDealsObj.getJSONObject(key)))
                    dealsList.add(dealObj);
            }

            mAdapterDeals.Update(dealsList);

        } catch (JSONException e) {
            e.printStackTrace();
        }



    }

    //endregion


    //region Adapters

    //endregion
}