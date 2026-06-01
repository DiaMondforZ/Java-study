//有返回值方法
//格式：
//public 返回值类型 方法名(){
//    return 数据;        //return：结束方法，并返回结果
//}
//无返回值时使用 void
package oop;

public class Day39 {
    public static void main(String[] args) {
        Calc c = new Calc();
        int sum = c.getsum(10, 20);
        System.out.println(sum);
    }

}
class Calc{
    //求和方法，带返回值
    public int getsum(int a,int b){
        return a+b;
    }
}