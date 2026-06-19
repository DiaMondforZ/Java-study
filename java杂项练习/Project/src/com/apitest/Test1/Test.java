package com.apitest.Test1;
//导包
/*不需要导包的情况
1.使用本包下的类不需要导包
2.使用java.lang包下的类不需要导包
*/

import java.util.Random;

public class Test {
    static void main(String[] args) {
        //查询API文档，使用Random类中获取随机小数的方法
        //创建Random对象
        Random r = new Random();
        //使用nextDouble()方法，获取随机小数
        double num1 = r.nextDouble();
        System.out.println(num1);
        //使用nextDouble(bound)方法，设置最大结束范围
        double v = r.nextDouble(1.9);
        System.out.println(v);
        //使用nextDouble(start,end)方法，设置开始和结束范围
        double v1 = r.nextDouble(1.0, 2.0);
        System.out.println(v1);
    }
}
