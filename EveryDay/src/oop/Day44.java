/*static 静态关键字
//被static修饰的成员变量，被该类内所有对象共享
* 静态属于类，不属于对象
调用方式：类名调用（推荐）、对象名调用
静态内容优先加载，优先于对象*/
package oop;
public class Day44 {
    public static void main(String[] args) {
        System.out.println(Person02.school); //访问静态变量
    }
}
class Person02{
    public static String school = "..学校"; //创建静态变量
}
/*
总结：静态只能调用静态，非静态可以调用所有，静态方法无this*/
