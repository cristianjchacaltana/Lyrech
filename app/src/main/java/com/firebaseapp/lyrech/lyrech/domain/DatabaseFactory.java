package com.firebaseapp.lyrech.lyrech.domain;

public class DatabaseFactory implements IAbstractFactory{

    public static final String CLOUD_FIRESTORE = "CloudFirestore";
    public static final String REALTIME_DATABASE = "RealtimeDatabase";



    @Override
    public IDatabase getDatabase(String database) {

        switch (database){
            case CLOUD_FIRESTORE:
                return new CloudFirestore();
            case REALTIME_DATABASE:
                return new RealtimeDatabase();
        }

        return null;
    }

    @Override
    public IAuthentication getAuthentication(String authentication) {
        return null;
    }
}
