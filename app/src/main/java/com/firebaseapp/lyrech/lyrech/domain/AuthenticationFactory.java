package com.firebaseapp.lyrech.lyrech.domain;

public class AuthenticationFactory implements IAbstractFactory{

    public static final String FIREBASE_AUTHENTICATION = "FirebaseAuthentication";



    @Override
    public IDatabase getDatabase(String database) {
        return null;
    }

    @Override
    public IAuthentication getAuthentication(String authentication) {

        switch (authentication){
            case FIREBASE_AUTHENTICATION:
                return new FirebaseAuthentication();
        }

        return null;
    }
}
