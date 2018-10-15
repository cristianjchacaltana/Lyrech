package com.firebaseapp.lyrech.lyrech.lib;

import org.greenrobot.eventbus.EventBus;

public class GreenRobotEventBus implements IEventBus{

    private EventBus mEventBus;
    private static GreenRobotEventBus instance = new GreenRobotEventBus();



    private GreenRobotEventBus(){
        mEventBus = new EventBus();
    }



    public static GreenRobotEventBus getInstance(){
        return instance;
    }

    @Override
    public void register(Object subscriber) {
        mEventBus.register(subscriber);
    }

    @Override
    public void unRegister(Object subscriber) {
        mEventBus.unregister(subscriber);
    }

    @Override
    public void post(Object event) {
        mEventBus.postSticky(event);
    }

}
