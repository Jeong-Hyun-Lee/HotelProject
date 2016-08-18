package com.example.hotelproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotelproject.HotelData;
import com.example.hotelproject.R;
import com.example.hotelproject.viewholder.GyeongjuViewHolder;
import com.example.hotelproject.viewholder.RemainViewHolder;
import com.example.hotelproject.viewholder.SeoulViewHolder;
import com.example.hotelproject.viewholder.TitleViewHolder;

/**
 * Created by 이정현 on 2016-08-15.
 */
public class HotelAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    HotelData data;
    private static final int VIEW_SEOUL_TITLE = 0;
    private static final int VIEW_SEOUL = 1;
    private static final int VIEW_GYEONGJU_TITLE = 2;
    private static final int VIEW_GYEONGJU = 3;
    private static final int VIEW_REMAIN = 4;

    public void setData(HotelData data){
        if (this.data != data){
            this.data = data;
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (data.seouls.size()>0){
            if (position == 0){
                return VIEW_SEOUL_TITLE;
            }
            position--;
            if (data.seouls.size() > position){
                return VIEW_SEOUL;
            }
            position -= data.seouls.size();
        }
        if (data.gyeongjus.size() > 0){
            if (position == 0) {
                return VIEW_GYEONGJU_TITLE;
            }
            position--;
            if (data.gyeongjus.size() > position){
                return VIEW_GYEONGJU;
            }
            position -= data.gyeongjus.size();
        }
        if (position ==0){
            return VIEW_REMAIN;
        }
        position--;

        throw new IllegalArgumentException(("Invalid position"));
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case VIEW_SEOUL_TITLE:{
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_title, parent,false);
                TitleViewHolder holder = new TitleViewHolder(view);
                return holder;
            }
            case VIEW_GYEONGJU_TITLE:{
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_title, parent,false);
                TitleViewHolder holder = new TitleViewHolder(view);
                return holder;
            }
            case VIEW_SEOUL:{
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_hetel,parent,false);
                SeoulViewHolder holder = new SeoulViewHolder(view);
                return holder;
            }
            case VIEW_GYEONGJU:{
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_hetel,parent,false);
                GyeongjuViewHolder holder = new GyeongjuViewHolder(view);
                return holder;
            }
            case VIEW_REMAIN:{
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_no_room,parent,false);
                RemainViewHolder holder = new RemainViewHolder(view);
                return holder;
            }
        }
        throw new IllegalArgumentException("invalid viewtype");
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (data.seouls.size()>0){
            if (position == 0){
                TitleViewHolder tvh = (TitleViewHolder) holder;
                tvh.setStateView(data.seouls.get(position).stateName);
                return;
            }
            position--;
            if (data.seouls.size() > position){
                SeoulViewHolder svh = (SeoulViewHolder) holder;
                svh.setSeoul(data.seouls.get(position));
                return;
            }
            position -= data.seouls.size();
        }
        if (data.gyeongjus.size() > 0){
            if (position == 0) {
                TitleViewHolder tvh = (TitleViewHolder) holder;
                tvh.setStateView(data.gyeongjus.get(position).stateName);
                return;
            }
            position--;
            if (data.gyeongjus.size() > position){
                GyeongjuViewHolder gvh = (GyeongjuViewHolder) holder;
                gvh.setGyeongju(data.gyeongjus.get(position));
                return;
            }
            position -=data.gyeongjus.size();
        }
        if (position == 0){
            RemainViewHolder rvh = (RemainViewHolder) holder;
            return;
        }
        position--;
        throw new IllegalArgumentException(("Invalid position"));
    }

    @Override
    public int getItemCount() {
        if (data == null)return 0;
        int count = 0;
        if (data.seouls.size()>0){
            count += (data.seouls.size()+1);
        }
        if (data.gyeongjus.size() > 0){
            count += (data.gyeongjus.size() + 1);
        }
        count++;
        return count;
    }
}
