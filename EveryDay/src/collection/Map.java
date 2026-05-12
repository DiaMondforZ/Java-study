//Map集合
//HashMap 的 key 与 value 类型可以相同也可以不同，
// 可以是字符串（String）类型的 key 和 value，
// 也可以是整型（Integer）的 key 和字符串（String）类型的 value。
//引入类：import java.util.HashMap;
//格式：HashMap<key,value> 对象名 = new HashMap<key,value>();
package collection;
import java.util.HashMap;
public class Map {
    public static void main(String[] args) {
        //创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        //添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);
        // 获取键对应的值
        System.out.println(Sites.get(3));
        //只想获取 key，可以使用 keySet() 方法，然后可以通过 get(key) 获取对应的 value，
        // 如果你只想获取 value，可以使用 values() 方法。
        // 输出 key 和 value
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for(String value: Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
        System.out.println("------------------------------");
        // 创建 HashMap 对象 Sites
        //字符串（String）类型的 key 和字符串（String）类型的 value
        HashMap<String, String> Sites01 = new HashMap<String, String>();
        //添加键值对
        Sites01.put("one", "Google");
        Sites01.put("two", "Runoob");
        Sites01.put("three", "Taobao");
        Sites01.put("four", "Zhihu");
        //删除键值对
        Sites.remove(4);
        System.out.println(Sites01);
        //使用对象名.size()获取 HashMap 元素个数
        System.out.println(Sites.size());
        //使用 for-each 来迭代 HashMap 中的元素。
        for (String i : Sites.values()) {
            System.out.println(i);
        }
    }
}
