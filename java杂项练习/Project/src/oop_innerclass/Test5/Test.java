package oop_innerclass.Test5;

public class Test {
    static void main(String[] args) {
        /*
        匿名内部类：（没有名字的内部类）
        作用：在继承一个类或者实现一个接口时少些一个文件，也是lambda的前置知识点
        格式：new 类名或接口名（）{
                重写方法；
            }
        传统方式调用goSwimming方法
        新建Student类（实现，重写方法），并创建Student对象
        Student s = new Student();
        调用方法
        goSwimming(s);*/

//        要求：在测试类中调用下面的goSwimming方法
            Swim s = new Swim(){
                @Override
                public void swim() {
                    System.out.println("匿名内部类");
                }
            };//此时接口中有几个抽象方法就需要在匿名内部类中重写几个方法
            goSwimming(s);
    }



    public static void goSwimming(Swim s){
        s.swim();
    }
}
//完整的匿名内部类=没有名字的java类+实现接口/继承类+重写方法+创建对象
