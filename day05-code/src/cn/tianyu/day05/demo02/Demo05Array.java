package cn.tianyu.day05.demo02;
/*
* 数组的遍历就是对数组元素挨个处理一遍，默认处理就是遍历*/
public class Demo05Array {
    public static void main(String[] args) {
        int[ ] arrayB;
        arrayB=new int[]{1,2,3,4,5};
        int len=arrayB.length;
        for (int i = 0; i < len; i++) {
            System.out.println(arrayB[i]);
        }
        System.out.println("==========================");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
    }
}
