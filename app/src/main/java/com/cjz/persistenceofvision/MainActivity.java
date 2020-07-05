package com.cjz.persistenceofvision;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TaiJi mTj1;
    private TaiJi mTj2;
    private TaiJi mTj3;
    private TaiJi mTj4;
    private TaiJi mTj5;
    private TaiJi mTj6;
    private TaiJi mTj7;
    private TaiJi mTj8;
    private TaiJi mTj9;
    private TaiJi mTj10;
    private TaiJi mTj11;
    private TaiJi mTj12;
    private TaiJi mTj13;
    private TaiJi mTj14;
    private TaiJi mTj15;
    private TaiJi mTj16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTj1 = findViewById(R.id.tj_1);
        mTj2 = findViewById(R.id.tj_2);
        mTj3 = findViewById(R.id.tj_3);
        mTj4 = findViewById(R.id.tj_4);
        mTj5 = findViewById(R.id.tj_5);
        mTj6 = findViewById(R.id.tj_6);
        mTj7 = findViewById(R.id.tj_7);
        mTj8 = findViewById(R.id.tj_8);
        mTj9 = findViewById(R.id.tj_9);
        mTj10 = findViewById(R.id.tj_10);
        mTj11 = findViewById(R.id.tj_11);
        mTj12 = findViewById(R.id.tj_12);
        mTj13 = findViewById(R.id.tj_13);
        mTj14 = findViewById(R.id.tj_14);
        mTj15 = findViewById(R.id.tj_15);
        mTj16 = findViewById(R.id.tj_16);
        mTj2.setDuration(2);
        mTj3.setDuration(3);
        mTj4.setDuration(4);
        mTj5.setDuration(5);
        mTj6.setDuration(500);
        mTj7.setDuration(600);
        mTj8.setDuration(700);
        mTj9.setDuration(800);
        mTj10.setDuration(900);
        mTj11.setDuration(1000);
        mTj12.setDuration(1100);
        mTj13.setDuration(1200);
        mTj14.setDuration(1300);
        mTj15.setDuration(1400);
        mTj16.setDuration(2000);
    }
}
