package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Intensity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intensity);
    }
    public void openTypes(View v)
    {
        Intent i=new Intent(this,TypesofWorkout.class);
        startActivity(i);
    }
    public void BMICAL(View v)
    {
        Intent i=new Intent(this,BMI.class);
        startActivity(i);
    }

}