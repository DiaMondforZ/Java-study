package com.itheima.Test1;

public class Vehicle {
// 属性：品牌，速度
    private String brand;
    private double speed;
// 构造方法
    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public Vehicle() {}
// getter和setter方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println(brand+"品牌的交通工具"+speed+"km/h移动");
    }
}
