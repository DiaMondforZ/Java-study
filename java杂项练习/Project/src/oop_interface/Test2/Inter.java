package oop_interface.Test2;

public interface Inter {
//    成员变量：只能是常量 默认修饰符：public static final
    public static final int a = 10;//可以省略

//    构造方法：没有
//    因为接口不能创建对象，而且接口里面所有的成员变量默认都是public static final修饰的常量，所以接口里面不能定义构造方法
//    public void Interf(){}

    //成员方法：只能是抽象方法 默认修饰符：public abstract
    //jdk1.8以后接口中的成员方法默认是public abstract修饰的
//    void method();
}
