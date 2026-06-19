package com.string.Test4;

public class Testmethod {
    public static void main(String[] args) {
        /*
         String repalace(旧值，新值) 替换
         注意：替换后的字符串会返回，替换前的字符串不会改变（只有返回值才是替换后的结果）
        */
        String s = "hello world";
        String s1 = s.replace("hello", "HELLO");
        System.out.println(s1);
        System.out.println(s);
    }
}
