package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ShoulderBackBasics extends AppCompatActivity {

    Button clk;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder_back_basics);
    }
    public void armraises(View v)
    {
        clk=(Button) findViewById(R.id.playarmraises);
        video=(VideoView)findViewById(R.id.armraises);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.armraises);
        video.start();
    }
    public void armscissors(View v)
    {
        clk=(Button) findViewById(R.id.playarmscissors);
        video=(VideoView)findViewById(R.id.armscissors);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.armsscissors);
        video.start();
    }
    public void catcowpose(View v)
    {
        clk=(Button) findViewById(R.id.playcatcowpose);
        video=(VideoView)findViewById(R.id.catcowpose);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.catcowpose);
        video.start();
    }
    public void childspose(View v)
    {
        clk=(Button) findViewById(R.id.playchildspose);
        video=(VideoView)findViewById(R.id.childspose);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.childspose);
        video.start();
    }
    public void kneepushups(View v)
    {
        clk=(Button) findViewById(R.id.playkneepushups);
        video=(VideoView)findViewById(R.id.kneepushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.kneepushups);
        video.start();

    }
    public void pronetriceppushups(View v)
    {
        clk=(Button) findViewById(R.id.playpronetriceppushups);
        video=(VideoView)findViewById(R.id.pronetriceppushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.pronetricepspushups);
        video.start();
    }
    public void rhomboidpulls(View v)
    {
        clk=(Button) findViewById(R.id.playrhomboidpulls);
        video=(VideoView)findViewById(R.id.rhomboidpulls);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.rhomboidpulls);
        video.start();
    }
    public void sidearmraise(View v)
    {
        clk=(Button) findViewById(R.id.playsidearmraise);
        video=(VideoView)findViewById(R.id.sidearmraise);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sidearmraise);
        video.start();
    }
}