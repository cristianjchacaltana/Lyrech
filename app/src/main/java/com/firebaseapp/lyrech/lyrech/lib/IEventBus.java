package com.firebaseapp.lyrech.lyrech.lib;

public interface IEventBus {

    void register(Object subscriber);
    void unRegister(Object subscriber);
    void post(Object event);

}
