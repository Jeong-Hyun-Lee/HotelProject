package com.example.hotelproject.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hotelproject.R;
import com.example.hotelproject.data.Seoul;

/**
 * Created by 이정현 on 2016-08-15.
 */
public class SeoulViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView kindView,nameView,timeView,locationView,priceView,remainRoomView;

    public SeoulViewHolder(View itemView) {
        super(itemView);
        kindView = (TextView) itemView.findViewById(R.id.hetel_kind);
        imageView = (ImageView) itemView.findViewById(R.id.hotel_img);
        nameView = (TextView) itemView.findViewById(R.id.hotel_name);
        timeView = (TextView) itemView.findViewById(R.id.hetel_time);
        locationView = (TextView) itemView.findViewById(R.id.hetel_location);
        priceView = (TextView) itemView.findViewById(R.id.hetel_price);
        remainRoomView = (TextView) itemView.findViewById(R.id.hotel_remain);
    }
    Seoul seoul;
    public void setSeoul(Seoul seoul){
        this.seoul = seoul;
        if (seoul.hotelKind == 0){
            kindView.setText("특급");
            kindView.setBackgroundResource(R.drawable.kind_special);
        }else if (seoul.hotelKind == 1){
            kindView.setText("럭셔리");
            kindView.setBackgroundResource(R.drawable.kind_luxury);
        }else{
            kindView.setText("1급");
        }
        imageView.setImageDrawable(seoul.hotelImage);
        nameView.setText(seoul.name);
        timeView.setText(seoul.time);
        locationView.setText(seoul.stateName);
        priceView.setText(seoul.price);
        remainRoomView.setText(seoul.remainRoom);
    }
}
