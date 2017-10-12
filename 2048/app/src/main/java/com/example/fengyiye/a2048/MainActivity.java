package com.example.fengyiye.a2048;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import static android.widget.ListPopupWindow.WRAP_CONTENT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout li = new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(WRAP_CONTENT,WRAP_CONTENT);

        li.setOrientation(LinearLayout.VERTICAL);
        addContentView(li,params);
        
    }
}
