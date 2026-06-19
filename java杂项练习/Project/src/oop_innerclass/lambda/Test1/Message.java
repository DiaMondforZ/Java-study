package oop_innerclass.lambda.Test1;
//定义函数式接口Message（lambda的前提）
public interface Message {          //接口默认方法 public abstract
    //唯一抽象方法：发送消息
    //等价于public abstract void send();
    void send(String name);
}
