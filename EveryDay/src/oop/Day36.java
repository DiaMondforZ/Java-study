/* 面向对象基础
* 面向对象：封装、继承、多态 三大核心
类：事物的模板 / 抽象描述
对象：类的具体实例
关系：先定义类，再创建对象
*  类与对象标准写法：public class 类名{}
*/
package oop;

public class Day36 {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //赋值
        s.name = "张三";
        s.age = 18;
        //取值
        System.out.println(s.name);
        System.out.println(s.age);
    }
}
//类的标准写法
class Student{           //学生类
    //成员变量
    String name;
    int age;
}
