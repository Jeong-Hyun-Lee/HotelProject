package com.example.hotelproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.hotelproject.adapter.SubHotelAdapter;
import com.example.hotelproject.data.SubData;

public class SubHotelActivity extends AppCompatActivity {

    RecyclerView listview;
    SubHotelAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_hotel);
        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));


        listview = (RecyclerView)findViewById(R.id.rv_list);
        mAdapter = new SubHotelAdapter();
        listview.setAdapter(mAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        linearLayoutManager.setAutoMeasureEnabled(true);
        listview.setLayoutManager(linearLayoutManager);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_36dp);

        initData();
    }

    private void initData() {
        SubData data = new SubData();
        data.hotelName = getResources().getString(R.string.input_name);
        data.hotelKind = 0;
        data.startDate = 12;
        data.deadline = 15;
        data.personnel = 3;
        data.priceBefore = 255000;
        data.price = 96900;

        data.recommReason.add(getResources().getString(R.string.input_recomm_content));
        data.recommReason.add(getResources().getString(R.string.input_recomm_content2));
        data.address = getResources().getString(R.string.input_address);
        data.basic.add(getResources().getString(R.string.input_list_content));
        data.basic.add(getResources().getString(R.string.input_list_content2));
        data.basic.add(getResources().getString(R.string.input_list_content3));
        data.basic.add(getResources().getString(R.string.input_list_content4));
        data.basic.add(getResources().getString(R.string.input_list_content5));

        data.benefits.add(getResources().getString(R.string.input_list_content6));

        data.facility.add(getResources().getString(R.string.input_list_content7));

        data.info.add(getResources().getString(R.string.input_list_content8));

        data.breakfast.add(getResources().getString(R.string.input_list_content9));
        data.breakfast.add(getResources().getString(R.string.input_list_content10));

        data.cancel.add(getResources().getString(R.string.input_list_content11));
        data.cancel.add(getResources().getString(R.string.input_list_content12));

        data.confirm.add(getResources().getString(R.string.input_list_content13));
        data.confirm.add(getResources().getString(R.string.input_list_content14));
        data.confirm.add(getResources().getString(R.string.input_list_content15));
        data.confirm.add(getResources().getString(R.string.input_list_content16));
        data.confirm.add(getResources().getString(R.string.input_list_content17));

        mAdapter.setSubData(data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_sub,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            Intent intent = new Intent(this,MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
