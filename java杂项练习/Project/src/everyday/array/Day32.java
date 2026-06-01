/*  数组常见异常&最值
* 数组索引越界异常：ArrayIndexOutOfBoundsException
* 原因：访问了不存在的索引
求数组最值思路：
* 定义参照物（数组第一个元素）
* 遍历逐个比较，更新最值*/
package array;

public class Day32 {
    public static void main(String[] args) {
        int[] arr = {22,55,11,88,33};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
