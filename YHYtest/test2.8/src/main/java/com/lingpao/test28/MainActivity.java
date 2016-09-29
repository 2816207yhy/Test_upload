package com.lingpao.test28;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        DatePicker datePicker = (DatePicker)findViewById(R.id.datePicker);
        TimePicker timePicker = (TimePicker)findViewById(R.id.timePicker);
        //获取当年的年月日、小时、分钟
        Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        hour = c.get(Calendar.HOUR_OF_DAY);
                minute = c.get(Calendar.MINUTE);
                //初始化datepicker组件，初始化指定监听器
                datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        MainActivity.this.year = year;
                        MainActivity.this.month = monthOfYear;
                        MainActivity.this.day = dayOfMonth;
                        //显示当前日期&时间
                        showDate(year,monthOfYear,dayOfMonth,hour,minute);


            }


        });
    }
    private void showDate(int year, int month, int day, int hour, int minute){
        EditText show = (EditText)findViewById(R.id.show);
        show.setText("您的购买日期为："+year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分");
    }
}
