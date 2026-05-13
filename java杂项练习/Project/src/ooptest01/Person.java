package ooptest01;

public class Person {
    // 设置父类的所有属性并私有化
    private String name;
    private int age;
    // 设置父类无参构造方法
    public Person() {}
    // 设置父类有参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 设置父类所有属性的getter和setter方法
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
    // 设置父类所有属性的方法：吃饭、睡觉
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }
}
