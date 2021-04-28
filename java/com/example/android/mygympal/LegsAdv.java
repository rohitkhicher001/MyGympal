package com.example.android.mygympal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class LegsAdv extends AppCompatActivity {

    Button clk;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_adv);
    }
    public void squats(View v)
    {
        clk=(Button) findViewById(R.id.playsquats);
        video=(VideoView)findViewById(R.id.squats);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.squats);
        video.start();
    }
    public void glutekickbackright(View v)
    {
        clk=(Button) findViewById(R.id.playglutekickbackright);
        video=(VideoView)findViewById(R.id.glutekickbackright);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.glutekickbackright);
        video.start();
    }
    public void glutekickbackleft(View v)
    {
        clk=(Button) findViewById(R.id.playglutekickbackleft);
        video=(VideoView)findViewById(R.id.glutekickbackleft);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.glutekickbackleft);
        video.start();
    }
    public void jumpingsquats(View v)
    {
        clk=(Button) findViewById(R.id.playjumpingsquats);
        video=(VideoView)findViewById(R.id.jumpingsquats);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.jumpingsquats);
        video.start();
    }
    public void lyingbutterflystretch(View v)
    {
        clk=(Button) findViewById(R.id.playlyingbutterflystretch);
        video=(VideoView)findViewById(R.id.lyingbutterflystretch);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.lyingbutterflystretch);
        video.start();
    }
    public void calfraises(View v)
    {
        clk=(Button) findViewById(R.id.playcalfraises);
        video=(VideoView)findViewById(R.id.wallcalfraises);
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.wallcalfraises);
        video.start();
    }

}