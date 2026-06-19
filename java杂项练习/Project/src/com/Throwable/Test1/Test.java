package com.Throwable.Test1;

public class Test {
    public static void main(String[] args) {
        int i = 10;
        //java.lang.ArithmeticException
        System.out.println(i/0);
        String str = null;
        //java.lang.NullPointerException
        System.out.println(str.length());
    }
}
