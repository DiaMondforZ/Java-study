package com.itheima.Test3;

public abstract class Person {
    //属性
    private String name;
    private int age;
    //构造方法
    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //获取属性
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
