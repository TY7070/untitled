package cn.tianyu.day05.demo02;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] arrayC=new int[]{1,4,5,3,7,8,3,9,4};
        int max=arrayC[0];
        for (int i = 1; i <arrayC.length; i++) {
            if (max<arrayC[i]){
                max=arrayC[i];
            }
        }
        System.out.println("最大值是"+max);
    }
}
