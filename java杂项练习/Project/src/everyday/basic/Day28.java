/*  随机数 Random
导包：import java.util.Random;
创建对象：Random r = new Random();
生成随机整数：r.nextInt(数字);
范围：0 ~ 数字-1     */
package basic;
import java.util.Random;
public class Day28 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println(num);

    }
}
