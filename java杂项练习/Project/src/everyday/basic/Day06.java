package basic;

//常量：值一旦定义，不能修改
//定义关键字：final
//标准格式：final 数据类型 常量名 = 初始值;
//规范：常量名全部大写，多个单词用下划线分隔
//注意：final 常量必须直接赋值，不能后期再改
/*特点：只能赋值一次，数据不可变、名字大写多个单词下划线隔开
 * 可以修饰：变量、类、方法/修饰变量时叫做常量*/
public class Day06 {
    public static void main(String[] args) {
        final double PI = 3.14;
        final int MAX_NUM = 999;
        System.out.println(PI);
        System.out.println(MAX_NUM);
    }
}
