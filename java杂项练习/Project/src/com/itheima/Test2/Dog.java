package com.itheima.Test2;

public class Dog extends Animal{
    //构造方法
    public Dog(){}
    public Dog(String name,String color){
        super(name,color);
    }
    //抽象类独有方法重写
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
