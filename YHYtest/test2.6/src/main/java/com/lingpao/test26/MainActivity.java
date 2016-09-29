package com.lingpao.test26;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.os.Handler;
import android.os.Message;

public class MainActivity extends AppCompatActivity {
    private int[] data = new int[100];
    int hasdata = 0;
    //记录progressbar完成进度
    int status = 0;
    ProgressBar bar1 ,bar2 ,bar3;
    //创建一个负责更新的handler


    final Handler mhandler = new Handler() {

        public void handleMessage(Message msg){
            if (msg.what == 0x111)
            {
                bar1.setProgress(status);
                bar2.setProgress(status);
                //bar3.setProgress(status);
            }
        }


    };


    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar1 =(ProgressBar)findViewById(R.id.bar1);
        bar2 =(ProgressBar)findViewById(R.id.bar2);
        //bar3 =(ProgressBar)findViewById(R.id.bar3);
        //启动线程执行程序
        new Thread()
        {
            public void run()
            {
                while (status < 100)
                {
                    // 获取耗时操作的完成百分比
                    status = dowork();
                    // 发送消息到Handler
                    Message m = new Message();
                    m.what = 0x111;
                    // 发送消息
                    mhandler.sendMessage(m);
                }
            }
        }.start();




    }
    public int dowork()
    {
        //为数组元素赋值
        data[hasdata++] = (int)(Math.random()*100);
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return hasdata;
    }
}
