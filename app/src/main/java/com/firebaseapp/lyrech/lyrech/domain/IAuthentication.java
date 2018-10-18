package com.firebaseapp.lyrech.lyrech.domain;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public interface IAuthentication {

    Task<AuthResult> signInWithEmailAndPassword(String email, String password);

}
