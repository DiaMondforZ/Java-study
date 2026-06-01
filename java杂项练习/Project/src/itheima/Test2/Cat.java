package itheima.Test2;

public class Cat extends  Animal{
    //构造方法
    public Cat() {
        super();
    }
    public Cat(String name, String color) {
        super(name, color);
    }
    //抽象类独有方法重写
    @Override
    public void eat() {
        System.out.println("吃Yu");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
