package com.liangxu.effectivejava.chapter01.paragraph05.demo02;

import java.util.List;

// Inappropriate use of singleton - inflexible & untestable!
public class SpellChecker {

    private final String dictionary = "";

    private SpellChecker() {

    }

    public static SpellChecker INSTANCE = new SpellChecker();


    public boolean isValid(String word) {
        return true;
    }

    public List<String> suggestions(String typo) {
        return null;
    }



}
