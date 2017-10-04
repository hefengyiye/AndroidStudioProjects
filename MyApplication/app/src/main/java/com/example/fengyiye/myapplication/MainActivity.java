package com.example.fengyiye.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        TextView myview = (TextView) findViewById(R.id.textview);
        EditText myedit =(EditText) findViewById(R.id.editText);
        char[] str = myedit.getText().toString().toCharArray();
        String computer = "1024";
        char[] target = computer.toCharArray();

        int Acase = 0;
        int Bcase = 0;

        for(int i = 0;i<str.length;i++)
        {
            for(int j = 0;j<target.length;j++)
            {
                if (str[i]==target[j])
                {
                    if(i==j)
                    {
                        Acase++;
                    }
                    Bcase++;
                }
            }
        }

        myview.setText(Acase+"A"+Bcase+"B");
    }
}
