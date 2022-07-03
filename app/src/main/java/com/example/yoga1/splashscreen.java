package com.example.yoga1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressLint("CustomSplashScreen")
public class splashscreen extends AppCompatActivity {

    private static int timer = 4000;
    ImageView imageView;
    TextView textView1;
    Animation upper_anim;
    Animation bottom_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splashscreen);
        imageView=findViewById(R.id.splash);
        textView1=findViewById(R.id.line);
        bottom_anim=AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        upper_anim= AnimationUtils.loadAnimation(this,R.anim.upper_anim);
        imageView.setAnimation(upper_anim);
        textView1.setAnimation(upper_anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this,mainsc.class);
                startActivity(intent);
                finish();
            }
        },timer);

    }
}