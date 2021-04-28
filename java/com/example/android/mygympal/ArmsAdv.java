package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ArmsAdv extends AppCompatActivity {

    Button clk;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms_adv);
    }
    public void armcurlcrunchleft(View v)
    {
        clk=(Button)findViewById(R.id.playarmcurlcrunchleft);
        video=(VideoView)findViewById(R.id.armcurlcrunchleft);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.armcurlcrunchleft);
        video.start();
    }
    public void armcurlcrunchright(View v)
    {
        clk=(Button)findViewById(R.id.playarmcurlcrunchright);
        video=(VideoView)findViewById(R.id.armcurlcrunchright);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.armcurlcrunchright);
        video.start();
    }
    public void burpees(View v)
    {
        clk=(Button)findViewById(R.id.playburpees);
        video=(VideoView)findViewById(R.id.burpees);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.burpees);
        video.start();
    }
    public void pushups(View v)
    {
        clk=(Button)findViewById(R.id.playpushups);
        video=(VideoView)findViewById(R.id.pushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.pushups);
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