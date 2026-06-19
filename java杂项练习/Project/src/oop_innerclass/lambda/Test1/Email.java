package oop_innerclass.lambda.Test1;
//第一个实现类Email：邮件发送
public class Email implements Message{
    //成员遍量：邮件地址
    String Email;
    //无参构造方法
    public Email(){}
    //重写接口的send（）方法，实现邮件发送逻辑
    @Override       //注解：强制检查重写是否正确
    public void send(String name){
        System.out.println("发送邮件");
    }
}
