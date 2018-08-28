package cn.tianyu.day05.demo01;
/*任何数据类型都可以作为方法的参数类型，或返回值类型
* 数组作为方法参数，传递的是数组的地址值
* 数组作为的返回值，返回的也是数组的地址值
* */
public class ArrayReturn {
    public static void main(String[] args){
        int[]result=arrayReturn(1,2,3);
        System.out.println("zonghe"+result[0]);
        System.out.println("zonghe"+result[1]);
    }
    public static int[ ] arrayReturn(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        int array[]=new int[2];
        array[0]=sum;
        array[1]=avg;
        return array;
    }
}
