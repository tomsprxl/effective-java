package com.liangxu.effectivejava.chapter01.paragraph05.demo03;

import java.util.List;
import java.util.Objects;

// Dependency injection provides flexibility and testability
public class SpellChecker {

    private final String dictionary;

    public SpellChecker(String dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        return true;
    }

    public List<String> suggestions(String typo) {
        return null;
    }
}
