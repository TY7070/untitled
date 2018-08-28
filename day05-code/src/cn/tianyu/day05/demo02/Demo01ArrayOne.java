package cn.tianyu.day05.demo02;
/*
* 数组长度在程序运行期间不可以发生改变
* 貌似改变数组长度的语句实际上是建立新数组
* 获取数组长度     arrayB.length    得到一个int数据 */
public class Demo01ArrayOne {
    public static void main(String[] args) {
        int[] arrayB=new int[3];
        System.out.println(arrayB.length);
        arrayB=new int[5];
        System.out.println(arrayB.length);
    }
}
