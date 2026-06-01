//this关键字
//this代表当前对象
//this（参数）；调用任意构造方法是必须写在方法的开头
//this.成员变量：区分局部变量和成员变量
//成员变量 ：写在类里、方法外
//局部变量：写在方法、代码块、括号内部
//this(...)：本类中调用其他构造方法
package oop;
public class Day43 {
    public static void main(String[] args) {
        Student05 s = new Student05("张三");//创建对象
        s.show();//调用方法
    }
}
class Student05{
    //成员变量
    private String name;
    //有参构造方法
    public Student05(String name){
        this.name = name;
    }
    //方法
    public void show(){
        System.out.println(name);
    }
}