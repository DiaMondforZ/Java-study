package com.itheima.Test4;

public interface InterA {
    public abstract void method1();
    public abstract void method2();
    //新增的默认方法（检查未重写的实现类中是否报错）
    public default void method3(){
        System.out.println("InterA接口中新增的默认方法");
    }
}
