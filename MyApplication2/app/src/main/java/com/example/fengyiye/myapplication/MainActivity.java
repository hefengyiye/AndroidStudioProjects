package com.example.fengyiye.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private int number;
    private TextView text11;
    private TextView text12;
    private TextView text13;
    private TextView text21;
    private TextView text22;
    private TextView text23;
    private TextView text31;
    private TextView text32;
    private TextView text33;

    private int[] arrays = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ArrayList<TextView> texts;
    Handler handler = new Handler(new Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            number = (int) (Math.random() * 9);
            System.out.println(number);
            for (int i = 0; i < arrays.length; i++) {
                if (i == number) {
                    texts.get(i).setText("地鼠");
                } else {
                    texts.get(i).setText("");
                }
            }
            handler.sendEmptyMessageDelayed(0, 500);
            return false;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        text11 = (TextView) findViewById(R.id.text11);
        text12 = (TextView) findViewById(R.id.text12);
        text13 = (TextView) findViewById(R.id.text13);
        text21 = (TextView) findViewById(R.id.text21);
        text22 = (TextView) findViewById(R.id.text22);
        text23 = (TextView) findViewById(R.id.text23);
        text31 = (TextView) findViewById(R.id.text31);
        text32 = (TextView) findViewById(R.id.text32);
        text33 = (TextView) findViewById(R.id.text33);

        texts = new ArrayList<TextView>();
        for (int i = 0; i < arrays.length; i++) {
            texts.add(text11);
            texts.add(text12);
            texts.add(text13);
            texts.add(text21);
            texts.add(text22);
            texts.add(text23);
            texts.add(text31);
            texts.add(text32);
            texts.add(text33);

        }
        for (TextView text : texts) {
            text.setOnClickListener(this);
        }
    }

    public void start(View v) {

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);

            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 500);
    }

    public void end(View v) {
        handler.removeMessages(0);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.text11:
                if (number == 0) {
                    Toast.makeText(this, "打中地鼠了！。。。", 1).show();

                    handler.removeMessages(0);
                }
                break;
            case R.id.text12:
                if (number == 1) {
                    Toast.makeText(this, "打中地鼠了！。。。", 1).show();
                    handler.removeMessages(0);
                }
                break;
            case R.id.text13:
                if (number == 2) {
                    Toast.makeText(this, "打中地鼠了！。。。", 1).show();
                    handler.removeMessages(0);
                }
                break;
            case R.id.text21:
                if (number == 3) {
                    Toast.makeText(this, "打中地鼠了！。。。", 1).show();
                    handler.removeMessages(0);
                }
                break;
            case R.id.text22:
                if (number == 4) {
                    Toast.makeText(this, "打中地鼠了！。。。", 1).show();
                    handler.removeMessages(0);
                }
                break;
            case R.id.text23:
                if (number == 5) {
                    Toast.makeText(this, "打中地鼠了！。。。", 1).show();
                    handler.removeMessages(0);
                }
                break;
            case R.id.text31:
                if (number == 6) {
                    Toast.makeText(this, "打中地鼠了！。。。", 1).show();
                    handler.removeMessages(0);
                }
                break;
            case R.id.text32:
                if (number == 7) {
                    Toast.makeText(this, "打中地鼠了！。。。", 1).show();
                    handler.removeMessages(0);
                }
                break;
            case R.id.text33:
                if (number == 8) {
                    Toast.makeText(this, "打中地鼠了！。。。", 1).show();
                    handler.removeMessages(0);
                }
                break;
            default:
                break;
        }
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
}