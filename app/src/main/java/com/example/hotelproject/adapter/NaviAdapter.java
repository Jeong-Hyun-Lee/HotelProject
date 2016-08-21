package com.example.hotelproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotelproject.R;
import com.example.hotelproject.data.NaviData;
import com.example.hotelproject.viewholder.NaviFooterViewHolder;
import com.example.hotelproject.viewholder.NaviHeaderViewHolder;
import com.example.hotelproject.viewholder.NaviListViewHolder;

/**
 * Created by 이정현 on 2016-08-17.
 */
public class NaviAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    NaviData data;

    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_LIST = 1;
    private static final int VIEW_TYPE_FOOTER = 2;

    public void setData(NaviData data) {
        if (this.data != data) {
            this.data = data;
            notifyDataSetChanged();
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return VIEW_TYPE_HEADER;
        }
        position--;
        if (data.list.size() > 0) {
            if (data.list.size() > position) {
                return VIEW_TYPE_LIST;
            }
            position -= data.list.size();
        }
        if (position == 0) {
            return VIEW_TYPE_FOOTER;
        }
        position--;

        throw new IllegalArgumentException(("Invalid position"));
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case VIEW_TYPE_HEADER: {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_navigation_first, parent, false);
                NaviHeaderViewHolder holder = new NaviHeaderViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_LIST: {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_navigation_columns, parent, false);
                NaviListViewHolder holder = new NaviListViewHolder(view);
                holder.setOnClickNaviListListener(new NaviListViewHolder.OnNaviItemClickListener() {
                    @Override
                    public void onListClick(View view, int position) {
                        mListener.onClickNavi(view,position,data.list.get(position-1).menuId);
                    }
                });
                return holder;
            }

            case VIEW_TYPE_FOOTER: {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_navigation_last, parent, false);
                NaviFooterViewHolder holder = new NaviFooterViewHolder(view);
                return holder;
            }
        }
        throw new IllegalArgumentException("invalid viewtype");
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0) {
            NaviHeaderViewHolder hvh = (NaviHeaderViewHolder) holder;
            hvh.setUserNameView(data.username,data.point,data.reservation);
            return;
        }
        position--;
        if (data.list.size() > 0) {
            if (data.list.size() > position) {
                NaviListViewHolder lvh = (NaviListViewHolder) holder;
                lvh.setColumns(data.list.get(position).listName);
                return;
            }
            position -= data.list.size();
        }
        if (position == 0) {
            NaviFooterViewHolder fvh = (NaviFooterViewHolder) holder;
            fvh.setview();
            return;
        }
        position--;

        throw new IllegalArgumentException(("Invalid position"));
    }

    @Override
    public int getItemCount() {
        if (data == null){return 0;}
        int count = 0;
        count++;
        if (data.list.size() > 0) {
            count += data.list.size();
        }
        count++;
        return count;
    }


    public interface OnNaviClickListener{
        void onClickNavi(View view,int position,int menuId);
    }

    OnNaviClickListener mListener;
    public void setOnNaviClickListener(OnNaviClickListener mListener){
        this.mListener = mListener;
    }
}
