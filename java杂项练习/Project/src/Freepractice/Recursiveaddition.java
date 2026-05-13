package Freepractice;

public class Recursiveaddition {
    public int add(int n) {
        // 递归方法
        // 设置递归结束条件
        if (n == 1)
            return 1;
        else
            return n + add(n - 1);
    }
    public static void main(String[] args) {
        Recursiveaddition r = new Recursiveaddition();
        System.out.println(r.add(5));
    }
}
