package com.itheima.Test3;

public class LqPlayer extends Player{
    //构造方法
    public LqPlayer() {
    }

    public LqPlayer(String name, int age) {
        super(name, age);
    }
    // 重写父类的方法以及接口的方法
    @Override
    public void study() {
        System.out.println("学习打篮球");
    }
}
