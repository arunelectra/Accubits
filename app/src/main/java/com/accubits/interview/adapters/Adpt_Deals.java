package com.accubits.interview.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.accubits.interview.R;
import com.accubits.interview.models.Deal;

import java.util.ArrayList;

public class Adpt_Deals extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Deal> dealsList;
    private final Context context;

    /***********************************
     * Constructor
     ***********************************/

    public Adpt_Deals(Context context, ArrayList<Deal> deals) {
        dealsList = deals;
        this.context = context;

    }

    /***********************************
     * Update
     ***********************************/

    public void Update(ArrayList<Deal> deals) {
        dealsList = deals;
        notifyDataSetChanged();
    }

    /***********************************
     * Create ViewHolder
     ***********************************/
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View v;
        Log.w("Posiut", String.valueOf(viewType));
        if(viewType == 0) {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.layout_card_head
                            ,parent, false);

            return new VH_Header(v);
        } else{
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.layout_card
                            ,parent, false);

            return new VH_Deal(v);
        }
    }

    /***********************************
     * Binding View Holder
     ***********************************/
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof VH_Deal) {
            if (this.dealsList != null && this.dealsList.size() >= position) {
                ((VH_Deal) holder).bindToDeal(position - 1);
            }
        } else if(holder instanceof VH_Header){
            ((VH_Header) holder).bindToHead();
        }
    }

    @Override
    public int getItemViewType(int position) {
        Log.w("Posiut", String.valueOf(position));
        if (position == 0) return 0;
        else return 1;
    }

    /***********************************
     * Getting Item Count
     ***********************************/
    @Override
    public int getItemCount() {
        return dealsList.size();
    }

    /***********************************
     * Get Array
     ***********************************/
    public ArrayList<Deal> GetArray() {
        return dealsList;
    }

    /*****************************
     * ViewHolder Header Class
     ****************************/

    class VH_Header extends RecyclerView.ViewHolder {
        private ImageView imageHead;

        /****************************
         * Constructor
         ****************************/

        VH_Header(final View itemView) {
            super(itemView);
           imageHead = itemView.findViewById(R.id.imgHEad);
        }

        /****************************
         * bindToArticle
         ****************************/
        void bindToHead() {
            imageHead.setImageResource(R.drawable.ic_slider_bg);

        }

    }

    /*****************************
     * ViewHolder Class
     ****************************/

    class VH_Deal extends RecyclerView.ViewHolder {


        private TextView tvVendorName, tvVendorItem, tvVendorAddress, tvVendorRebate;
        RatingBar ratingVendor;
        private View tvOnlinePayment;
        private ImageView imgBg, imgLogo;


        /****************************
         * Constructor
         ****************************/

        VH_Deal(final View itemView) {
            super(itemView);
                imgBg = itemView.findViewById(R.id.imgBackground);
                imgLogo = itemView.findViewById(R.id.imgVendorLogo);
                tvVendorName = itemView.findViewById(R.id.tvVendorName);
                tvVendorItem = itemView.findViewById(R.id.tvVendorItem);
                tvOnlinePayment = itemView.findViewById(R.id.tvOnlinePayment);
                tvVendorAddress = itemView.findViewById(R.id.tvLocation);
                tvVendorRebate = itemView.findViewById(R.id.tvRebate);
                ratingVendor = itemView.findViewById(R.id.vendorRating);
        }

        /****************************
         * bindToArticle
         ****************************/
        void bindToDeal(final int position) {

            final Deal deal = dealsList.get(position);

            //Logo and Image could be managed with Glide or such image loading libraries, from resources or server
            imgBg.setImageResource(deal.getVendorImgUrl().equals("mc_bg.png") ? R.drawable.ic_sample_mc : R.drawable.ic_sample_dominoz);
            imgLogo.setImageResource(deal.getVendorLogoUrl().equals("mc_logo.png") ? R.drawable.ic_logo_mc : R.drawable.ic_logo_dom);

            tvVendorName.setText(deal.getVendorName());
            tvVendorItem.setText(deal.getVendorItem());
            tvVendorAddress.setText(deal.getVendorAddress());
            tvVendorRebate.setText(Html.fromHtml(String.valueOf(deal.getVendorRebate()) + "% <small> Off</small>"));
            ratingVendor.setRating(deal.getVendorRating());
            tvOnlinePayment.setVisibility(deal.isOnlinePaymentAvailable() ? View.VISIBLE : View.GONE);

        }

    }
}

