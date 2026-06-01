/*  二维数组基础
* 二维数组：数组里存数组
静态初始化：int[][] arr = {{1,2},{3,4}};
外层存一维数组，内层存元素 */
package array;

public class Day34 {
    public static void main(String[] args) {
        int[][] arr = {{11,22},{33,44}};
        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
    }
}
