package com.example.hotelproject.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hotelproject.R;

/**
 * Created by 이정현 on 2016-08-15.
 */
public class TitleViewHolder extends RecyclerView.ViewHolder{

    TextView stateView;

    public TitleViewHolder(View itemView) {
        super(itemView);
        stateView = (TextView) itemView.findViewById(R.id.state_title);
    }

    public void setStateView(String state){
        stateView.setText(state);
    }
}
