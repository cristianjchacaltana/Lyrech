package com.firebaseapp.lyrech.lyrech.domain;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class FirebaseAuthentication implements IAuthentication{

    @Override
    public Task<AuthResult> signInWithEmailAndPassword(String email, String password) {

        return FirebaseAuth.getInstance()
                            .signInWithEmailAndPassword(email, password);

    }
}
