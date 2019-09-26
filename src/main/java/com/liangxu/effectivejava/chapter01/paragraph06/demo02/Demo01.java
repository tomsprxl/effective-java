package com.liangxu.effectivejava.chapter01.paragraph06.demo02;

/**
 * 描述:
 * 优先使用基本类型而不是装箱的基本类型，也要注意无意识的自动装箱。
 *
 * @author xuliang
 * @create 2019-09-26 13:34
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(sum());
    }


    // Hideously slow! Can you spot the object creation?
    private static long sum() {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }








}