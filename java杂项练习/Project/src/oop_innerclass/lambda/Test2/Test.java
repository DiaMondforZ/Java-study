package oop_innerclass.lambda.Test2;

public class Test {
    public static void main(String[] args) {
        Message mes1 = (name -> System.out.println("发送邮件给"+ name));
        mes1.send("张三");
    }
}
