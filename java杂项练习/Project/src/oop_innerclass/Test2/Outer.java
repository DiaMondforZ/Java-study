package oop_innerclass.Test2;

public class Outer {
    String name;
    private class Inner{
        public void show(){
            System.out.println("show()方法");
        }
    }
    //外部类编写方法，对外提供内部类的对象（被private修饰的）
    public Inner getInstance(){
        return new Inner();
    }
}

