package com.lingpao.yhytest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginbutton;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        1.初始化所需要的控件，那么如何初始化一个空间
        2.设置Button监听器，通过监听器实现我们点击Button要操作的事情
         */
        loginbutton = (Button)findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(new OnClickListener() {
            @SuppressWarnings("ResourceType")
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"loginbutton要执行的逻辑：",0).show();
            }
        });
    }
}
