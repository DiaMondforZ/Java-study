package com.itheima.Test3;

public class PpPlayer extends Player implements English{
    //构造方法
    public PpPlayer(){
        super();
    }
    public PpPlayer(String name, int age){
        super(name, age);
    }
    // 重写父类的方法以及接口方法
    @Override
    public void study(){
        System.out.println("学习打乒乓球");
    }
    @Override
    public void SpeakEnglish(){
        System.out.println("乒乓球运动员说英语");
    }
}
