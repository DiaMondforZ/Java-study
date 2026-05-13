package ooptest01;
//创建MasterStdent类继承Student类
public class MasterStdent extends Student{
    //创建无参构造方法
    public MasterStdent(){}
    //创建有参构造方法
    public MasterStdent(String grade, String name, int age){
        super(grade, name, age);
    }
    //重写study方法
    public void study(){
        System.out.println("硕士研究生正在学习自己的内容");
    }

    @Override
    public void sleep() {
        System.out.println("硕士研究生住宿条件升级，在公寓睡觉");
    }
}
