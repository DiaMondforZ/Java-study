/*数组元素求和
* 定义求和变量 sum = 0
遍历数组，累加每个元素
循环结束输出总和 */
package array;

public class Day33 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int sum = 0;
        for (int i = 0;i <= arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
