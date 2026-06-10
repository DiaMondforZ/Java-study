package com.itheima.Test3;

public class LqCoath extends coath{
    //构造方法
    public LqCoath() {
    }
    public LqCoath(String name, int age) {
        super(name, age);
    }
    //重写方法
    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
