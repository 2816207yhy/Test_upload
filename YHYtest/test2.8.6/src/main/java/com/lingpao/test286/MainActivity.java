package com.lingpao.test286;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取该Activity里的TabHost组件
        TabHost tabHost = new TabHost(MainActivity.this);
        TabHost.TabSpec tab1 = tabHost.newTabSpec("tab01").setIndicator("已接电话").setContent(R.id.tab01);
        tabHost.addTab(tab1);
        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2").setIndicator("呼出电话", getResources().getDrawable(R.drawable.icon)).setContent(R.id.tab02);
        tabHost.addTab(tab2);
        TabHost.TabSpec tab3 = tabHost.newTabSpec("tan3").setIndicator("未接电话").setContent(R.id.tab03);


    }
}
