//带有继承结构的标准javabean类的测试
//书写一个完整的继承体系，要求私有化成员变量、getter\setter方法、无参构造方法、有参构造方法和其他成员方法
package ooptest01;

public class Test {
    public static void main(String[] args) {
        //创建本科学生类的对象
        UndergraduateStudent us = new UndergraduateStudent("大一", "张三", 18);
        //使用getter方法获取属性值
        System.out.println(us.getName()+","+us.getAge()+","+us.getGrade());
        //使用setter方法设置属性值
        us.study();
        us.eat();
        us.sleep();
    }
}
