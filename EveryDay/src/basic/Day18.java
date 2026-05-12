//if(条件1){
//代码1
//}else if(条件2){
//代码2
//}else{
//兜底代码
//}
package basic;

public class Day18 {
    public static void main(String[] args) {
        int score = 85;
        if(score >= 90){
            System.out.println("优秀");
        }else if(score >= 80){
            System.out.println("良好");
        }else if(score >= 60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
}