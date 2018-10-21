package com.firebaseapp.lyrech.lyrech.login;

import android.util.Log;

import com.firebaseapp.lyrech.lyrech.lib.GreenRobotEventBus;
import com.firebaseapp.lyrech.lyrech.lib.IEventBus;
import com.firebaseapp.lyrech.lyrech.login.events.LoginEvent;

import org.greenrobot.eventbus.Subscribe;

public class LoginPresenter implements ILoginPresenter{

    private static final String TAG = "LoginPresenter";

    private ILoginView mLoginView;
    private ILoginInteractor mLoginInteractor;
    private IEventBus mEventBus;


    public LoginPresenter(ILoginView loginView){
        this.mLoginView = loginView;
        mLoginInteractor = new LoginInteractor();
        mEventBus = GreenRobotEventBus.getInstance();
    }



    @Override
    public void onCreate() {
        mEventBus.register(this);
    }

    @Override
    public void onDestroy() {
        mEventBus.unRegister(this);
    }


    @Override
    public void checkForAuthenticatedUser() {
        if ( mLoginView!=null ) {
            mLoginView.navigateToMainScreen();
        }
    }

    @Override
    public void validateLogin(String email, String password) {
        if(mLoginView != null){
            mLoginView.disableButton();
            mLoginView.showProgress();
        }

        mLoginInteractor.doLogin(email, password);
    }

    @Override
    public void enableButtonView(String email, String password) {
        if ( email.length()!=0 && password.length()!=0 ){
            mLoginView.enableButton();
        } else {
            mLoginView.disableButton();
        }
    }


    @Override
    @Subscribe
    public void onLoginEvent(LoginEvent event) {

        switch (event.getEventType()) {
            case LoginEvent.SIGNIN_SUCCESS:
                onSignInSuccess();
                break;
            case LoginEvent.SIGNIN_ERROR:
                onSignInError();
                break;
            case LoginEvent.SESSION_SUCCESSFULLY_RECOVERS:
                checkForAuthenticatedUser();
                break;
            case LoginEvent.FAILED_TO_RECOVER_SESSION:
                onFailedToRecoverSession();
                break;
        }

    }

    private void onSignInSuccess() {
        if ( mLoginView!=null ) {
            mLoginView.navigateToMainScreen();
        }
    }

    private void onSignInError() {
        if ( mLoginView!=null ) {
            mLoginView.hideProgress();
            mLoginView.loginError();
        }
    }

    private void onFailedToRecoverSession() {
        Log.d(TAG, "onFailedToRecoverSession");
    }
}
