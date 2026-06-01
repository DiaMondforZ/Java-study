/*循环控制 break & continue
break：跳出当前循环 /switch，直接结束
continue：跳过本次循环，直接进入下一次   */
package basic;

public class Day25 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
