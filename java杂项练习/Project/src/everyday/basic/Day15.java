//使用步骤
//① 导包：import java.util.Scanner;
//② 创建对象：Scanner sc = new Scanner(System.in);
//③ 接收数据：sc.nextInt() 接收整数
package basic;
import java.util.Scanner;
public class Day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = sc.nextInt();
        System.out.println("你输入的是："+n);
    }
}
