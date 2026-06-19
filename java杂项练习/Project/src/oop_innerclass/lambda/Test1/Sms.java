package oop_innerclass.lambda.Test1;
//第二个实现类：短信发送
public class Sms implements Message{
    //成员变量：手机号
    String phoneNumber;
    //无参构造方法
    public Sms(){}
    //重写seng（）方法，实现短信发送逻辑
    @Override
    public void send(String name){
        System.out.println("发送Sms");
    }
}
