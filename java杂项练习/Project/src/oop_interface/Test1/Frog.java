package oop_interface.Test1;

public class Frog extends Animal implements Swim{
    //构造方法
    public Frog() {
        super();
    }
    public Frog(String name, String color) {
        super(name, color);
    }
    //父类方法重写
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }
    //接口独有的swim方法实现
    public void swim(){
        System.out.println("蛙泳");
    }
}
