package oop_innerclass.Test4;

public class Outer {
    int b = 20;
    public void show(){
        int a = 10;
        //局部内部类
        class Inner{
            String name;
            int age;
            public void show1(){
                //局部内部类可以访问外部类的成员变量和成员方法
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的show1方法");
            }
            public static void show2(){
                System.out.println("局部内部类中的show2静态方法");
            }
        }
        //在方法中创建局部内部类对象，调用局部内部类中的属性和方法
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.show1();
        Inner.show2();
    }
}
