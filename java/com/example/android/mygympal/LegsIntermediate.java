package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class LegsIntermediate extends AppCompatActivity {

    Button clk;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_intermediate);
    }
    public void calfstretchleft(View v)
    {
        clk=(Button) findViewById(R.id.playcalfstretchleft);
        video=(VideoView)findViewById(R.id.calfstretchleft);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.calfstretchleft);
        video.start();
    }
    public void calfstretchright(View v)
    {
        clk=(Button) findViewById(R.id.playcalfstretchright);
        video=(VideoView)findViewById(R.id.calfstretchright);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.calfstretchright);
        video.start();
    }
    public void firehydrantleft(View v)
    {
        clk=(Button) findViewById(R.id.playfirehydrantleft);
        video=(VideoView)findViewById(R.id.firehydrantleft);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.firehydrantleft);
        video.start();
    }
    public void firehydrantright(View v)
    {
        clk=(Button) findViewById(R.id.playfirehydrantright);
        video=(VideoView)findViewById(R.id.firehydrantright);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.firehydrantright);
        video.start();
    }
    public void lunges(View v)
    {
        clk=(Button) findViewById(R.id.playlunges);
        video=(VideoView)findViewById(R.id.lunges);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.lunges);
        video.start();
    }
    public void squats(View v)
    {
        clk=(Button) findViewById(R.id.playsquats);
        video=(VideoView)findViewById(R.id.squats);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.squats);
        video.start();
    }
    public void wallsit(View v)
    {
        clk=(Button) findViewById(R.id.playwallsit);
        video=(VideoView)findViewById(R.id.wallsit);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.wallsit);
        video.start();
    }
}