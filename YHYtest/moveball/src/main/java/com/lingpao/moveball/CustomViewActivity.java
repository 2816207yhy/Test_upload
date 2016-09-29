package com.lingpao.moveball;


import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

class CustomActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        LinearLayout root=(LinearLayout)findViewById(R.id.root);
        final DrawView draw=new DrawView(this);
        draw.setMinimumWidth(300);
        draw.setMinimumHeight(500);
        root.addView(draw);
    }

}