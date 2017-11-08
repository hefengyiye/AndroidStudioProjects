package com.example.fengyiye.customview;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Myview extends AppCompatActivity {
    Handler hand;
    Customview view;

    Runnable run = new Runnable() {
        @Override
        public void run() {
            view.invalidate();
            hand.postDelayed(run,100);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myview);

        hand = new Handler();
        hand.postDelayed(run,100);
        view = (Customview) findViewById(R.id.myview);
    }


}
