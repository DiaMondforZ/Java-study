package com.string.Test2;
import java.util.Scanner;
public class Test {
    static void main(String[] args) {
        /* boolean equals方法（要比较字符串）结果完全一样才为 true反之为 false
        * Boolean equalsIgnoreCase（要比较的字符串）忽略大小写的比较
        *
        * 练习：已知正确的用户名和密码，请用程序实现模拟用户登录
        * 三次机会，登录后给出相应提示*/

        //equals方法和equalsIgnoreCase方法
        String username = "admin";
        String username1 = "admin";
        String username2 = "admin1";
        System.out.println(username.equals(username1));// true
        System.out.println(username.equalsIgnoreCase(username2));// false
        String password = "123456";
        //用户键盘录入登录的用户名和密码
        Scanner sc = new Scanner(System.in);
        //判断用户输入的登录名和密码是否正确
        for (int i = 1; i <= 3; i++) {
            //循环键盘录入用户名和密码并判断3次
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();

            boolean b = username.equals(name) && password.equals(pwd);
            if (b == true) {
                System.out.println("登录成功！");
                //登录成功后跳出循环
                break;
            } else {
                //如果登录失败，循环继续，总共有三次机会
                if (i <= 2){
                    System.out.println("登录失败，还剩"+(3-i)+"次机会，请重新输入！");
                }else {
                    System.out.println("登录失败，已无登录机会！");
                }
            }
        }
    }
}
/*使用== 判断字符串是否相等时
        1.基本数据类型比较的时数据值
        2.引用数据类型比较的是内存地址值*/