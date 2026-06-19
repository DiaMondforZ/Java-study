package com.string.Test3;

public class Test {
    public static void main(String[] args) {
        /*
        public String substring(int beginIndex,int endIndex);	截取指定范围（左闭右开区间）
        public String substring(int beginIndex);				截取到末尾

        需求:只保留用户的第一个字符，后面用***代替
        */
        //练习：charAt（） 方法
        String username1 = "zhangsan";
        char c = username1.charAt(0);
        String name1 = c + "***";
        System.out.println(name1);
        //使用substring（）方法
        String username2 = "lisi";
        String n = username1.substring(0,1);
        String name2 = n + "***";
        System.out.println(name2);
    }
}
