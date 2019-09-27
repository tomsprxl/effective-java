package com.liangxu.effectivejava.chapter04.paragraph01.demo01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-27 15:00
 */
public class Demo01 {
    // Fails at runtime - unsafeAdd method uses a raw type (List)!
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0); // Has compiler-generated cast

        Set<Lark> exaltation = new HashSet();

    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }


}