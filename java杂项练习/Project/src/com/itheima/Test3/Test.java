package com.itheima.Test3;

public class Test {
    static void main(String[] args) {
        //创建运动员和教练对象
        PpPlayer pp = new PpPlayer("张三", 18);
        PpCoath Pp = new PpCoath("王五", 20);
        System.out.println("乒乓球运动员"+ pp.getName() + "年龄是"+pp.getAge());
        System.out.println("乒乓球教练员"+Pp.getName() + "年龄是"+Pp.getAge());
        pp.study();
        pp.SpeakEnglish();
        Pp.teach();
        Pp.SpeakEnglish();
        LqPlayer lq = new LqPlayer("赵六", 19);
        LqCoath Lq = new LqCoath("小七", 18);
        System.out.println("篮球运动员"+ lq.getName() + "年龄是"+lq.getAge());
        System.out.println("篮球教练员"+lq.getName() + "年龄是"+lq.getAge());
        lq.study();
        Lq.teach();
    }
}
