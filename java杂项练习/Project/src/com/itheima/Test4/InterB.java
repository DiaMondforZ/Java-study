package com.itheima.Test4;

public interface InterB {
    //同名的接口方法
    public default void method3(){
        System.out.println("InterB接口中新增的默认方法");
    }
}
