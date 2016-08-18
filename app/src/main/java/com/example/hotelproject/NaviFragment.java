package com.example.hotelproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotelproject.adapter.NaviAdapter;
import com.example.hotelproject.data.NaviData;

/**
 * Created by 이정현 on 2016-08-16.
 */
public class NaviFragment extends Fragment {

    public interface OnMenuSelectListener {
        // TODO: Update argument type and name
        void onMenuSelected(int menuId);
    }

    RecyclerView listview;
    NaviAdapter mAdapter;


    private void initData(){
        NaviData data = new NaviData();
        data.username="이정현";
        data.point = 100;
        data.reservation =2;
        data.list.add("호텔타임 소식");
        data.list.add("진행중인 이벤트");
        data.list.add("친구에게 할인권 보내기");
        data.list.add("더보기");
        mAdapter.setData(data);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new NaviAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navi, container, false);
        listview = (RecyclerView)view.findViewById(R.id.rv_list);
        mAdapter.setOnNaviClickListener(new NaviAdapter.OnNaviClickListener() {
            @Override
            public void onClickNavi(int position) {
                startActivity(new Intent(getActivity(),NewsActivity.class));

            }
        });

        listview.setAdapter(mAdapter);
        listview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL, false));
        initData();
        return view;
    }


}
