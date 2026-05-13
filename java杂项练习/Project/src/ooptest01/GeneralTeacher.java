package ooptest01;

public class GeneralTeacher extends  Teacher{
    public GeneralTeacher(){}
    public GeneralTeacher(String Subject, String name, int age){
        super(Subject, name, age);
    }
    public void teach(){
        System.out.println("老师正在教普通老师课程");
    }
}
