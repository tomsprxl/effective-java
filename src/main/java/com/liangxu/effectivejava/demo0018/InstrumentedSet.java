package com.liangxu.effectivejava.demo0018;

import java.util.*;

public class InstrumentedSet<E> extends ForwardingSet<E> {

    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
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


    public static void main(String[] args) {
        InstrumentedSet<String> strings = new InstrumentedSet<String>(new TreeSet<>());

        strings.addAll(Arrays.asList("1","2","3"));

        System.out.println(strings.getAddCount());
    }


}