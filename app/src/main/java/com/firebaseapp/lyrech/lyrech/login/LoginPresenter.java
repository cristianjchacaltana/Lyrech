package com.firebaseapp.lyrech.lyrech.login;

public class LoginPresenter implements ILoginPresenter{

    private static final String TAG = "LoginPresenter";

    private ILoginView loginView;



    public LoginPresenter(ILoginView loginView){
        this.loginView = loginView;
    }



    @Override
    public void validateLogin(String email, String password) {
        if(loginView != null){
            loginView.disableButton();
            loginView.showProgress();
        }
    }

}
