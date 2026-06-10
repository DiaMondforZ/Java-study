package com.itheima.Test1;

public class Test {
    static void main(String[] args) {
        //创建对象
        Person p = new Person("小米", 18, "男");
        //访问属性
        System.out.println(p.getName()+p.getAge()+p.getGender());
        //创建自行车和汽车对象
        Bicycle b = new Bicycle("cycle", 10);
        p.drive(b);
        Car c = new Car("car", 120);
        p.drive(c);
    }
}
