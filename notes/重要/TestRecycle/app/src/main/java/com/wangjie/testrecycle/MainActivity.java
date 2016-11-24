package com.wangjie.testrecycle;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import org.xutils.x;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Handler handler = new Handler();
    private ArrayList<String> url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        x.Ext.init(getApplication());
        x.Ext.setDebug(true);

        setContentView(R.layout.activity_main);
        x.view().inject(this);
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);



        String imageUrl [] = {
                "http://up.boohee.cn/house/u/one/intro_story/yoyo.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/queen.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/astro_girl.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/little_seven.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/jet_shen.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/ice_beauty.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/candy.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/rabbit.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/immortal_lee.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/moon_night.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/cat.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/smarting.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/levin007.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/crazy_tao.jpg",
                "http://up.boohee.cn/house/u/one/intro_story/binbin.jpg",
        };
        url=new ArrayList<>();
        for (int i = 0; i <imageUrl.length ; i++) {
            url.add(imageUrl[i]);
        }

        //设置layoutManager
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        //设置adapter
        RecyleAdapter adapter = new RecyleAdapter(url);

        recyclerView.setAdapter(adapter);

        //设置item之间的间隔
        SpacesItemDecoration decoration = new SpacesItemDecoration(10);
        recyclerView.addItemDecoration(decoration);
    }

}
