package cn.tianyu.day05.demo01;

public class Demo04Same {
    public static void main(String[] args) {
        System.out.println(isLSame(10,10));
    }

    public static boolean isLSame(int a, int b){
        /*boolean same;
        if(a==b){
            same=true;
        }else{
            same=false;
        }*/
//        boolean same=a==b?teue:false;
//        boolean same = a==b;
        return a==b;
    }
}