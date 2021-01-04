package com.mashibing.dp.flyweight;

public class TestString {
    public static void main(String[] args) {
        String s1 = "abc"; // "abc" 在常量池，只有一个
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s3 == s4); // false，地址不一样
        System.out.println(s3.intern() == s1); // .intern() 是常量，会去常量池里拿
        System.out.println(s3.intern() == s4.intern());
    }
}
