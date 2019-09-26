package com.liangxu.effectivejava.chapter01.paragraph05.demo01;

import java.util.List;

// Inappropriate use of static utility - inflexible & untestable!
public class SpellChecker {

    private static final String dictionary = "";

    private SpellChecker() {

    }

    // Noninstantiable

    public static boolean isValid(String word) {
        return true;
    }

    public static List<String> suggestions(String typo) {
        return null;
    }
}
