package com.liangxu.effectivejava.chapter03.paragraph04.demo02;// Wrapper class - uses composition in place of inheritance

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
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        InstrumentedSet<Integer> integers = new InstrumentedSet<>(new HashSet<>());
        boolean b = integers.addAll(list);
        int addCount = integers.getAddCount();
        System.out.println("addCount = " + addCount);
    }
}
