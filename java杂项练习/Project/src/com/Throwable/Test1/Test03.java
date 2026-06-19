package com.Throwable.Test1;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("第一行");
        int i = 10;
        String str = null;
        int[] arr = new int[3];
        try{
            System.out.println(i/0); //System.exit();
            System.out.println(str.length());
            arr[10] = 100;
        }catch (ArithmeticException e){
            System.out.println("除数为0");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("第二行");
    }
}
