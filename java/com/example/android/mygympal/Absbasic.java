package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Absbasic extends AppCompatActivity {

    Button clk;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absbasic);
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
    public void mountainclimbers(View v)
    {
        clk = (Button) findViewById(R.id.playmountainclimbers);
        video = (VideoView) findViewById(R.id.mountainclimbers);
        video.setVideoPath("android.resource://"+ getPackageName()+"/"+ R.raw.mountainclimber);
        video.start();
    }
    public void legraises(View v)
    {
        clk = (Button) findViewById(R.id.playlegraises);
        video = (VideoView) findViewById(R.id.legraises);
        video.setVideoPath("android.resource://"+ getPackageName()+"/"+ R.raw.legraises);
        video.start();
    }
    public void heeltouch(View v)
    {
        clk = (Button) findViewById(R.id.playheeltouch);
        video = (VideoView) findViewById(R.id.heeltouch);
        video.setVideoPath("android.resource://"+ getPackageName()+"/"+ R.raw.heeltouch);
        video.start();
    }
}