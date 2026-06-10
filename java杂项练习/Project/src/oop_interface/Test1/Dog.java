package oop_interface.Test1;

public class Dog extends Animal implements Swim{
    //构造方法
    public Dog(){
        super();
    }
    public Dog(String name,String color){
        super(name,color);
    }
    //父类方法重写
    @Override
    public void eat(){
        System.out.println("吃骨头");
    }
    //接口独有的swim方法实现
    public void swim(){
        System.out.println("狗刨");
    }
}
