package cn.tianyu.day05.demo01;

public class Demo03Getsum {
    public static void main(String[] args) {
        System.out.println(getsum());
    }
    public static int getsum( ){
        int sum =0;
            for (int i = 0; i < 100; i++) {
                sum +=i;
            }
            return sum;
        }
    }
