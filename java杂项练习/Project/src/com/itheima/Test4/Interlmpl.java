package com.itheima.Test4;

public class Interlmpl implements InterA,InterB{
    //接口中的抽象方法重写
    @Override
    public void method1() {
        System.out.println("实现类重写抽象方法1");
    }
    @Override
    public void method2() {
        System.out.println("实现类重写抽象方法2");
    }
    //不同接口中存在重名的默认方法时必须重写
    @Override
    public void method3() {
        //调用接口InterA中的默认方法
//        InterA.super.method3();
        //调用接口InterA中的默认方法
//        InterB.super.method3();
        //调用自己新写的方法
        System.out.println("接口中重写的method3方法");
    }
}
