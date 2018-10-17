package com.firebaseapp.lyrech.lyrech.login.events;

public class LoginEvent {

    public static final int SIGNIN_ERROR = 0;
    public static final int SIGNIN_SUCCESS = 1;
    public static final int FAILED_TO_RECOVER_SESSION = 2;

    private int mEventType;



    public int getEventType() {
        return mEventType;
    }

    public void setEventType(int mEventType) {
        this.mEventType = mEventType;
    }
}
