//构造方法：类中定义方法，用来创建对象
/*构造方法：创建对象时自动调用
//创建对象用new关键字时候自动调用构造
特征：
方法名和类名完全相同
没有返回值类型
作用：给对象成员变量初始化*/
package oop;
public class Day41 {
    public static void main(String[] args) {
        Student03 s = new Student03();
    }
}
class Student03{
    private String name;
    public Student03(){
        System.out.println("无参构造方法");
    }
}
