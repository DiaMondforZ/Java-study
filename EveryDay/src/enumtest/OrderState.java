package enumtest;
//枚举类的第一行必须是枚举项
//枚举类的构造方法必须为private修饰，不让外界创建本类的对象
public enum OrderState { //订单状态枚举类
    //订单状态枚举项
    PENDING_PAYMENT("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    DELIVERING("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");
    //订单状态枚举项对应的中文名称
    private String name;
    //枚举类构造方法默认使用private修饰，可以省略
    private OrderState(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
//编译器会给枚举类自动添加两个方法：values()和valueOf()
//values()：返回枚举项数组
//valueOf()：返回枚举项