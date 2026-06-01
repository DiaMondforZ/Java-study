//枚举
/*枚举是一个特殊的JavaBean类，这个类的对象是有限个
（JavaBean类是专门用来装数据的实体类、POJO、模型类）
javabean类必须满足：
私有成员变量、无参构造、每个属性都要有get/set方法、可序列化：实现Serializable接口（可选）
* 格式：public enum 枚举类名{
        枚举项1，枚举项2，枚举项3；/对象1，对象2，对象3；
        属性
        行为
       }
*/
//所有的枚举项都是默认使用public static final修饰的
package enumtest;
public class EnumTest1 {
    static void main(String[] args) {
        //创建枚举项
        //格式：枚举类名 变量名 = 枚举类名.枚举项
        OrderState o1 = OrderState.PENDING_PAYMENT;
        //使用获取枚举项对应的中文名称
        System.out.println(o1.getName());
        switch (o1){
            case PENDING_PAYMENT -> System.out.println("待支付");
            case PROCESSING -> System.out.println("处理中");
            case SHIPPED -> System.out.println("已发货");
            case DELIVERING -> System.out.println("配送中");
            case DELIVERED -> System.out.println("已送达");
            case CANCELLED -> System.out.println("已取消");
        }
        //使用values()方法获取枚举项数组
        OrderState[] arr = OrderState.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
