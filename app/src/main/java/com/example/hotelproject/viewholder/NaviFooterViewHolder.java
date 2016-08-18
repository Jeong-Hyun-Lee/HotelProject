package com.example.hotelproject.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hotelproject.R;

/**
 * Created by 이정현 on 2016-08-17.
 */
public class NaviFooterViewHolder extends RecyclerView.ViewHolder {

    TextView service,number,content;

    public NaviFooterViewHolder(View itemView) {
        super(itemView);
        service = (TextView)itemView.findViewById(R.id.navi_footer_service);
        number = (TextView)itemView.findViewById(R.id.navi_footer_number);
        content = (TextView)itemView.findViewById(R.id.navi_footer_content);
    }

    public void setview(){
        service.setText(R.string.navi_columns_service_center);
        number.setText(R.string.navi_columns_num);
        content.setText(R.string.navi_columns_content);
    }
}
