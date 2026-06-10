package com.itheima.Test4;

public class Test {
    static void main(String[] args) {
        /*接口中的默认方法：
        作用：为了接口升级而存在的
        格式：public default 返回值类型 方法名称(参数列表){}

        注意事项：
        1.默认方法不是抽象方法，所以不强制被重写，如果被重写，重写的时候去掉default关键字
        2.public可以省略，default不能省略
        3.如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写*/
        Interlmpl i = new Interlmpl();
        i.method1();
        i.method1();
        //接口中的默认方法，必须通过 实现类的对象 来调用！
        //不能直接用 接口名 调用！
        i.method3();
    }
}
