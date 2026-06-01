//Arraylist集合
/*
* 导包：import java.util.Arraylist
* 格式：Arraylist<E> 对象名 = new Arraylist<>();
* E: 泛型数据类型，用于设置对象名的数据类型，只能为引用数据类型。
* 基本类型	引用类型
boolean	    Boolean
byte	    Byte
short	    Short
int	        Integer
long	    Long
float	    Float
double	    Double
char	    Character
*/
package collection;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        //创建Arraylist对象
        ArrayList<String> list = new ArrayList<String>();
        //使用对象名.add()方法添加元素
        list.add("Google");
        list.add("Runoob");
        list.add("Taobao");
        list.add("Baidu");
        //打印
        System.out.println(list);
        //使用对象名.get()获取第二个元素
        System.out.println(list.get(1));
        //使用对象名.size()获取集合长度
        System.out.println(list.size());
        //使用对象名.remove()删除集合元素
        list.remove(3);//删除第四个元素
        //使用for来迭代数组列表中的元素
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //增强 for 循环（for-each）
        //使用for - each 循环来迭代集合中的元素时不能在遍历中删除 / 修改集合元素，只能读取
        for (String str : list) {
            System.out.println(str);
        }
        //ArrayList排序(可以为字符或数字排序)
        //导入Collections类：import java.util.Collections;
        Collections.sort(list);
        for (String str01 : list){
            System.out.println(str01);
        }
    }
}
