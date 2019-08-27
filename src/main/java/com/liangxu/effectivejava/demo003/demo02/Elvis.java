package com.liangxu.effectivejava.demo003.demo02;

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {

    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static void main(String[] args) {

    }
}

