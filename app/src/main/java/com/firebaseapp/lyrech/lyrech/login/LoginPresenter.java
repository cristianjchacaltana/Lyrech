package com.firebaseapp.lyrech.lyrech.login;

public class LoginPresenter implements ILoginPresenter{

    private static final String TAG = "LoginPresenter";

    private ILoginView mLoginView;
    private ILoginInteractor mLoginInteractor;



    public LoginPresenter(ILoginView loginView){
        this.mLoginView = loginView;
        mLoginInteractor = new LoginInteractor();
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
}
