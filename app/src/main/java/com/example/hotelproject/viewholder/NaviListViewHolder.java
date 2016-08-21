package com.example.hotelproject.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hotelproject.R;

/**
 * Created by 이정현 on 2016-08-17.
 */
public class NaviListViewHolder extends RecyclerView.ViewHolder {

    TextView columns;

    public NaviListViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null){
                   int i= getAdapterPosition();
                    mListener.onListClick(view,getAdapterPosition());
                }
            }
        });
        columns = (TextView)itemView.findViewById(R.id.navigation_columns);
    }

    public void setColumns(String c){
        columns.setText(c);
    }


    public interface OnNaviItemClickListener {
        void onListClick(View view,int position);
    }

    OnNaviItemClickListener mListener;
    public void setOnClickNaviListListener(OnNaviItemClickListener mListener){
        this.mListener = mListener;
    }
}
