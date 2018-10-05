package com.firebaseapp.lyrech.lyrech;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class LyrechApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
    }

    private void setupFirebase() {
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
