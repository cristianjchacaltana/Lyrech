package com.firebaseapp.lyrech.lyrech.login;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.firebaseapp.lyrech.lyrech.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class LoginActivity  extends AppCompatActivity
                            implements ILoginView{

    private static final String TAG = "LoginActivity";

    @BindView(R.id.edittext_login_email) EditText mEmailEditText;
    @BindView(R.id.edittext_login_password) EditText mPasswordEditText;
    @BindView(R.id.button_log_in)
    Button mLogInButton;
    @BindView(R.id.relativelayout_login_container) RelativeLayout mLoginContainerRelativeLayout;
    @BindView(R.id.relativelayout_progress) RelativeLayout mProgressRelativeLayout;

    private ILoginPresenter mLoginPresenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        mLoginPresenter = new LoginPresenter(this);
    }



    @Override
    public void enableButton() {
        mLogInButton.setEnabled(true);
    }

    @Override
    public void disableButton() {
        mLogInButton.setEnabled(false);
    }

    @Override
    public void showProgress() {
        mProgressRelativeLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressRelativeLayout.setVisibility(View.INVISIBLE);
    }

    @Override
    public void navigateToMainScreen() {

    }

    @Override
    public void loginError(String error) {
        Snackbar.make(mLoginContainerRelativeLayout,
                    R.string.login_error_one,
                    Snackbar.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button_log_in)
    @Override
    public void handleLogIn() {
        mLoginPresenter.validateLogin(mEmailEditText.getText().toString(),
                                    mPasswordEditText.getText().toString());
    }

    @OnTextChanged(R.id.edittext_login_email)
    @Override
    public void onTextChangedEventEmail() {
        mLoginPresenter.enableButtonView(mEmailEditText.getText().toString(),
                                        mPasswordEditText.getText().toString());
    }

    @OnTextChanged(R.id.edittext_login_password)
    @Override
    public void onTextChangedEventPassword() {
        mLoginPresenter.enableButtonView(mEmailEditText.getText().toString(),
                                        mPasswordEditText.getText().toString());
    }
}
