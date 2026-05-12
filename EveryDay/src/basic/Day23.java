/*do-while 循环
格式
初始化;
    do{
        循环体;
        更新;
}while(条件);
特点：先执行，后判断，至少执行一次*/
package basic;

public class Day23 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
