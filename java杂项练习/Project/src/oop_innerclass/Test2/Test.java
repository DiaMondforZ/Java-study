package oop_innerclass.Test2;

public class Test {
    static void main(String[] args) {
        /*
           编写成员内部类的注意点：
           1.成员内部类可以被一些修饰符所修饰，比如：private，默认，protected，public，static等
           2.在成员内部类里面，JDK16之前不能定义静态变量，JDK16以后才可以定义静态变量
           获取成员内部类对象的两种方式
           1.外部类编写方法，对外提供内部类对象（private修饰时）
           2.直接创建
           格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象
           如：Outer.Inner oi = new Outer().new Inner();*/

        //链式编程(直接调用成员变量)
        System.out.println(new Outer().name);

        //创建内部类的对象（如果是private修饰的就不能直接创建内部类对象）
//        Outer.Inner oi = new Outer().new Inner();
//        oi.show();

        //对外提供内部类对象后获取对象
        Outer o = new Outer();
        //方法一
        Object inner = o.getInstance();
        //方法二
        System.out.println(o.getInstance());
//注：当外部类成员变量和内部类成员变量重名时，在内部类访问如下
//        System.out.println(Outer.this.变量名);
    }
}
