package com.string.Test1;

public class Test {
    static void main(String[] args) {
        /*第一种：直接赋值
        第二种：new 关键字
        public String（）   空白字符串，不含任何内容
        public String（String original） 根据传入的字符串，创建新的字符串对象
        public String（char[] chs）  根据字符数组，创建字符串对象
        public String（byte[] chs）  根据字节数组，创建字符串对象*/

        //直接赋值
        String s = "abc";
        System.out.println(s);

        //new+构造方法的方式创建字符串对象
        //new+空参构造
        String s1 = new String();
        System.out.println("--"+s1+"@@");// ""

        //new+有参构造
        //根据传入的字符串内容，创建一个新的字符串对象
        String s2 = new String("hello");//直接传入字符串
        System.out.println(s2);
        String s3 = new String(s);//传入字符串对象
        System.out.println(s3);

        //new+有参构造（字符数组）
        char[] chs = {'a', 'b', 'c'};
        String s4 = new String(chs);//abc

        //new+有参构造（字节数组）
        byte[] bytes = {97, 98, 99};
        String s5 = new String(bytes);
        System.out.println(s5);//根据传入的字节数组，转换成ASCLL码值对应的字符

        //内存解析：
        /*直接赋值：代码简单+串池复用（双引号直接赋值时会检查串池）
        * 不存在：创建新的地址值
        * 存在：直接复用传入相同的地址值
            new：每次都会创建一个新的字符串对象*/
    }
}
