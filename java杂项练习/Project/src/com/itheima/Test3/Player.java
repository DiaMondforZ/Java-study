package com.itheima.Test3;

public abstract class Player extends Person{
    //构造方法
    public Player(){
        super();
    }
    public Player(String name, int age){
        super(name, age);
    }
    //抽象方法
    public abstract void study();
}
