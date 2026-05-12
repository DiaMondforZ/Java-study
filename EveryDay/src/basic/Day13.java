//格式：
//条件 ? 表达式1 : 表达式2;
//执行规则：
//条件为 true → 执行表达式 1
//条件为 false → 执行表达式 2
package basic;

public class Day13 {
    public static void main(String[] args) {
        int a = 15;
        int b = 8;
        int max = a>b?a:b;
        System.out.println(max);
    }
}
