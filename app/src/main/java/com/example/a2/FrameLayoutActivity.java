package com.example.a2;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import java.util.Timer;
import java.util.TimerTask;

public class FrameLayoutActivity extends AppCompatActivity {

    FrameLayout frame = null;
    //用于定时更新UI的handle类对象
    Handler handler = new Handler() {
        int i = 0;
        @Override
        public void handleMessage(Message msg) {
            //判断信息来源
            if(msg.what == 0) {
                i = i + 1;
                changeImage(i % 5);
            }
            super.handleMessage(msg);
        }
    };

    //切换图片的方法
    void changeImage(int i) {
        Drawable a = ContextCompat.getDrawable(this, R.mipmap.rdr2_officialart2_256x256);
        Drawable b = ContextCompat.getDrawable(this, R.mipmap.rdr2_officialart_2048x2048);
        Drawable c = ContextCompat.getDrawable(this, R.mipmap.rdr2_rdr2_256x256);
        Drawable d = ContextCompat.getDrawable(this, R.mipmap.rdr2_rdr2_3840x2160);
        Drawable e = ContextCompat.getDrawable(this, R.mipmap.rdr2_rockstar_3840x2160);
        switch(i) {
            case 0: frame.setForeground(a); break;
            case 1: frame.setForeground(b); break;
            case 2: frame.setForeground(c); break;
            case 3: frame.setForeground(d); break;
            case 4: frame.setForeground(e); break;
            //setForeground设置前景图像
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);
        //将frame变量与帧布局绑定
        frame = (FrameLayout) findViewById(R.id.frame);
        //定时器对象
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
            }
        },0,1000);//每隔10ms更换图片
    }

    public void dismiss(View view) {
        finish();
    }
}
