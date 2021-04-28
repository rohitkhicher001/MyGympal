package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class AbsIntermediate extends AppCompatActivity {

    Button clk;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_intermediate);
    }
    public void crossovercrunches(View v)
    {
        clk=(Button)findViewById(R.id.playcrossovercrunches);
        video=(VideoView)findViewById(R.id.crossovercrunches);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.crossovercrunches);
        video.start();
    }
    public void heeltouch(View v)
    {
        clk=(Button)findViewById(R.id.playheeltouchs);
        video=(VideoView)findViewById(R.id.heeltouch);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.heeltouch);
        video.start();
    }
    public void legraises(View v)
    {
        clk=(Button)findViewById(R.id.playlegraises);
        video=(VideoView)findViewById(R.id.legraises);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.legraises);
        video.start();
    }
    public void mountainclimbers(View v)
    {
        clk=(Button)findViewById(R.id.playmountainclimbers);
        video=(VideoView)findViewById(R.id.mountainclimbers);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.mountainclimber);
        video.start();
    }
    public void vups(View v)
    {
        clk=(Button)findViewById(R.id.playvups);
        video=(VideoView)findViewById(R.id.vups);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vups);
        video.start();
    }
    public void sideliftleft(View v)
    {
        clk=(Button)findViewById(R.id.playsideliftleft);
        video=(VideoView)findViewById(R.id.sideliftleft);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sidelyingleftlift);
        video.start();
    }
    public void sideliftright(View v)
    {
        clk=(Button)findViewById(R.id.playsideliftright);
        video=(VideoView)findViewById(R.id.sideliftright);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sidelyingrightlift);
        video.start();
    }
}