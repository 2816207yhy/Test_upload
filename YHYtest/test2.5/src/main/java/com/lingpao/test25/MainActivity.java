package com.lingpao.test25;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends Activity {
    private String[] name = new String[]{
      "虎头","弄玉","李清照","李白"
    };
    private String[] descs = new String[]{
            "一个小孩","一个女孩","女词人","男诗人"
    };
    private int[] imageIds = new int[]{
            R.drawable.a00,R.drawable.a04, R.drawable.a08, R.drawable.a14
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //创建一个list集合，LIst集合元素为Map
        List<Map<String,Object>> listItems = new ArrayList<Map<String,Object>>();
        for (int i = 0;i<name.length; i++)
        {
            Map<String,Object> listItem= new HashMap<String, Object>();
            listItem.put("header",imageIds[i]);
            listItem.put("personName",name[i]);
            listItem.put("desc",descs[i]);
            listItems.add(listItem);
        }
        //创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,listItems,
                R.layout.simple_item,new String[]{"personName","header","desc"},
                new int[]{R.id.name, R.id.header, R.id.desc});
        ListView list = (ListView)findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);
    }
}
