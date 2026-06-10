package com.itheima.Test3;

public class PpCoath extends coath implements English{
    //构造方法
    public PpCoath() {
    }

    public PpCoath(String name, int age) {
        super(name, age);
    }
    //方法重写
    @Override
    public void SpeakEnglish() {
        System.out.println("乒乓球教练说英语");
    }
    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }
}
