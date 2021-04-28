package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Intermediate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);
    }
    public void openChestIntermdiate(View v)
    {
        Intent i=new Intent(this,ChestIntermediate.class);
        startActivity(i);

    }
    public void openAbsIntermdiate(View v)
    {
        Intent i=new Intent(this,AbsIntermediate.class);
        startActivity(i);
    }
    public void openShoulderBackIntermdiate(View v)
    {
        Intent i=new Intent(this,ShoulderBackIntermediate.class);
        startActivity(i);
    }
    public void openArmsIntermdiate(View v)
    {
        Intent i=new Intent(this,ArmsIntermediate.class);
        startActivity(i);
    }
    public void openLegsIntermdiate(View v)
    {
        Intent i=new Intent(this,LegsIntermediate.class);
        startActivity(i);
    }

}