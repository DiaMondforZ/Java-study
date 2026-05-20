package oop_polymorrhic;

public class StudentManger {
    //定义一个注册方法
    //参数Person：此时可以出传递Person本身的对象，也可以传递Person所有的子类的对象
    public void register(Person person) {
        System.out.println("姓名为" + person.getName() + "的账户注册成功，账号" + person.getUsername() + "，密码" + person.getPassword());
        //传递不同的对象，调用不同类里的work方法
        person.work();
    }
}
