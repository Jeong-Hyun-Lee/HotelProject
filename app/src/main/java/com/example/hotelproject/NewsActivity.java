package com.example.hotelproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import com.example.hotelproject.adapter.NewsAdapter;
import com.example.hotelproject.data.NewsGroup;

public class NewsActivity extends AppCompatActivity {

    ExpandableListView listView;
    NewsAdapter mAdapter;

    NewsGroup[] newsList = {
            new NewsGroup("[이벤트] 발렌타인데이 품격있는 하루를 선사해드립니다.","안녕하세요. 최고의 시간을 위한 선택, 호텔타임입니다.발렌타인데이 품격있는 하루를 선사해드립니다."),
            new NewsGroup("[발표] 2월 무료숙박권 당첨자 (노보텔 앰버서더 강남)","안녕하세요. 최고의 시간을 위한 선택, 호텔타임 입니다.\n\n" +
                    "고객님들과 더 친해지길 바라며 진행했던 이벤트인데요.\n" +
                    "\n그동안 소통없던 고객님과 친해지는 계기도 되고 좋았던 것 같아요!\n\n"
            +"덕분의 고객님들의 센스도 엿볼수 있었네요.\n\n\n"
            +"이벤트 참여해주신 모든 분들 감사합니다."),
            new NewsGroup("[발표] 2월 무료숙박권 당첨자","안녕하세요. 최고의 시간을 위한 선택, 호텔타임 입니다.\n\n" +
                    "고객님들과 더 친해지길 바라며 진행했던 이벤트인데요.\n" +
                    "\n그동안 소통없던 고객님과 친해지는 계기도 되고 좋았던 것 같아요!\n\n"
                    +"덕분의 고객님들의 센스도 엿볼수 있었네요.\n\n\n"
                    +"이벤트 참여해주신 모든 분들 감사합니다."),
            new NewsGroup("[발표] 2월 무료숙박권 당첨자","안녕하세요. 최고의 시간을 위한 선택, 호텔타임 입니다.\n\n" +
                    "고객님들과 더 친해지길 바라며 진행했던 이벤트인데요.\n" +
                    "\n그동안 소통없던 고객님과 친해지는 계기도 되고 좋았던 것 같아요!\n\n"
                    +"덕분의 고객님들의 센스도 엿볼수 있었네요.\n\n\n"
                    +"이벤트 참여해주신 모든 분들 감사합니다."),
            new NewsGroup("[발표] 2월 무료숙박권 당첨자","안녕하세요. 최고의 시간을 위한 선택, 호텔타임 입니다.\n\n" +
                    "고객님들과 더 친해지길 바라며 진행했던 이벤트인데요.\n" +
                    "\n그동안 소통없던 고객님과 친해지는 계기도 되고 좋았던 것 같아요!\n\n"
                    +"덕분의 고객님들의 센스도 엿볼수 있었네요.\n\n\n"
                    +"이벤트 참여해주신 모든 분들 감사합니다."),
            new NewsGroup("[발표] 2월 무료숙박권 당첨자 (노보텔 앰버서더 강남)","안녕하세요. 최고의 시간을 위한 선택, 호텔타임 입니다.\n\n" +
                    "고객님들과 더 친해지길 바라며 진행했던 이벤트인데요.\n" +
                    "\n그동안 소통없던 고객님과 친해지는 계기도 되고 좋았던 것 같아요!\n\n"
                    +"덕분의 고객님들의 센스도 엿볼수 있었네요.\n\n\n"
                    +"이벤트 참여해주신 모든 분들 감사합니다."),
            new NewsGroup("[이벤트] 발렌타인데이 품격있는 하루를 선사해드립니다.","안녕하세요. 최고의 시간을 위한 선택, 호텔타임입니다.발렌타인데이 품격있는 하루를 선사해드립니다."),
            new NewsGroup("[발표] 2월 무료숙박권 당첨자 (노보텔 앰버서더 강남)","안녕하세요. 최고의 시간을 위한 선택, 호텔타임 입니다.\n\n" +
                    "고객님들과 더 친해지길 바라며 진행했던 이벤트인데요.\n" +
                    "\n그동안 소통없던 고객님과 친해지는 계기도 되고 좋았던 것 같아요!\n\n"
                    +"덕분의 고객님들의 센스도 엿볼수 있었네요.\n\n\n"
                    +"이벤트 참여해주신 모든 분들 감사합니다."),
            new NewsGroup("[발표] 2월 무료숙박권 당첨자","안녕하세요. 최고의 시간을 위한 선택, 호텔타임 입니다.\n\n" +
                    "고객님들과 더 친해지길 바라며 진행했던 이벤트인데요.\n" +
                    "\n그동안 소통없던 고객님과 친해지는 계기도 되고 좋았던 것 같아요!\n\n"
                    +"덕분의 고객님들의 센스도 엿볼수 있었네요.\n\n\n"
                    +"이벤트 참여해주신 모든 분들 감사합니다."),
            new NewsGroup("[발표] 2월 무료숙박권 당첨자","안녕하세요. 최고의 시간을 위한 선택, 호텔타임 입니다.\n\n" +
                    "고객님들과 더 친해지길 바라며 진행했던 이벤트인데요.\n" +
                    "\n그동안 소통없던 고객님과 친해지는 계기도 되고 좋았던 것 같아요!\n\n"
                    +"덕분의 고객님들의 센스도 엿볼수 있었네요.\n\n\n"
                    +"이벤트 참여해주신 모든 분들 감사합니다."),
            new NewsGroup("[발표] 2월 무료숙박권 당첨자","안녕하세요. 최고의 시간을 위한 선택, 호텔타임 입니다.\n\n" +
                    "고객님들과 더 친해지길 바라며 진행했던 이벤트인데요.\n" +
                    "\n그동안 소통없던 고객님과 친해지는 계기도 되고 좋았던 것 같아요!\n\n"
                    +"덕분의 고객님들의 센스도 엿볼수 있었네요.\n\n\n"
                    +"이벤트 참여해주신 모든 분들 감사합니다."),
            new NewsGroup("[발표] 2월 무료숙박권 당첨자 (노보텔 앰버서더 강남)","안녕하세요. 최고의 시간을 위한 선택, 호텔타임 입니다.\n\n" +
                    "고객님들과 더 친해지길 바라며 진행했던 이벤트인데요.\n" +
                    "\n그동안 소통없던 고객님과 친해지는 계기도 되고 좋았던 것 같아요!\n\n"
                    +"덕분의 고객님들의 센스도 엿볼수 있었네요.\n\n\n"
                    +"이벤트 참여해주신 모든 분들 감사합니다.")
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_white_36dp);
        mAdapter = new NewsAdapter(newsList);
        listView = (ExpandableListView) findViewById(R.id.news_list);
        listView.setAdapter(mAdapter);
        listView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                int old = expandposition;
                expandposition = groupPosition;
                if (old != -1) {
                    listView.collapseGroup(old);
                }
            }
        });
        listView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                if (expandposition == groupPosition) {
                    expandposition = -1;
                }
            }
        });
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

    int expandposition = -1;
}
