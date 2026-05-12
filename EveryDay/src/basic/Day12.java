//常用逻辑运算符
//&& 逻辑与：两边都为 true，结果才 true
//|| 逻辑或：一边为 true，结果就 true
//! 逻辑非：取反
//特点：结果都是 true / false
//短路效果：&& 和 || 会短路执行
package basic;

public class Day12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a>5 && b<30);
        System.out.println(a>50 || b<30);
        System.out.println(!(a>b));
    }
}
