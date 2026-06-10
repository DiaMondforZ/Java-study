package com.itheima.Test6;

public interface Inter {
    public default void login() {
        check();
        System.out.println("换行登录的逻辑");
    }
    public default void register(){
        check();
        System.out.println("换行注册的逻辑");
    }
    public static void aa(){
        check();
        System.out.println("静态方法");
    }

    //普通的私有方法：private 放回值类型 方法名（形参）{方法体}
    //静态的私有方法：private static 放回值类型 方法名（形参）{方法体}

    private static void check(){
        System.out.println("检查网络");
        System.out.println("检查用户名和密码的格式");
        System.out.println("检查用户名是否存在");
    }
}
