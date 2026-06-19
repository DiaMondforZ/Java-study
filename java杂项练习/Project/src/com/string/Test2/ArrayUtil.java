package com.string.Test2;

public class ArrayUtil {
    private ArrayUtil() {}

    //定义方法，把数组变成字符串进行返回
    public static String arrayToString(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s = s + arr[i] + "]";
            } else {
                s = s + arr[i] + ",";
            }
        }
        return s;
    }
}
