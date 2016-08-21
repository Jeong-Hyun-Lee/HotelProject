package com.example.hotelproject.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hotelproject.R;

/**
 * Created by 이정현 on 2016-08-21.
 */
public class SubMapViewHolder extends RecyclerView.ViewHolder {
    TextView addressView;

    public SubMapViewHolder(View itemView) {
        super(itemView);
        addressView = (TextView)itemView.findViewById(R.id.sub_map_text) ;
    }

    public void setAddressView(String address){
        addressView.setText(address);
    }
}
