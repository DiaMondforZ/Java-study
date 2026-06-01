//有参构造
//作用：创建对象同时直接给成员变量赋值
//一旦定义有参构造，则无参构造方法就没有了
package oop;
public class Day42 {
    public static void main(String[] args) {
        Student04 s = new Student04("王五",20);//创建对象并赋值
        s.show();//调用方法
    }
}
class Student04{
    //成员变量
    private String name;
    private int age;
    //有参构造方法
    public Student04(String n,int a){
        name = n;
        age = a;
    }
    public void show(){     //成员方法
        System.out.println(name+","+age);
    }
}