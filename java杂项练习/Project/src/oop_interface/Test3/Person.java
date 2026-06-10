package oop_interface.Test3;

public class Person {
    private String name;
    private int age;

    public void Person(){}
    public void Person(String name, int age){
        this.name = name;
        this.age = age;
    }

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
    public void show(){
        System.out.println("姓名是"+name+"，年龄是"+age);
    }
}
