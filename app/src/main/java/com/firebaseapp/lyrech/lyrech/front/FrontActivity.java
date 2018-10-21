package com.firebaseapp.lyrech.lyrech.front;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.firebaseapp.lyrech.lyrech.R;
import com.firebaseapp.lyrech.lyrech.login.LoginActivity;
import com.firebaseapp.lyrech.lyrech.profile.ProfileActivity;
import com.firebaseapp.lyrech.lyrech.register.RegisterActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FrontActivity extends AppCompatActivity
                        implements IFrontView{

    private static final String TAG = "FrontActivity";

    @BindView(R.id.button_front_sign_in) Button mSignInButton;
    @BindView(R.id.button_front_sign_up) Button mSignUpButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        ButterKnife.bind(this);
    }



    @OnClick(R.id.button_front_sign_in)
    @Override
    public void handleSignIn() {
        Intent intent = new Intent(FrontActivity.this, LoginActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.button_front_sign_up)
    @Override
    public void handleSignUp() {
        Intent intent = new Intent(FrontActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}

