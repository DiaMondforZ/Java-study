package oop_polymorrhic;

public class Test {
    public static void main(String[] args) {
    /*
    学生类：
        属性：姓名，账号，密码
        行为：work：学生的工作是学习
老师类：
        属性：姓名，账号，密码
        行为：work：老师的工作是教书
管理员：
        属性：姓名，账号，密码
        行为：work：管理员的工作是管理网站
学生管理系统：
        行为：注册register
        要求：能注册所有的角色
        输出：姓名为张三的同学注册成功，账号zhangsan，密码123456
        */
        //创建学生对象
        Student stu = new Student("张三", "zhangsan", "123456");
        //创建学生管理对象
        StudentManger sm = new StudentManger();
        //把stu注册到学生管理系统当中
        sm.register(stu);
    }

}
//多态的条件：继承、重写、向上转型（父类引用指向子类对象）