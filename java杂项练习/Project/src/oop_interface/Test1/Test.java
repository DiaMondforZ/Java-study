package oop_interface.Test1;

public class Test {
    static void main(String[] args) {
        /*
        青蛙Frog    属性：名字，颜色    行为：吃虫子，蛙泳
        狗Dog         属性：名字，颜色    行为：吃骨头，狗刨
        兔子Rabbit    属性：名字，颜色    行为：吃胡萝卜*/
        Frog f = new Frog("小青", "青色");
        System.out.println("名字是"+f.getName()+"，颜色是"+f.getColor());
        f.swim();
        f.eat();
    }
}
