//switch(表达式){
//        case 值1:
//代码1;
//        break;
//                case 值2:
//代码2;
//        break;
//default:
//兜底代码;
//        break;
//                }
//支持类型：byte、short、int、char、String、枚举
package basic;

public class Day20 {
    public static void main(String[] args) {
        int num = 2;
        switch (num){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            default:
                System.out.println("未知");
                break;
        }
    }
}
