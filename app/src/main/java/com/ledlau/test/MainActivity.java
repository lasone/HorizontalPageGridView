package com.ledlau.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ledlau.test.adapter.Myadapter;
import com.ledlau.test.indicator.CirclePageIndicator;
import com.ledlau.test.model.User;
import com.ledlau.widget.HorizontalPageGridView;
import com.ledlau.widget.HorizontalPageListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements HorizontalPageListener {

    private HorizontalPageGridView pageGridView;
    private CirclePageIndicator indicator;

    private List<User> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();


        initData();

        Myadapter myadapter = new Myadapter(this, list);

        pageGridView.setNumColumns(3)
                .setPageSize(6);
        pageGridView.setAdapter(myadapter);

        indicator.setViewPager(pageGridView.getViewPager());

        pageGridView.setListener(this);


    }

    private void initView() {
        pageGridView = (HorizontalPageGridView) findViewById(R.id.page_grid_view);
        indicator = (CirclePageIndicator) findViewById(R.id.indicator);

    }

    private void initData() {

        for (int i = 0; i < 20; i++) {
            User user = new User("测试" + i);
            list.add(user);
        }

    }

    @Override
    public void onItemClickListener(Object o, int i) {
        User user = (User) o;
        Toast.makeText(MainActivity.this, user.getName(), Toast.LENGTH_SHORT).show();
    }
}
