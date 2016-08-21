package com.example.hotelproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.hotelproject.adapter.HotelAdapter;
import com.example.hotelproject.data.Gyeongju;
import com.example.hotelproject.data.HotelData;
import com.example.hotelproject.data.Seoul;

public class MainActivity extends AppCompatActivity implements NaviFragment.OnMenuSelectListener,HotelAdapter.OnClickListColumnsListener {

    RecyclerView listView;
    HotelAdapter mAdapter;
    TabLayout tabs;
    String statename;
    DrawerLayout drawer;
    SwipeRefreshLayout refreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        getSupportActionBar().setTitle(null);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btn_fab);

        mAdapter = new HotelAdapter();
        mAdapter.setOnClickColumnsListener(this);

        listView = (RecyclerView) findViewById(R.id.rv_list);
        listView.setAdapter(mAdapter);
        listView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        tabs.addTab(tabs.newTab().setText("종로구").setTag("tab1"));
        tabs.addTab(tabs.newTab().setText("오늘(수)").setTag("tab2"));
        refreshLayout = (SwipeRefreshLayout)findViewById(R.id.relativeLayout) ;
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refreshLayout.setRefreshing(false);
                    }
                }, 1000);
            }
        });
        refreshLayout.setColorSchemeColors(Color.BLACK);
        refreshLayout.setProgressBackgroundColorSchemeColor(Color.rgb(67,73,88));

        initData();
    }

    Handler handler = new Handler(Looper.getMainLooper());


    private void initData() {
        HotelData data = new HotelData();
        Seoul seoul = new Seoul();
        seoul.hotelKind = 0;
        seoul.stateName = "종로구";
        seoul.hotelImage = ContextCompat.getDrawable(this,R.drawable.hotel1);
        seoul.name = "호텔 더 디자이너스 종로";
        seoul.price = "57,200원";
        seoul.time = "종로3가역 도보 6분";
        seoul.remainRoom = "남은 객실 1";
        data.seouls.add(seoul);

        seoul = new Seoul();
        seoul.hotelKind = 2;
        seoul.stateName = "종로구";
        seoul.hotelImage = ContextCompat.getDrawable(this,R.drawable.hotel2);
        seoul.name = "베뉴지호텔";
        seoul.price = "38,500원";
        seoul.time = "종로3가역 도보 3분";
        seoul.remainRoom = "남은 객실 2";
        data.seouls.add(seoul);

        seoul = new Seoul();
        seoul.hotelKind = 1;
        seoul.stateName = "종로구";
        seoul.hotelImage = ContextCompat.getDrawable(this,R.drawable.hotel3);
        seoul.name = "베니키아 리치 다이아몬드";
        seoul.price = "48,500원";
        seoul.time = "종로3가역 도보 10분";
        seoul.remainRoom = "남은 객실 6";
        data.seouls.add(seoul);

        Gyeongju gyeongju = new Gyeongju();
        gyeongju.hotelKind = 0;
        gyeongju.stateName = "경주시";
        gyeongju.hotelImage = ContextCompat.getDrawable(this,R.drawable.hotel4);
        gyeongju.name = "경주 코모도호텔";
        gyeongju.price = "109,800원";
        gyeongju.time = "경주보문관광단지 내";
        gyeongju.remainRoom = "남은 객실 2";
        data.gyeongjus.add(gyeongju);

        gyeongju = new Gyeongju();
        gyeongju.hotelKind = 1;
        gyeongju.stateName = "경주시";
        gyeongju.hotelImage = ContextCompat.getDrawable(this,R.drawable.hotel5);
        gyeongju.name = "성호 이스트힐 리조트";
        gyeongju.price = "74,100원";
        gyeongju.time = "불국사역 부근";
        gyeongju.remainRoom = "남은 객실 0";
        data.gyeongjus.add(gyeongju);

        mAdapter.setData(data);
        statename = data.seouls.get(0).stateName;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                drawer.openDrawer(GravityCompat.START);
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onMenuSelected(int menuId) {
        switch (menuId){
            case NaviFragment.COLUMNS_NOTICE:{
                Intent i = new Intent(this,NewsActivity.class);
                startActivity(i);
                break;
            }
            case NaviFragment.COLUMNS_EVENT:
                break;
            case NaviFragment.COLUMNS_FRIEND:
                break;
            case NaviFragment.COLUMNS_MORE:
                break;
            default:
                return;
        }
//        drawer.closeDrawer(GravityCompat.START);
    }

    @Override
    public void onClickColumnsListener(int position) {
        Intent intent = new Intent(this, SubHotelActivity.class);
        startActivity(intent);
    }
}
