//while循环格式
//初始化变量;
//while(判断条件){
//循环体;
//变量更新;
//}
//while是先判断，再执行
//while防止死循环需要添加变量更新
package basic;

public class Day22 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
