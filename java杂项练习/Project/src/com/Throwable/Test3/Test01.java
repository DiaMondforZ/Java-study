package com.Throwable.Test3;

public class Test01 {
    public static void main(String[] args) {
        try{
            calc();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("....................");
    }
    public static int calc() throws ArithmeticException{
        int a = 10;
        int b = 0;
        if (b == 0){
            throw new ArithmeticException("除数为0，不能运算...");
        }
        int c = a/b;
        return c;
    }
}
