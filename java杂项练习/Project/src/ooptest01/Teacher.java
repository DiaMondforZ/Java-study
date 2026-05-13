package ooptest01;
//创建Teacher类继承Person类
public class Teacher extends Person {
    //设置老师的属性
    private String Subject;
    //创建无参构造方法
    public Teacher() {}
    //创建有参构造方法
    public Teacher(String Subject, String name, int age) {
        super(name, age);
        this.Subject = Subject;
    }
    //创建getter和setter方法
    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
    //创建方法
    public void teach() {
        System.out.println("老师教东西");
    }
}
