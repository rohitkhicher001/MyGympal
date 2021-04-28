package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ChestIntermediate extends AppCompatActivity {

    Button clk;
    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_intermediate);
    }
    public void declinepushups(View v)
    {
        clk=(Button)findViewById(R.id.playdeclinepushups);
        video=(VideoView)findViewById(R.id.declinepushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.declinepushups);
        video.start();
    }
    public void inclinepushups(View v)
    {
        clk=(Button)findViewById(R.id.playinclinepushups);
        video=(VideoView)findViewById(R.id.inclinepushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.inclinepushups);
        video.start();
    }
    public void pushups(View v)
    {
        clk=(Button)findViewById(R.id.playpushups);
        video=(VideoView)findViewById(R.id.pushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.pushups);
        video.start();
    }
    public void boxpushups(View v)
    {
        clk=(Button)findViewById(R.id.playboxpushups);
        video=(VideoView)findViewById(R.id.boxpushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.boxpushups);
        video.start();
    }
    public void hindupushups(View v)
    {
        clk=(Button)findViewById(R.id.playhindupushups);
        video=(VideoView)findViewById(R.id.hindupushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.hindupushups);
        video.start();
    }
    public void widearmpushups(View v)
    {
        clk=(Button)findViewById(R.id.playwidearmpushups);
        video=(VideoView)findViewById(R.id.widearmpushups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.widearmpushups);
        video.start();
    }

}