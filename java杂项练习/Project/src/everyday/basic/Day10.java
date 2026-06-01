//自动转换：小类型 → 大类型 自动完成
//强制转换：大类型 → 小类型，需要手动强转
//强转格式:目标类型 变量 = (目标)原数据;
package basic;

public class Day10 {
    public static void main(String[] args) {
        double d = 3.99;
        int num = (int) d;
        System.out.println(num);
    }
}
