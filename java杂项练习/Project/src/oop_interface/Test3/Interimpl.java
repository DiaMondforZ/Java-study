package oop_interface.Test3;

//继承必须在接口前面
public class Interimpl extends Person implements Inter1, Inter2{
    //一个类如果实现了接口，那么这个类必须实现接口中的所有抽象方法
    //注意：1.如果父类Person也是一个抽象类的话，那么在子类当中，需要把所有抽象方法都进行抽象，要么子类本身也是一个抽象类
//           2.如果重写时出现了重复的抽象方法，此时我们只要重写一遍就可以了，因为抽象方法重写时，会自动加上@Override
    @Override
    public void method1() {}
    @Override
    public void method2() {}
    @Override
    public void function1() {}
    @Override
    public void function2() {}
}
