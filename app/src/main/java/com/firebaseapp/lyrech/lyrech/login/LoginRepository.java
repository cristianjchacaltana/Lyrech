package com.firebaseapp.lyrech.lyrech.login;

import android.util.Log;

public class LoginRepository implements ILoginRepository{

    private static final String TAG = "LoginRepository";



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



}
