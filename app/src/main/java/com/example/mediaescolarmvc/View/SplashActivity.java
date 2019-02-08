package com.example.mediaescolarmvc.View;

import android.content.Intent;
import android.net.wifi.rtt.RangingResultCallback;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mediaescolarmvc.R;

public class SplashActivity extends AppCompatActivity {


    private static final int SPLASH_TIME_OUT=5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        apresetaTelaSplash();
    }
     private void apresetaTelaSplash(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },SPLASH_TIME_OUT);




     }

}
