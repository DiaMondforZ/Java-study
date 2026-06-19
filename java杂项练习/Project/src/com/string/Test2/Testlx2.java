package com.string.Test2;

public class Testlx2 {
    static void main(String[] args) {
        /*定义一个方法，把int数组中的数据按照指定格式拼接成一个字符串放回
        * 调用该方法，并在控制台输出结果
        * 如：数组为int[] arr = {1，2，3}
        * 执行方法后输出结果为：[1，2，3]*/
        int[] arr = {1,2,3};
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                s = s + arr[i] + "]";
            }else {
                s = s + arr[i] + ",";
            }
        }
        System.out.println(s);
    }
}
