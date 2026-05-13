package ooptest01;
//创建UndergraduateStudent类继承Student类
public class UndergraduateStudent extends Student{
    //创建无参构造方法
    public UndergraduateStudent(){}
    //创建有参构造方法
    public UndergraduateStudent(String grade, String name, int age){
        super(grade, name, age);
    }
    //重写study方法
    public void study(){
        System.out.println("本科正在学习本科内容");
    }
}
