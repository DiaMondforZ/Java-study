package com.Throwable.Test3;

public class Test02 {
    static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
        }catch (Exception e){
            System.out.println("除数不能为0");
        }finally {
            //只要程序进入执行了try块，就会执行finally块，前提是没有执行System。exit()且不能执行到return
            System.out.println("finally。。。。");
        }
        System.out.println("程序继续执行");
    }
}
