package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class AbsAdv extends AppCompatActivity {

    Button clk;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_adv);
    }
    public void legraises(View v)
    {
        clk=(Button)findViewById(R.id.playlegraises);
        video=(VideoView)findViewById(R.id.legraises);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.legraises);
        video.start();
    }
    public void vups(View v)
    {
        clk=(Button)findViewById(R.id.playvups);
        video=(VideoView)findViewById(R.id.vups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vups);
        video.start();
    }
    public void crunches(View v)
    {
        clk = (Button) findViewById(R.id.playcrunches);
        video = (VideoView) findViewById(R.id.crunches);
        video.setVideoPath("android.resource://"+ getPackageName()+"/"+ R.raw.crunches);
        video.start();
    }
    public void russiantwists(View v)
    {
        clk = (Button) findViewById(R.id.playrussiantwists);
        video = (VideoView) findViewById(R.id.russiantwists);
        video.setVideoPath("android.resource://"+ getPackageName()+"/"+ R.raw.russiantwist);
        video.start();
    }
    public void bicyclecrunches(View v)
    {
        clk = (Button) findViewById(R.id.playbicyclecrunches);
        video = (VideoView) findViewById(R.id.bicyclecrunches);
        video.setVideoPath("android.resource://"+ getPackageName()+"/"+ R.raw.bicyclecrunches);
        video.start();
    }
    public void buttbridge(View v)
    {
        clk = (Button) findViewById(R.id.playbuttbridge);
        video = (VideoView) findViewById(R.id.buttbridge);
        video.setVideoPath("android.resource://"+ getPackageName()+"/"+ R.raw.buttbridge);
        video.start();
    }
}