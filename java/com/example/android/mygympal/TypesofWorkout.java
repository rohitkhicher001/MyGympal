package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class TypesofWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typesof_workout);


    }
    public void openBasic(View v)
    {
        Intent i=new Intent(this,Basic.class);
        startActivity(i);
    }
    public void openIntermediate(View v)
    {
        Intent i=new Intent(this,Intermediate.class);
        startActivity(i);
    }
    public void openAdvanced(View v)
    {
        Intent i=new Intent(this,Advanced.class);
        startActivity(i);
    }



}