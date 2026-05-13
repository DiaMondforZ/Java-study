package ooptest01;
//创建Student类继承Person类
public class Student extends Person{
    //设置学生的属性
    private String grade;
    //创建无参构造方法
    public Student(){}
    //创建有参构造方法
    public Student(String grade, String name, int age){
        super(name, age);
        this.grade = grade;
    }
    //创建getter和setter方法
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    //创建方法
    public void study(){
        System.out.println("学习");
    }
}

