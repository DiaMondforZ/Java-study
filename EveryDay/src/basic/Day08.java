package basic;

//++ 作用：让变量值 +1
//两种写法
//后自增：a++ 先用值，再加 1
//前自增：++a 先加 1，再用值
public class Day08 {
    public static void main(String[] args) {
        int num = 5;
        num++;
        System.out.println(num);
        int a = 10;
        ++a;
        System.out.println(a);
    }
}
