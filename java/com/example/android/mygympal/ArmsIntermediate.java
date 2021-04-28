package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ArmsIntermediate extends AppCompatActivity {

    Button clk;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms_intermediate);
    }
    public void burpees(View v)
    {
        clk=(Button)findViewById(R.id.playburpees);
        video=(VideoView)findViewById(R.id.burpees);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.burpees);
        video.start();
    }


    public void armcircles(View v)
    {
        clk=(Button)findViewById(R.id.playarmcircles);
        video=(VideoView)findViewById(R.id.armcircles);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.armcircles);
        video.start();
    }
    public void punches(View v)
    {
        clk=(Button)findViewById(R.id.playpunches);
        video=(VideoView)findViewById(R.id.punches);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.punches);
        video.start();
    }
    public void pushups(View v)
    {
        clk=(Button)findViewById(R.id.playpushups);
        video=(VideoView)findViewById(R.id.pushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.pushups);
        video.start();
    }
    public void tricepdips(View v)
    {
        clk=(Button)findViewById(R.id.playtricepdips);
        video=(VideoView)findViewById(R.id.tricepdips);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.tricepdips);
        video.start();
    }
}