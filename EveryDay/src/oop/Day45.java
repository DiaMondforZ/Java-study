/*继承
*继承关键字：extends
父类：通用模板，子类：扩展子类
作用：代码复用
* 格式：
* class 子类名 extends 父类名{}
* */
package oop;
public class Day45 {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财");
        dog.eat();
        dog.bark();
    }
}
//父类：动物类
class Animal{
    //成员变量
    String name;

    //父类构造方法
    public Animal(String name){
        this.name = name;
    }

    //父类普通方法
    public void eat(){
        System.out.println(name+"正在吃。。。");
    }
}
//子类：狗类
class Dog extends Animal {
    //子类构造方法
    public Dog(String name){
        //调用父类构造方法
        super(name);//super（）：调用父类构造方法
    }
    public void bark(){
        System.out.println(name+"正在汪汪汪。。。");
    }
}
//继承中成员访问
/*
就近原则：局部 → 本类成员 → 父类成员
super：访问父类成员
总结：java只能单继承，不支持多继承，但支持多层继承
所有的类都直接或者间接的继承于java.lang.Object类
*/