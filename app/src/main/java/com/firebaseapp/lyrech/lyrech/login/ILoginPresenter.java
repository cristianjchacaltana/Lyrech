package com.firebaseapp.lyrech.lyrech.login;

public interface ILoginPresenter {

    void validateLogin(String email, String password);

    void enableButtonView(String email, String password);

}
