package itheima.Test2;

public class Test {
    static void main(String[] args) {
        /*
        * 猫类：
        * 属性：名字、颜色
        * 行为：吃鱼、抓老鼠、喝水
        * 狗类：
        * 属性：名字、颜色
        * 行为：狗吃骨头、狗看家、喝水
        * */
        //创建对象
        Cat c = new Cat("小猫", "灰色");
        System.out.println("名字是"+c.getName()+"的颜色是"+c.getColor());
        c.catchMouse();
        c.drink();
        c.eat();
        Dog d = new Dog("小狗", "黑色");
        System.out.println("名字是"+d.getName()+"的颜色是"+d.getColor());
        d.drink();
        d.lookHome();
        d.eat();
    }
}
