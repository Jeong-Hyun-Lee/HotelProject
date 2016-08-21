package com.example.hotelproject.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hotelproject.R;

/**
 * Created by 이정현 on 2016-08-21.
 */
public class SubLastViewHolder extends RecyclerView.ViewHolder {

    TextView content;
    Button reservationBtn;
    public SubLastViewHolder(View itemView) {
        super(itemView);
        content = (TextView)itemView.findViewById(R.id.sub_last_text);
        reservationBtn = (Button)itemView.findViewById(R.id.reservation_btn) ;
    }

    public void setLastView(int price){
        content.setText(R.string.sub_bottom_content);
        reservationBtn.setText("지금 예약 | "+price+"원");
    }
}
