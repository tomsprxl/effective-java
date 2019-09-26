package com.liangxu.effectivejava.chapter01.paragraph06.demo01;

import java.util.regex.Pattern;

// Reusing expensive object for improved performance
//避免创建不必要的对象
public class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    private static final Pattern NUMBER = Pattern.compile("^[0-9]*$");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    static boolean isOk(String s) {
        boolean matches = s.matches("^[0-9]*$");
        return matches;
    }

    static boolean isNumber(String s) {
        boolean matches = NUMBER.matcher(s).matches();
        return matches;
    }


    public static void main(String[] args) {
        boolean number = RomanNumerals.isNumber("23");
        System.out.println("number = " + number);
    }

}
