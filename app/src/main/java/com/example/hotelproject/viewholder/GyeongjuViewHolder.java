package com.example.hotelproject.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hotelproject.R;
import com.example.hotelproject.data.Gyeongju;

/**
 * Created by 이정현 on 2016-08-15.
 */
public class GyeongjuViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView kindView,nameView,timeView,locationView,priceView,remainRoomView;

    public GyeongjuViewHolder(View itemView) {
        super(itemView);
        kindView = (TextView)itemView.findViewById(R.id.hotel_kind);
        imageView = (ImageView) itemView.findViewById(R.id.hotel_img);
        nameView = (TextView) itemView.findViewById(R.id.hotel_name);
        timeView = (TextView) itemView.findViewById(R.id.hetel_time);
        locationView = (TextView) itemView.findViewById(R.id.hetel_location);
        priceView = (TextView) itemView.findViewById(R.id.hetel_price);
        remainRoomView = (TextView) itemView.findViewById(R.id.hotel_remain);
    }
    Gyeongju gyeongju;

    public void setGyeongju(Gyeongju gyeongju){
        this.gyeongju = gyeongju;
        if (gyeongju.hotelKind == 0){
            kindView.setText("특급");
            kindView.setBackgroundResource(R.drawable.text_bg_kind_special);
        }else if (gyeongju.hotelKind == 1){
            kindView.setText("럭셔리");
            kindView.setBackgroundResource(R.drawable.text_bg_kind_luxury);
        }else{
            kindView.setText("1급");
        }

        imageView.setImageDrawable(gyeongju.hotelImage);
        nameView.setText(gyeongju.name);
        timeView.setText(gyeongju.time);
        locationView.setText(gyeongju.stateName);
        priceView.setText(gyeongju.price);
        remainRoomView.setText(gyeongju.remainRoom);
    }
}
