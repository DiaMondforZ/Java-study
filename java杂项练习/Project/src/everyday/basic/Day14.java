//优先级大致：
//算术 > 比较 > 逻辑 > 三元 > 赋值
//小括号 () 优先级最高，优先运算
//短路特点：
//&& 左边为 false，右边不执行
//|| 左边为 true，右边不执行
package basic;

public class Day14 {
    public static void main(String[] args) {
        int num = 10;
        boolean res = num+5>12 && num<20;
        System.out.println(res);
    }
}
