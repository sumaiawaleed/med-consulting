package com.majedalmoqbeli.medicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
          Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                    SaveSetting sv = new SaveSetting(WelcomeActivity.this);
                    sv.LoadData();
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
