package com.example.hotelproject;

import android.content.Context;
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
import com.example.hotelproject.data.NaviList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnMenuSelectListener} interface
 * to handle interaction events.
 */
public class NaviFragment extends Fragment {

    OnMenuSelectListener mListener;

    public interface OnMenuSelectListener {
        // TODO: Update argument type and name
        void onMenuSelected(int menuId);
    }

    RecyclerView listview;
    NaviAdapter mAdapter;


    public static final int COLUMNS_NOTICE=0;
    public static final int COLUMNS_EVENT=100;
    public static final int COLUMNS_FRIEND=200;
    public static final int COLUMNS_MORE=300;

    private void initData(){
        NaviData data = new NaviData();
        data.username="이정현";
        data.point = 100;
        data.reservation =2;

        NaviList list = new NaviList();
        list.menuId =COLUMNS_NOTICE ;
        list.listName ="호텔타임 소식";
        data.list.add(list);

        list = new NaviList();
        list.menuId =COLUMNS_EVENT ;
        list.listName ="진행중인 이벤트";
        data.list.add(list);

        list = new NaviList();
        list.menuId =COLUMNS_FRIEND ;
        list.listName ="친구에게 할인권 보내기";
        data.list.add(list);

        list = new NaviList();
        list.menuId =COLUMNS_MORE ;
        list.listName ="더보기";
        data.list.add(list);

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
            public void onClickNavi(View view,int position, int menuId) {
                mListener.onMenuSelected(menuId);
            }
        });

        listview.setAdapter(mAdapter);
        listview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL, false));
        initData();
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnMenuSelectListener) {
            mListener = (OnMenuSelectListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnMenuSelectListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
}
