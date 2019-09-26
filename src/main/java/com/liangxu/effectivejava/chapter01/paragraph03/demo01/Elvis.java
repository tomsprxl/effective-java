package com.liangxu.effectivejava.chapter01.paragraph03.demo01;

// Singleton with public final field
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {

    }

    public void leaveTheBuilding() {

    }


}
