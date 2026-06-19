package com.Throwable.Test2;

import java.text.SimpleDateFormat;

public class Test01 {
    public static void main(String[] args) {
        String str = "2020-02-03";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            sdf.parse(str);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
