package com.firebaseapp.lyrech.lyrech.login;

public interface ILoginRepository {

    void signIn(String email, String password);
    void signUp(String email, String password);
    void checkAlreadyAuthenticated();

}
