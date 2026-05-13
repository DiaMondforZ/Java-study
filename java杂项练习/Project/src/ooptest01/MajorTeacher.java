package ooptest01;
//创建专业老师类继承老师类
public class MajorTeacher extends  Teacher{
    //创建无参构造方法
    public MajorTeacher(){}
    //创建有参构造方法
    public MajorTeacher(String Subject, String name, int age){
        super(Subject, name, age);
    }
    //创建方法
    public void Teach(){
        System.out.println("老师正在传授专业课知识");
    }
}
