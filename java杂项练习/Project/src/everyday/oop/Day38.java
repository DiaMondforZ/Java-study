//方法带参数
//格式：public static void 方法名(参数类型 参数名){}
package oop;
public class Day38 {
    public static void main(String[] args) {
        Student02 s = new Student02();
        //调用方法传入的数据叫实参
        s.sayHello("张三");
    }
}
class Student02{
    //定义方法时的变量是形参
    public void sayHello(String name){
        System.out.println("hello"+name);
    }
}
