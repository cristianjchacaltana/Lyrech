package com.firebaseapp.lyrech.lyrech.login;

public class LoginInteractor implements ILoginInteractor{

    private static final String TAG = "LoginInteractor";

    private ILoginRepository mLoginRepository;



    public LoginInteractor() {
        mLoginRepository = new LoginRepository();
    }



    @Override
    public void doLogin(String email, String password) {
        mLoginRepository.signIn(email, password);
    }
}
