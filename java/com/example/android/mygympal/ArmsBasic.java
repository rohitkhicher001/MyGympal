package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ArmsBasic extends AppCompatActivity {

    Button clk;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms_basic);
    }
    public void armcircles(View v)
    {
        clk=(Button)findViewById(R.id.playarmcircles);
        video=(VideoView)findViewById(R.id.armcircles);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.armcircles);
        video.start();
    }
    public void armraises(View v)
    {
        clk=(Button)findViewById(R.id.playarmraises);
        video=(VideoView)findViewById(R.id.armraises);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.armraises);
        video.start();
    }
    public void diagonalplanks(View v)
    {
        clk=(Button)findViewById(R.id.playdiagonalplanks);
        video=(VideoView)findViewById(R.id.diagonalplanks);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.diagonalplank);
        video.start();
    }
    public void diamondpushups(View v)
    {
        clk=(Button)findViewById(R.id.playdiamondpushups);
        video=(VideoView)findViewById(R.id.diamondpushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.daimondpushup);
        video.start();
    }
    public void inchworms(View v)
    {
        clk=(Button)findViewById(R.id.playinchworms);
        video=(VideoView)findViewById(R.id.inchworms);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.inchworms);
        video.start();
    }
    public void punches(View v)
    {
        clk=(Button)findViewById(R.id.playpunches);
        video=(VideoView)findViewById(R.id.punches);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.punches);
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