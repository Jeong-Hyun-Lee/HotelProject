package com.example.hotelproject.viewholder;

import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hotelproject.R;

/**
 * Created by 이정현 on 2016-08-21.
 */
public class SubFirstViewHolder extends RecyclerView.ViewHolder {

    TextView hotelKindView, hotelNameView, personnelView, personnelMaxView, priceBeforeView, priceView;
    Button dateBtn;
    public SubFirstViewHolder(View itemView) {
        super(itemView);
        hotelKindView = (TextView)itemView.findViewById(R.id.hotel_kind);
        hotelNameView = (TextView)itemView.findViewById(R.id.sub_hotel_name);
        dateBtn = (Button)itemView.findViewById(R.id.sub_date_btn);
        personnelView = (TextView)itemView.findViewById(R.id.personnel);
        personnelMaxView = (TextView)itemView.findViewById(R.id.personnel_max);
        priceBeforeView = (TextView)itemView.findViewById(R.id.price_before);
        priceView = (TextView)itemView.findViewById(R.id.sub_price);
    }

    public void setHotelSubInfo(String name, int kind, int startDate, int deadline, int personnel, int priceBefore, int price){

        if (kind == 0){
            hotelKindView.setText("특급");
            hotelKindView.setBackgroundResource(R.drawable.text_bg_kind_special);
        }else if (kind == 1){
            hotelKindView.setText("럭셔리");
            hotelKindView.setBackgroundResource(R.drawable.text_bg_kind_luxury);
        }else if(kind == 2){
            hotelKindView.setText("1급");
        }

        hotelNameView.setText(name);
        dateBtn.setText(startDate+"-"+deadline);
        personnelView.setText(personnel+"인 기준");
        personnelMaxView.setText("최대 "+personnel+"인");
        priceBeforeView.setText(priceBefore+"원");
        priceBeforeView.setPaintFlags(priceBeforeView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        priceView.setText(price+"원");
    }



}
