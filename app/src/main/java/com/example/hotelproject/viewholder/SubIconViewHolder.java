package com.example.hotelproject.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hotelproject.R;

/**
 * Created by 이정현 on 2016-08-21.
 */
public class SubIconViewHolder extends RecyclerView.ViewHolder {

    ImageView firstImageView, secondImageView, thirdImageView, fourthImageView, otherImageView;
    TextView firstTextView, secondTextView, thirdTextView, fourthTextView;

    public SubIconViewHolder(View itemView) {
        super(itemView);
        firstImageView = (ImageView)itemView.findViewById(R.id.sub_icon_first);
        firstTextView = (TextView)itemView.findViewById(R.id.sub_icon_first_text);
        secondImageView = (ImageView)itemView.findViewById(R.id.sub_icon_second);
        secondTextView = (TextView)itemView.findViewById(R.id.sub_icon_second_text);
        thirdImageView = (ImageView)itemView.findViewById(R.id.sub_icon_third);
        thirdTextView = (TextView)itemView.findViewById(R.id.sub_icon_third_text);
        fourthImageView = (ImageView)itemView.findViewById(R.id.sub_icon_fourtn);
        fourthTextView = (TextView)itemView.findViewById(R.id.sub_icon_fourtn_text);
        otherImageView = (ImageView)itemView.findViewById(R.id.sub_icon_other);
    }

    public void setIconView(){
        firstImageView.setImageResource(R.drawable.ic_smoke_free_black_24dp);
        firstTextView.setText(R.string.no_smoking);
        secondImageView.setImageResource(R.drawable.ic_golf_course_black_24dp);
        secondTextView.setText(R.string.golf_zone);
        thirdImageView.setImageResource(R.drawable.ic_free_breakfast_black_24dp);
        thirdTextView.setText(R.string.cafe);
        fourthImageView.setImageResource(R.drawable.ic_fitness_center_black_24dp);
        fourthTextView.setText(R.string.fitness_center);
        otherImageView.setImageResource(R.drawable.ic_exposure_plus_2_black_24dp);
    }
}
