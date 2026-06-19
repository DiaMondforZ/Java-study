package com.string.Test2;
import java.util.Scanner;
public class Testlx1 {
    static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中的大小写字母和数字出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9'){
                count++;
            }else if (c >= 'a' && c <= 'z'){
                count1++;
            }else if (c >= 'A' && c <= 'Z'){
                count2++;
            }else {
                break;
            }
        }
        System.out.println("数字出现的次数为："+count);
        System.out.println("字母出现的次数为："+count1);
        System.out.println("大写字母出现的次数为："+count2);
    }
}
