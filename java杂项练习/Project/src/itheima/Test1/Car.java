package itheima.Test1;

public class Car extends  Vehicle{
    //构造方法
    public Car(){
        super();
    }
    public Car(String brand,double speed){
        super(brand,speed);
    }
    //重写move方法
    @Override
    public void move(){
        System.out.println(getBrand()+"品牌的汽车"+getSpeed()+"km/h移动");
    }
    //添加方法
    public void honk(){
        System.out.println("汽车在鸣笛");
    }
}
