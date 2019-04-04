package com.majedalmoqbeli.medicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);
        if(SaveSetting.USERID=="0"){
            finish();
        }
        TextView txt = findViewById(R.id.txt);
        txt.setText("Name :"+SaveSetting.USERNAME+"\n"+"ID :"+
                SaveSetting.USERID+"\n"+"Token :"+
                SaveSetting.USERTOKEN+"\n"+"Type :"+SaveSetting.USERTYPE);
    }
}
