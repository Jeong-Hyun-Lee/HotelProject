package com.example.hotelproject.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hotelproject.R;

/**
 * Created by 이정현 on 2016-08-17.
 */
public class NaviHeaderViewHolder extends RecyclerView.ViewHolder {

    TextView userNameView,pointView,salesView;

    public NaviHeaderViewHolder(View itemView) {
        super(itemView);
        userNameView = (TextView)itemView.findViewById(R.id.user_id);
        pointView = (TextView)itemView.findViewById(R.id.point_text);
        salesView = (TextView)itemView.findViewById(R.id.reservation_text);
    }

    public void setUserNameView(String user,int point, int sales){
        userNameView.setText(user);
        if (point == 0){
            pointView.setText("-");
        }
        if (sales ==0){
            salesView.setText("-");
        }
        pointView.setText(""+point);
        salesView.setText(""+sales);

    }
}
