package com.example.hotelproject.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hotelproject.R;

/**
 * Created by 이정현 on 2016-08-21.
 */
public class SubListViewHolder extends RecyclerView.ViewHolder {
    TextView listTextView;
    public SubListViewHolder(View itemView) {
        super(itemView);
        listTextView = (TextView)itemView.findViewById(R.id.sub_list_text);
    }

    public void setListText(String listText){
        listTextView.setText(listText);
    }
}
