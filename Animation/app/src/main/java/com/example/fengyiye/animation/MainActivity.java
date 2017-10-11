package com.example.fengyiye.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable ad;
    boolean mystate= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv =(ImageView)findViewById(R.id.imageView);
        iv.setBackgroundResource(R.drawable.ani);
        ad=(AnimationDrawable)iv.getBackground();

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mystate)
                {
                    ad.stop();
                    mystate = false;
                }
                else
                {
                    Toast.makeText(MainActivity.this,"click",Toast.LENGTH_SHORT);
                    ad.start();
                    mystate=true;

                    ImageView bulletImage = (ImageView)findViewById(R.id.imageView2);
                    Animation ani = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                    bulletImage.startAnimation(ani);
                }

            }
        });
    }
}
