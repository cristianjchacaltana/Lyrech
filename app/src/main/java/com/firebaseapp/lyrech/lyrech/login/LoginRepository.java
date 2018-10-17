package com.firebaseapp.lyrech.lyrech.login;


import android.util.Log;

import com.firebaseapp.lyrech.lyrech.lib.GreenRobotEventBus;
import com.firebaseapp.lyrech.lyrech.lib.IEventBus;
import com.firebaseapp.lyrech.lyrech.login.events.LoginEvent;


public class LoginRepository implements ILoginRepository{

    private static final String TAG = "LoginRepository";
    public static final String DOMAIN_NAME = "gmail.com";



    public LoginRepository() {
    }



    @Override
    public void signIn(String email, String password) {
        Log.d(TAG, "signIn: iniciar sesion");
    }

    @Override
    public void signUp(String email, String password) {
        Log.d(TAG, "signUp: registrarse");
    }

    @Override
    public void checkAlreadyAuthenticated() {
        Log.d(TAG, "checkAlreadyAuthenticated: check sesion");
    }


    private boolean isValidDomain(String email){
        String dominio = email.substring(email.indexOf('@') + 1);
        return dominio.equals(DOMAIN_NAME) ? true : false;
    }


    private void postEvent(int type){

        LoginEvent loginEvent = new LoginEvent();
        loginEvent.setEventType(type);

        IEventBus eventBus = GreenRobotEventBus.getInstance();
        eventBus.post(loginEvent);

    }

}
