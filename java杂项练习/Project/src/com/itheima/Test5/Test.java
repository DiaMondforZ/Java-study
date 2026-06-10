package com.itheima.Test5;

public class Test {
    static void main(String[] args) {
        /*接口中的静态方法：
        作用：为了接口升级而存在
        格式：public static 返回值类型 方法名（参数列表）{}
        注意事项：
        1.静态方法只能通过接口名字调用，不能通过实现类名或者对象名字调用
        2.public可以省略，static不能省略*/
        Inter.method();


        //接口中的static静态方法不能通过实现类名调用
//        InterImpl.method();


        //接口中的static静态方方法不能通过对象名调用
//        InterImpl ii = new InterImpl();
//        ii.method();
    }
}
