package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Basic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
    }
    public void openChestbasic(View v)
    {
        Intent i=new Intent(this,ChestBasic.class);
        startActivity(i);
    }
    public void openAbsbasic(View v)
    {
        Intent i=new Intent(this,Absbasic.class);
        startActivity(i);
    }
    public void openArmsbasic(View v)
    {
        Intent i=new Intent(this,ArmsBasic.class);
        startActivity(i);
    }
    public void openLegsbasic(View v)
    {
        Intent i=new Intent(this,Legsbasic.class);
        startActivity(i);
    }
    public void openShoulderBackBasics(View v)
    {
        Intent i=new Intent(this,ShoulderBackBasics.class);
        startActivity(i);
    }

}