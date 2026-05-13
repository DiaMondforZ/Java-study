package Freepractice;

import java.util.Scanner;

public class SequentialProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("确认最终乘数："+num);
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        System.out.println("结果为："+sum);
    }
}
