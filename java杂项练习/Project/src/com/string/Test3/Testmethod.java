package com.string.Test3;

public class Testmethod {
    public static void main(String[] args) {
        /*
        public String substring(int beginIndex,int endIndex);	截取指定范围（左闭右开区间）
	    public String substring(int beginIndex);				截取到末尾

	    需求:只保留用户的第一个字符，后面用***代替
	*/
        String str = "abcdefg";
        //使用substring方法后在输出需要创建一个新的字符串，不能改变原字符串
        String str1 = str.substring(0,5);
        System.out.println(str1);
        //如果substring方法直接写在输出语句中，则返回值会自动转换成字符串
        System.out.println(str.substring(0,3));//0,1,2
        //从索引开始截取到末尾
        System.out.println(str.substring(1));

    }
}
