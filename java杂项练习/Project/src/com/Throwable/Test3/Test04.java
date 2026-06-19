package com.Throwable.Test3;

public class Test04 {
    public static void main(String[] args) {
        try {
            System.out.println(getScore());
        } catch (ScoreException e) {
            e.printStackTrace();
        }
        System.out.println(".....................");
    }
    public static double getScore() throws ScoreException{
        double score = 999;
        if (score < 0 || score > 100){
            throw new ScoreException("分数不合法");
        }
        return score;
    }
    //自定义异常类
    static class ScoreException extends Exception{
        public ScoreException(){}
        public ScoreException(String message){
            super(message);
        }
    }
}
