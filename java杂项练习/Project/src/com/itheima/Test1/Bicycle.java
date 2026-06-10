package com.itheima.Test1;

public class Bicycle extends  Vehicle{
    //构造方法
    public Bicycle() {
        super();
    }
    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }
    //方法重写
    @Override
    public void move(){
        System.out.println(getBrand()+"品牌的自行车"+getSpeed()+"km/h移动");
    }
    public void ringBell(){
        System.out.println("发出铃声");
    }
}
