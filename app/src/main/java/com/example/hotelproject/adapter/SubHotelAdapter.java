package com.example.hotelproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotelproject.R;
import com.example.hotelproject.data.SubData;
import com.example.hotelproject.viewholder.SubFirstViewHolder;
import com.example.hotelproject.viewholder.SubIconViewHolder;
import com.example.hotelproject.viewholder.SubLastViewHolder;
import com.example.hotelproject.viewholder.SubListViewHolder;
import com.example.hotelproject.viewholder.SubLittleTitleViewHolder;
import com.example.hotelproject.viewholder.SubMapViewHolder;
import com.example.hotelproject.viewholder.SubTitleViewHolder;

/**
 * Created by 이정현 on 2016-08-21.
 */
public class SubHotelAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    SubData data;

    public void setSubData(SubData data) {
        if (this.data != data) {
            this.data = data;
        }
        notifyDataSetChanged();
    }

    private static final int VIEW_TYPE_FIRST = 0;
    private static final int VIEW_TYPE_REASON_TITLE = 1;
    private static final int VIEW_TYPE_REASON_LIST = 2;
    private static final int VIEW_TYPE_MAP = 3;
    private static final int VIEW_TYPE_ICON_TITLE = 4;
    private static final int VIEW_TYPE_ICON = 5;
    private static final int VIEW_TYPE_BASIC_TITLE = 6;
    private static final int VIEW_TYPE_BASIC_LIST = 7;
    private static final int VIEW_TYPE_BENEFITS_TITLE = 8;
    private static final int VIEW_TYPE_BENEFITS_LIST = 9;
    private static final int VIEW_TYPE_FACILITY_TITLE = 10;
    private static final int VIEW_TYPE_FACILITY_LIST = 11;
    private static final int VIEW_TYPE_INFO_TITLE = 12;
    private static final int VIEW_TYPE_INFO_LIST = 13;
    private static final int VIEW_TYPE_BREAKFAST_TITLE = 14;
    private static final int VIEW_TYPE_BREAKFAST_LIST = 15;
    private static final int VIEW_TYPE_CANCEL_TITLE = 16;
    private static final int VIEW_TYPE_CANCEL_LIST = 17;
    private static final int VIEW_TYPE_CONFIRM_TITLE = 18;
    private static final int VIEW_TYPE_CONFIRM_LIST = 19;
    private static final int VIEW_TYPE_LAST = 20;


    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return VIEW_TYPE_FIRST;
        }
        position--;
        if (data.recommReason.size() > 0) {
            if (position == 0) {
                return VIEW_TYPE_REASON_TITLE;
            }
            position--;
            if (position < data.recommReason.size()) {
                return VIEW_TYPE_REASON_LIST;
            }
            position -= data.recommReason.size();
        }
        if (position == 0) {
            return VIEW_TYPE_MAP;
        }
        position--;
        if (position == 0) {
            return VIEW_TYPE_ICON_TITLE;
        }
        position--;
        if (position == 0) {
            return VIEW_TYPE_ICON;
        }
        position--;
        if (data.basic.size() > 0) {
            if (position == 0) {
                return VIEW_TYPE_BASIC_TITLE;
            }
            position--;
            if (position < data.basic.size()) {
                return VIEW_TYPE_BASIC_LIST;
            }
            position -= data.basic.size();
        }
        if (data.benefits.size() > 0) {
            if (position == 0) {
                return VIEW_TYPE_BENEFITS_TITLE;
            }
            position--;
            if (position < data.benefits.size()) {
                return VIEW_TYPE_BENEFITS_LIST;
            }
            position -= data.benefits.size();
        }
        if (data.facility.size() > 0) {
            if (position == 0) {
                return VIEW_TYPE_FACILITY_TITLE;
            }
            position--;
            if (position < data.facility.size()) {
                return VIEW_TYPE_FACILITY_LIST;
            }
            position -= data.facility.size();
        }
        if (data.info.size() > 0) {
            if (position == 0) {
                return VIEW_TYPE_INFO_TITLE;
            }
            position--;
            if (position < data.info.size()) {
                return VIEW_TYPE_INFO_LIST;
            }
            position -= data.info.size();
        }
        if (data.breakfast.size() > 0) {
            if (position == 0) {
                return VIEW_TYPE_BREAKFAST_TITLE;
            }
            position--;
            if (position < data.breakfast.size()) {
                return VIEW_TYPE_BREAKFAST_LIST;
            }
            position -= data.breakfast.size();
        }
        if (data.cancel.size() > 0) {
            if (position == 0) {
                return VIEW_TYPE_CANCEL_TITLE;
            }
            position--;
            if (position < data.cancel.size()) {
                return VIEW_TYPE_CANCEL_LIST;
            }
            position -= data.cancel.size();
        }
        if (data.confirm.size() > 0) {
            if (position == 0) {
                return VIEW_TYPE_CONFIRM_TITLE;
            }
            position--;
            if (position < data.confirm.size()) {
                return VIEW_TYPE_CONFIRM_LIST;
            }
            position -= data.confirm.size();
        }
        if (position == 0) {
            return VIEW_TYPE_LAST;
        }
        position--;


        throw new IllegalArgumentException(("Invalid position"));
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case VIEW_TYPE_FIRST:
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_first,parent,false);
                SubFirstViewHolder holder = new SubFirstViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_REASON_TITLE:
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_title,parent,false);
                SubTitleViewHolder holder = new SubTitleViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_REASON_LIST:
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_list,parent,false);
                SubListViewHolder holder = new SubListViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_MAP :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_map,parent,false);
                SubMapViewHolder holder = new SubMapViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_ICON_TITLE :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_title,parent,false);
                SubTitleViewHolder holder = new SubTitleViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_ICON :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_icon,parent,false);
                SubIconViewHolder holder = new SubIconViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_BASIC_TITLE :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_title_little,parent,false);
                SubLittleTitleViewHolder holder = new SubLittleTitleViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_BASIC_LIST :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_list,parent,false);
                SubListViewHolder holder = new SubListViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_BENEFITS_TITLE :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_title_little,parent,false);
                SubLittleTitleViewHolder holder = new SubLittleTitleViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_BENEFITS_LIST :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_list,parent,false);
                SubListViewHolder holder = new SubListViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_FACILITY_TITLE :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_title_little,parent,false);
                SubLittleTitleViewHolder holder = new SubLittleTitleViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_FACILITY_LIST :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_list,parent,false);
                SubListViewHolder holder = new SubListViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_INFO_TITLE :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_title_little,parent,false);
                SubLittleTitleViewHolder holder = new SubLittleTitleViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_INFO_LIST :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_list,parent,false);
                SubListViewHolder holder = new SubListViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_BREAKFAST_TITLE :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_title_little,parent,false);
                SubLittleTitleViewHolder holder = new SubLittleTitleViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_BREAKFAST_LIST :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_list,parent,false);
                SubListViewHolder holder = new SubListViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_CANCEL_TITLE :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_title_little,parent,false);
                SubLittleTitleViewHolder holder = new SubLittleTitleViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_CANCEL_LIST :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_list,parent,false);
                SubListViewHolder holder = new SubListViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_CONFIRM_TITLE :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_title_little,parent,false);
                SubLittleTitleViewHolder holder = new SubLittleTitleViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_CONFIRM_LIST :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_list,parent,false);
                SubListViewHolder holder = new SubListViewHolder(view);
                return holder;
            }
            case VIEW_TYPE_LAST :
            {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sub_last,parent,false);
                SubLastViewHolder holder = new SubLastViewHolder(view);
                return holder;
            }
        }
        throw new IllegalArgumentException("invalid viewtype");
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0) {
            SubFirstViewHolder sfvh = (SubFirstViewHolder) holder;
            sfvh.setHotelSubInfo(data.hotelName,data.hotelKind, data.startDate, data.deadline, data.personnel, data.priceBefore,data.price);
            return ;
        }
        position--;
        if (data.recommReason.size() > 0) {
            if (position == 0) {
                SubTitleViewHolder stvh = (SubTitleViewHolder) holder;
                stvh.setTitle(R.string.sub_recomm_title);
                return ;
            }
            position--;
            if (position < data.recommReason.size()) {
                SubListViewHolder slvh = (SubListViewHolder) holder;
                slvh.setListText(data.recommReason.get(position));
                return ;
            }
            position -= data.recommReason.size();
        }
        if (position == 0) {
            SubMapViewHolder smvh = (SubMapViewHolder) holder;
            smvh.setAddressView(data.address);
            return ;
        }
        position--;
        if (position == 0) {
            SubTitleViewHolder stvh = (SubTitleViewHolder) holder;
            stvh.setTitle(R.string.sub_icon_title);
            return ;
        }
        position--;
        if (position == 0) {
            SubIconViewHolder sivh = (SubIconViewHolder) holder;
            sivh.setIconView();
            return ;
        }
        position--;
        if (data.basic.size() > 0) {
            if (position == 0) {
                SubLittleTitleViewHolder stvh = (SubLittleTitleViewHolder) holder;
                stvh.setTitle(R.string.sub_basic_title);
                return ;
            }
            position--;
            if (position < data.basic.size()) {
                SubListViewHolder slvh = (SubListViewHolder) holder;
                slvh.setListText(data.basic.get(position));
                return ;
            }
            position -= data.basic.size();
        }
        if (data.benefits.size() > 0) {
            if (position == 0) {
                SubLittleTitleViewHolder stvh = (SubLittleTitleViewHolder) holder;
                stvh.setTitle(R.string.sub_benefits_title);
                return ;
            }
            position--;
            if (position < data.benefits.size()) {
                SubListViewHolder slvh = (SubListViewHolder) holder;
                slvh.setListText(data.benefits.get(position));
                return ;
            }
            position -= data.benefits.size();
        }
        if (data.facility.size() > 0) {
            if (position == 0) {
                SubLittleTitleViewHolder stvh = (SubLittleTitleViewHolder) holder;
                stvh.setTitle(R.string.sub_facility_title);
                return ;
            }
            position--;
            if (position < data.facility.size()) {
                SubListViewHolder slvh = (SubListViewHolder) holder;
                slvh.setListText(data.facility.get(position));
                return ;
            }
            position -= data.facility.size();
        }
        if (data.info.size() > 0) {
            if (position == 0) {
                SubLittleTitleViewHolder stvh = (SubLittleTitleViewHolder) holder;
                stvh.setTitle(R.string.sub_info_title);
                return ;
            }
            position--;
            if (position < data.info.size()) {
                SubListViewHolder slvh = (SubListViewHolder) holder;
                slvh.setListText(data.info.get(position));
                return ;
            }
            position -= data.info.size();
        }
        if (data.breakfast.size() > 0) {
            if (position == 0) {
                SubLittleTitleViewHolder stvh = (SubLittleTitleViewHolder) holder;
                stvh.setTitle(R.string.sub_breakfast_title);
                return ;
            }
            position--;
            if (position < data.breakfast.size()) {
                SubListViewHolder slvh = (SubListViewHolder) holder;
                slvh.setListText(data.breakfast.get(position));
                return ;
            }
            position -= data.breakfast.size();
        }
        if (data.cancel.size() > 0) {
            if (position == 0) {
                SubLittleTitleViewHolder stvh = (SubLittleTitleViewHolder) holder;
                stvh.setTitle(R.string.sub_cancel_title);
                return ;
            }
            position--;
            if (position < data.cancel.size()) {
                SubListViewHolder slvh = (SubListViewHolder) holder;
                slvh.setListText(data.cancel.get(position));
                return ;
            }
            position -= data.cancel.size();
        }
        if (data.confirm.size() > 0) {
            if (position == 0) {
                SubLittleTitleViewHolder stvh = (SubLittleTitleViewHolder) holder;
                stvh.setTitle(R.string.sub_confirm_title);
                return ;
            }
            position--;
            if (position < data.confirm.size()) {
                SubListViewHolder slvh = (SubListViewHolder) holder;
                slvh.setListText(data.confirm.get(position));
                return ;
            }
            position -= data.confirm.size();
        }
        if (position == 0) {
            SubLastViewHolder slvh = (SubLastViewHolder) holder;
            slvh.setLastView(data.price);
            return ;
        }
        position--;

        throw new IllegalArgumentException(("Invalid position"));
    }

    @Override
    public int getItemCount() {
        if (data == null) return 0;
        int count = 0;
        count++;
        if (data.recommReason.size() > 0) {
            count += (1 + data.recommReason.size());
        }
        count += 3;
        if (data.basic.size() > 0) {
            count += data.basic.size();
        }
        if (data.benefits.size() > 0) {
            count += data.benefits.size();
        }
        if (data.facility.size() > 0) {
            count += data.facility.size();
        }
        if (data.info.size() > 0) {
            count += data.info.size();
        }
        if (data.breakfast.size() > 0) {
            count += data.breakfast.size();
        }
        if (data.cancel.size() > 0) {
            count += data.cancel.size();
        }
        if (data.confirm.size() > 0) {
            count += data.confirm.size();
        }
        count++;

        return count;
    }
}
