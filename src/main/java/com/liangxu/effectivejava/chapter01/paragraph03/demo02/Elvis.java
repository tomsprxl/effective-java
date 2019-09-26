package com.liangxu.effectivejava.chapter01.paragraph03.demo02;

// Singleton with static factory
public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {

    }

    // readResolve method to preserve singleton property
    private Object readResolve() {
        // Return the one true Elvis and let the garbage collector
        // take care of the Elvis impersonator.
        return INSTANCE;
    }

}
