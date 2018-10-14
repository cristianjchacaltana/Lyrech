package com.firebaseapp.lyrech.lyrech.domain;

public interface IAbstractFactory {

    IDatabase getDatabase(String database);
    IAuthentication getAuthentication(String authentication);

}
