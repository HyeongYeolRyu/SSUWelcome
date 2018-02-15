package com.example.admin.ssuwelcome;

/**
 * Created by EinHugo on 2017-05-23.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;


public class IntroActivity extends Activity {

    Handler Intro_Handler;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Intro_Handler = new Handler();
        Intro_Handler.postDelayed(mrun, 1500);

        ImageView applicationIcon = (ImageView)findViewById(R.id.appicon);
        applicationIcon.setImageResource(R.drawable.ic_app);
    }

    Runnable mrun = new Runnable() {
        @Override
        public void run() {
            Intent Start_App = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(Start_App);
            finish();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    };
}