//封装&private关键字
/*封装：隐藏成员变量，对外提供访问方式
private：私有修饰，仅本类内可访问
私有变量，配合 get/set 方法赋值、取值*/
package oop;
public class Day40 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("张三");
        System.out.println(p.getName());
    }
}
//创建Rerson类
class Person{
    //成员变量
    private String name;
    private int age;
    //封装
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}