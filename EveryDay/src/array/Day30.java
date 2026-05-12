/*      数组动态初始化
动态初始化：只指定长度，不指定元素
格式：数据类型[] 数组名 = new 数据类型[长度];
默认值规则：
int→0 double→0.0 boolean→false 引用类型→null    */
package array;

public class Day30 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 66;
        System.out.println(arr[0]);
        System.out.println(arr[1]);//默认0
        System.out.println(arr.length);
    }
}
