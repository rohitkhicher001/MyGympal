package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class Advanced extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
    }
    public void openChestAdv(View v)
    {
        Intent i=new Intent(this,ChestAdv.class);
        startActivity(i);
    }
    public void openArmsAdv(View v)
    {
        Intent i=new Intent(this,ArmsAdv.class);
        startActivity(i);
    }
    public void openAbsAdv(View v)
    {
        Intent i=new Intent(this,AbsAdv.class);
        startActivity(i);
    }
    public void openShoulderBackAdv(View v)
    {
        Intent i=new Intent(this,ShoulderBackAdv.class);
        startActivity(i);
    }
    public void openLegsAdv(View v)
    {
        Intent i=new Intent(this,LegsAdv.class);
        startActivity(i);
    }

}