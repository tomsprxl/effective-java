package com.liangxu.effectivejava.chapter01.paragraph03.demo03;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-26 11:09
 */
public enum Student {

    XIAO_HONG("hell", 27),
    XIAO_HEI("Hei", 28);

    private String name;
    private Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student xiaoHong = Student.XIAO_HONG;
        Student xiaoHong1 = Student.XIAO_HONG;
        System.out.println(xiaoHong == xiaoHong1);
    }




}