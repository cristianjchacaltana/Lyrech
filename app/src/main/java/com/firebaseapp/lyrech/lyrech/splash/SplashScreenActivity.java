package com.firebaseapp.lyrech.lyrech.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebaseapp.lyrech.lyrech.R;
import com.firebaseapp.lyrech.lyrech.front.FrontActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity
                                implements ISplashScreenView{

    private static final String TAG = "SplashScreenActivity";

    private ISplashScreenPresenter mSplashScreenPresenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mSplashScreenPresenter = new SplashScreenPresenter(this);
        mSplashScreenPresenter.scheduleChangeActivity();
    }



    @Override
    public void navigateToFrontActivity() {
        Intent intent = new Intent(this, FrontActivity.class);
        startActivity(intent);
        finish();
    }
}
