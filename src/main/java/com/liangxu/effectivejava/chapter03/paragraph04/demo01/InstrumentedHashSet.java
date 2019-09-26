package com.liangxu.effectivejava.chapter03.paragraph04.demo01;

import java.util.*;

// Broken - Inappropriate use of inheritance!
public class InstrumentedHashSet<E> extends HashSet<E> {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        InstrumentedHashSet<Integer> integers = new InstrumentedHashSet<>();
        boolean b = integers.addAll(list);
        int addCount = integers.getAddCount();
        System.out.println("addCount = " + addCount);

    }

    // The number of attempted element insertions
    private int addCount = 0;

    public InstrumentedHashSet() {

    }

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
