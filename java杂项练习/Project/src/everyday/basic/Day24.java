//三种循环区别 + 死循环
//区别
//for：适合已知循环次数
//while / do-while：适合未知循环次数
//do-while 至少执行 1 次
// for死循环
//for(;;){}
//for(初始化; 循环条件; 步进)
//第一个空：无初始化语句
//第二个空：不写条件 = 条件永远为 true
//第三个空：无步进语句
// while死循环
//        while(true){}
package basic;

public class Day24 {
    public static void main(String[] args) {
        while(true){
            System.out.println("死循环");
        }
    }
}
