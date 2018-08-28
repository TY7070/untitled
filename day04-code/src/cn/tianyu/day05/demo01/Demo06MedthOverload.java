package cn.tianyu.day05.demo01;

public class Demo06MedthOverload {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame((short)10,(short)20));
        System.out.println(isSame((byte)10,(byte)20));
//        System.out.println(isSame((long)10,(long)20));
    }
    public static boolean isSame(byte a,byte b){
         boolean same;
         if(a==b){
             same=true;
         }else{
             same =false;
         }
         return same;
    }
    public static boolean isSame(short a,short b){
        boolean same= a==b?true :false;
        return same;
    }
    public static boolean isSame(int a,int b){
        if(a==b){
            return true;
        }else{
            return false;
        }
       /* public static boolean isSame(long a,long b){
            return a==b;
        }*/
    }
}
