package oop_interface.Test1;

public class Rabbit extends Animal{
    //构造方法
    public Rabbit() {
        super();
    }
    public Rabbit(String name, String color) {
        super(name, color);
    }
    //父类方法重写
    @Override
    public void eat() {
        System.out.println("吃胡萝卜");
    }
}
