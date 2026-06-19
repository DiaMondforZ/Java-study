package com.Throwable.Test2;

public class Test02 {
    public static void main(String[] args) {
        try {
            calc();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("....................");
    }
    /*
    * 谁调用本方法，本方法就有可能抛出该异常
    * */
    public static int calc() throws ArithmeticException, NullPointerException{
        int a = 10;
        int b = 0;
        int c = a/b;
        return c;
    }
}
