package com.Throwable.Test1;

public class Test02 {
    public static void main(String[] args) {
        /*
        * 当程序执行的时候出现了异常，那么Java虚拟机会帮助我们处理
        * 但会直接终止程序的运行*/
        System.out.println("第一行");
        int i = 10;
        try{
            //Exception e = new ArithmeticException();
            System.out.println(i/0); //System.exit();
        }catch (ArithmeticException e){
            System.out.println("除数为0");
        }/*catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){
            System.out.println("异常");
        }*/
        System.out.println("第二行");
    }
}
