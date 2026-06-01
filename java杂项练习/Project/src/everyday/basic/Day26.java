//嵌套循环
//循环里面再写循环，外层循环控制行数，内层控制列
//执行规则：外循环一次，内循环全部跑完
package basic;

public class Day26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++){}
            System.out.println("*");
        }
        System.out.println();
    }
}
