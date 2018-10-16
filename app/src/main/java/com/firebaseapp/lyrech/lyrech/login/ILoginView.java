package com.firebaseapp.lyrech.lyrech.login;

import com.firebaseapp.lyrech.lyrech.domain.IButton;
import com.firebaseapp.lyrech.lyrech.domain.IProgress;

public interface ILoginView extends IButton, IProgress {

    void navigateToMainScreen();
    void loginError(String error);

    void handleLogIn();

    void onTextChangedEventEmail();
    void onTextChangedEventPassword();

}
