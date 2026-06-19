package com.string.Test2;
import java.util.Scanner;
public class Test2 {
    static void main(String[] args) {
        /*
        public char charAt(int index)根据索引返回字符
        public int length（）：返回此字符串的长度

        需求：键盘录入一个字符，使用程序实现在控制台遍历该字符串*/

        //charAt和length方法
        String s1 = "abcdefg";
        char c = s1.charAt(5);
        System.out.println(c);
        int length = s1.length();
        System.out.println(length);
        //键盘录入
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入一个字符：");
        String s = sc.next();
        //遍历字符串快速生成方式s.length().fori
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            System.out.println(c1);
        }
    }
}
