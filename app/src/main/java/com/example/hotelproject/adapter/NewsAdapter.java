package com.example.hotelproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hotelproject.R;
import com.example.hotelproject.data.NewsGroup;

/**
 * Created by 이정현 on 2016-08-18.
 */
public class NewsAdapter extends BaseExpandableListAdapter {

    NewsGroup[] items;

    public NewsAdapter(NewsGroup[] items){
        this.items = items;
    }

    @Override
    public int getGroupCount() {
        return items.length;
    }

    @Override
    public int getChildrenCount(int i) {
        return 1;
    }

    @Override
    public Object getGroup(int i) {
        return items[i];
    }

    @Override
    public Object getChild(int i, int i1) {
        return items[i].childContent;
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean expanded, View convertView, ViewGroup parent) {
        RelativeLayout rv;
        if (convertView == null) {
            rv = (RelativeLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.view_news_group, parent, false);
        } else {
            rv = (RelativeLayout) convertView;
        }
        TextView tv = (TextView) rv.findViewById(R.id.text_news_group);
        tv.setText(items[groupPosition].groupName);
        return rv;
    }

    @Override
    public View getChildView(int groupPosition, int i1, boolean expanded, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView == null) {
            tv = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.view_news_child, parent, false);
        } else {
            tv = (TextView)convertView;
        }
        tv.setText(items[groupPosition].childContent);
        return tv;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
