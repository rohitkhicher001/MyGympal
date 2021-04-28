package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ShoulderBackAdv extends AppCompatActivity {

    Button clk;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder_back_adv);
    }
    public void hyperextensions(View v)
    {
        clk=(Button)findViewById(R.id.playhyperextensions);
        video=(VideoView)findViewById(R.id.hyperextensions);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.hyperextension);
    }
    public void pikepushups(View v)
    {
        clk=(Button)findViewById(R.id.playpikepushups);
        video=(VideoView)findViewById(R.id.pikepushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.pikepushups);
    }
    public void reversepushups(View v)
    {
        clk=(Button)findViewById(R.id.playreversepushups);
        video=(VideoView)findViewById(R.id.reversepushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.reversepushups);
    }
    public void reversesnowangels(View v)
    {
        clk=(Button)findViewById(R.id.playreversesnowangels);
        video=(VideoView)findViewById(R.id.reversesnowangels);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.reversesnowangels);
    }
    public void sidelyingfloorstretchleft(View v)
    {
        clk=(Button)findViewById(R.id.playsidelyingfloorstretchleft);
        video=(VideoView)findViewById(R.id.sidelyingfloorstretchleft);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sidelyingfloorstretchleft);
    }
    public void sidelyingfloorstretchright(View v)
    {
        clk=(Button)findViewById(R.id.playsidelyingfloorstretchright);
        video=(VideoView)findViewById(R.id.sidelyingfloorstretchright);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sidelyingfloorstretchright);
    }
}