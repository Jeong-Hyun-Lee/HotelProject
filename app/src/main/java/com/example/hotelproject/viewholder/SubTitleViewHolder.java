package com.example.hotelproject.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hotelproject.R;

/**
 * Created by 이정현 on 2016-08-21.
 */
public class SubTitleViewHolder extends RecyclerView.ViewHolder{
    TextView titleView;

    public SubTitleViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView.findViewById(R.id.sub_title_text) ;
    }

    public void setTitle(int title){
        titleView.setText(title);
    }
}
