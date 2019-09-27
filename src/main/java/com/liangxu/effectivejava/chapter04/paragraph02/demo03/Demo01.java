package com.liangxu.effectivejava.chapter04.paragraph02.demo03;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-27 15:45
 */
public class Demo01 {
    public static void main(String[] args) {
        union(new TreeSet(),new HashSet());
    }


    // Uses raw types - unacceptable! [Item 26]
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // Generic method
    public static <E> Set<E> union1(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;

    }




}