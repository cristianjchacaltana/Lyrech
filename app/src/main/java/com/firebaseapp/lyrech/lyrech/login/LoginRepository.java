package com.firebaseapp.lyrech.lyrech.login;


import android.support.annotation.NonNull;
import android.util.Log;

import com.firebaseapp.lyrech.lyrech.domain.FirebaseAuthentication;
import com.firebaseapp.lyrech.lyrech.domain.IAuthentication;
import com.firebaseapp.lyrech.lyrech.lib.GreenRobotEventBus;
import com.firebaseapp.lyrech.lyrech.lib.IEventBus;
import com.firebaseapp.lyrech.lyrech.login.events.LoginEvent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginRepository implements ILoginRepository{

    private static final String TAG = "LoginRepository";
    public static final String DOMAIN_NAME = "gmail.com";

    private IAuthentication mAuthentication;



    public LoginRepository() {
        mAuthentication = new FirebaseAuthentication();
    }



    @Override
    public void signIn(String email, String password) {
        Log.d(TAG, "signIn: iniciar sesion");

        try {
            mAuthentication.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if ( task.isSuccessful() ){
                                postEvent(LoginEvent.SIGNIN_SUCCESS);
                            } else {
                                postEvent(LoginEvent.SIGNIN_ERROR);
                            }

                        }
                    });
        } catch (Exception e) {
            Log.d(TAG, "signIn: " + e.getMessage());
        }

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
