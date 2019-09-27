package com.liangxu.effectivejava.chapter04.paragraph01.demo04;

import java.util.Collection;

// A first cut at making Chooser generic - won't compile
public class Chooser<T> {
    private final T[] choiceArray;

    public Chooser(Collection<T> choices) {
        choiceArray = (T[]) choices.toArray();
    }

    // choose method unchanged

}
