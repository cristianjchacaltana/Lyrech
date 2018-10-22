package com.firebaseapp.lyrech.lyrech.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebaseapp.lyrech.lyrech.R;
import com.firebaseapp.lyrech.lyrech.register.RegisterActivity;

public class ProfileActivity extends AppCompatActivity
                            implements IProfileView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }


    @Override
    public void handleProfileOne() {
        Intent intent = new Intent(ProfileActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    @Override
    public void handleProfileTwo() {
        Intent intent = new Intent(ProfileActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}
