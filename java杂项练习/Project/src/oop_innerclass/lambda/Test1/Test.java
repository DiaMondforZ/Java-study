package oop_innerclass.lambda.Test1;
//测试类
public class Test {
    /*
    lambda表达式用于快速实现“只有一个抽象方法的接口”（函数式接口）替代繁琐的匿名内部类写法
    前提：函数式接口
    定义：接口中只有一个抽象方法（可以有默认方法和静态方法）
    注解：@FunctionalInterface（可选，加了之后编译器会强制检查）
    */
    public static void main(String[] args){
        /*多态写法：父接口引用指向子类对象
        Message email = new Email();
        调用通用的发送消息方法
        sendMessage(email);
        Message sms = new Sms();
        sendMessage(sms);*/

        //用lambda表达式
        //当只有一条输出语句时可以省略 {}，反之需{}
        sendMessage(name -> System.out.println("发送短信给"+ name));
    }
    //通用方法：接收欧任何实现了Message接口的对象
        static void sendMessage(Message message){
        //动态绑定：运行时会调用实际子类的send（）方法
        message.send("张三");
        }
}
