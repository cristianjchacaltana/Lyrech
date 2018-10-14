package com.firebaseapp.lyrech.lyrech.domain;

public class FactoryProducer {

    public static final String DATABASE_FACTORY = "DatabaseFactory";
    public static final String AUTHENTICATION_FACTORY = "AuthenticationFactory";



    public static IAbstractFactory getFactory(String choice){

        switch (choice){
            case DATABASE_FACTORY:
                return new DatabaseFactory();
            case AUTHENTICATION_FACTORY:
                return new AuthenticationFactory();
        }

        return null;

    }

}
