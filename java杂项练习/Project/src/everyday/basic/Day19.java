package basic;


public class Day19 {
    public static void main(String[] args) {
        int score = 95;
        if (score >= 60) {
            if (score >= 90) {
                System.out.println("及格且优秀");
            } else {
                System.out.println("及格");
            }
        } else {
            System.out.println("不及格");
        }
    }
}