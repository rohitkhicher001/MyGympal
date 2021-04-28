package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Legsbasic extends AppCompatActivity {

    Button clk;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legsbasic);
    }
    public void squats(View v)
    {
        clk=(Button) findViewById(R.id.playsquats);
        video=(VideoView)findViewById(R.id.squats);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.squats);
        video.start();
    }
    public void backwardlunge(View v)
    {
        clk=(Button) findViewById(R.id.playbackwardlunge);
        video=(VideoView)findViewById(R.id.backwardlunge);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.backwardlunge);
        video.start();
    }
    public void sidehops(View v)
    {
        clk=(Button) findViewById(R.id.playsidehops);
        video=(VideoView)findViewById(R.id.sidehops);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sidehops);
        video.start();
    }
    public void calfraises(View v)
    {
        clk=(Button) findViewById(R.id.playcalfraises);
        video=(VideoView)findViewById(R.id.wallcalfraises);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.wallcalfraises);
        video.start();
    }
    public void leftquadstretch(View v)
    {
        clk=(Button) findViewById(R.id.playleftquadstretch);
        video=(VideoView)findViewById(R.id.leftquadstretch);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.leftquadstretch);
        video.start();
    }
    public void rightquadstretch(View v)
    {
        clk=(Button) findViewById(R.id.playrightquadstretch);
        video=(VideoView)findViewById(R.id.rightquadstretch);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.rightquadstretch);
        video.start();
    }
    public void sidelyingleftlift(View v)
    {
        clk=(Button) findViewById(R.id.playsidelyingleftlift);
        video=(VideoView)findViewById(R.id.sidelyingleftlift);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sidelyingleftlift);
        video.start();
    }
    public void sidelyingrightlift(View v)
    {
        clk=(Button) findViewById(R.id.playsidelyingrightlift);
        video=(VideoView)findViewById(R.id.sidelyingrightlift);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sidelyingrightlift);
        video.start();
    }

}