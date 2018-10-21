package com.firebaseapp.lyrech.lyrech.splash;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenPresenter implements ISplashScreenPresenter{

    private static final String TAG = "SplashScreenPresenter";
    public static final long SPLASH_SCREEN_DELAY = 20000;

    private ISplashScreenView mSplashScreenView;



    public SplashScreenPresenter(ISplashScreenView mSplashScreenView) {
        this.mSplashScreenView = mSplashScreenView;
    }



    @Override
    public void scheduleChangeActivity() {

        if ( mSplashScreenView!=null ) {
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    mSplashScreenView.navigateToFrontActivity();
                }
            };
            timer.schedule(timerTask, SPLASH_SCREEN_DELAY);
        }

    }
}
