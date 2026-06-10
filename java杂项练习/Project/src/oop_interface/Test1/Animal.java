package oop_interface.Test1;

public abstract class Animal {
    //属性
    private String name;
    private String color;
    //构造方法
    public Animal(){}
    public Animal(String name,String color){
        this.name = name;
        this.color = color;
    }
    //getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //方法
    public abstract void eat();
}
