//基础赋值：=
//复合赋值：+= -= *= /= %=
//作用：自身数值运算后，重新赋值给本身
//示例：
//a += 2 等价于 a = a + 2
package basic;

public class Day09 {
    public static void main(String[] args) {
        int a = 10;
        a += 5;
        System.out.println(a);

        int b = 20;
        b %= 3;
        System.out.println(b);
    }
}
