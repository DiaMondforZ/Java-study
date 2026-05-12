/*成员方法
成员方法：类中行为，用来封装功能
格式：
修饰符 返回值类型 方法名(){
    方法体;
}*/
//无返回值方法返回值类型 void
package oop;

public class Day37 {
    public static void main(String[] args) {
        Student01 s = new Student01();
        s.study();
    }
}
class Student01{
    //成员变量
    String name;
    int age;
    //成员方法
    public void study(){
        System.out.println("学习");
    }
}
