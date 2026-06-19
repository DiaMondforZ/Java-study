package com.Throwable.Test3;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("结果："+test()); // 2
    }
    public static int test() {
        int x = 1;
        try {
            x++;
            return x;//return 2
        }finally {
            //在finally中是改变不了返回结果的
            ++x;
            System.out.println(x);// 3
        }
    }
}
