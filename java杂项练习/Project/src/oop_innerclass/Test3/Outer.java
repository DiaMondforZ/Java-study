package oop_innerclass.Test3;

public class Outer {
     /*int a = 10;
     static int b = 20;*/
    //创建静态内部类
    static class Inner{
        public void show1(){
            System.out.println("非静态方法");
            //创建外部类的对象后可以访问外部类的成员变量和成员方法
            /*Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);  同下可直接调用*/
        }
        public static void show2(){
            System.out.println("静态方法");
            //静态只能访问静态：静态内部类只能访问外部类的静态变量和静态方法
//            System.out.println(a);
//            System.out.println(b);  静态类可以直接调用
        }
    }
}
