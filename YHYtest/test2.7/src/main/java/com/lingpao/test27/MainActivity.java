package com.lingpao.test27;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ViewSwitcher;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final int NUMBER_PER_SCREEN = 12;
    public static class DataItem{
        public String dataName;
        public Drawable drawable;
    }
    //保存系统所有应用程序的合集
    private ArrayList<DataItem> items = new ArrayList<DataItem>();
    //记录当前正在显示第几屏的程序
    private int screenNo = -1;
    //保存程序所占的总屏数
    private int screenCount;
    ViewSwitcher switcher;
    //创建LayoutInflater对象
    LayoutInflater inflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        for (int i = 0; i<40 ; i++)
        {
            String label = ""+i;
            Drawable drawable = getResources().getDrawable(R.drawable.a00);
            DataItem item = new DataItem();
            item.dataName = label;
            item.drawable = drawable;
            items.add(item);
        }
        screenCount = items.size()%NUMBER_PER_SCREEN == 0?
                items.size()/NUMBER_PER_SCREEN:
                items.size()/NUMBER_PER_SCREEN + 1;
        switcher =(ViewSwitcher)findViewById(R.id.ViewSwitcher);
        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return inflater.inflate(R.layout.)
            }
        });
    }
}
