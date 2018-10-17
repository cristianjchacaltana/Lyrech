package com.firebaseapp.lyrech.lyrech.login;

import com.firebaseapp.lyrech.lyrech.login.events.LoginEvent;

public interface ILoginPresenter {

    void onCreate();
    void onDestroy();

    void validateLogin(String email, String password);
    void enableButtonView(String email, String password);
    void onLoginEvent(LoginEvent event);

}
