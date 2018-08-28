package cn.tianyu.day05.demo02;
/*
* 素组反转就是数组对称位置元素互换
* 遍历数组用的是一个索引     int i = 0；
* 表示对称位置需要两个索引      int min=0；
*                               int max=array.length-1;*/
public class Demo05ArrayD {
    public static void main(String[] args) {
        int[] arrayD=new int[]{1,2,3,4,5,6};
        for (int min= 0,max=arrayD.length-1; max<min; min++,max--) {
            int temp=arrayD[min];
            arrayD[min]=arrayD[max];
            arrayD[max]=temp;
        }
        for (int i = 0; i < arrayD.length; i++) {
            System.out.println(arrayD[i]);
        }
    }
}
