package com.string.Test4;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        /*
         String repalace(旧值，新值) 替换
         注意：替换后的字符串会返回，替换前的字符串不会改变（只有返回值才是替换后的结果）

         需求：过滤游戏中的脏话
        */
        //简单的替换
        String content = "你妈妈很 dirty";
        String newContent = content.replace("dirty", "***");
        System.out.println(newContent);
        //实际运用：建立敏感词过滤系统
        //敏感词库
        String[] arr = {"TMD","SB","NMD","CNM"};
        //键盘输入你想说的话
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想说的话：");
        String talk = sc.next();
        //遍历敏感词库
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
