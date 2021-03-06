package cn.tianyu.day05.demo01;
/*
 * 方法就是若干语句功能的集合
 *
 * 参数：进入方法的数据
 * 返回值：从方法中出来的数据
 *
 *   完整格式
 *   修饰符  返回值类型 方法名称 （参数类型 参数名称,····）{
 *           方法体
 *           return 返回值；
 *   }
 *   现阶段修饰符  public static
 *   方法        小驼峰
 *   参数有多个用逗号隔开
 *   return：停止当前方法，经结果数据。返回值还给调用除
 *   返回值：必须与返回值类型相同
 *          有返回值----结果返回调用的方法，在调用中显示结果（只要不是void方法都有返回值）
 *          无返回值----自行打印结果（void没有返回值、只能使用单独调用 ）
 *
 *   调用方法
 *       单独调用。方法名称（参数）；
 *       打印调用。System.out.println(方法名称（参数）)；
 *       赋值赋值。数据类型 变量名称 = 方法名称（参数）；
 *       void方法只能单独调用
 *   */
public class Demo02Method {
    public static void main(String[] args) {
        sum(10,20,0);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(sum(10,20,0));
        System.out.println("===============================");
        int number =sum(10,20,0);
        System.out.println(number);
    }
    public static int sum(int a,int b,int result){
        result=a+b;
        return result;
    }
}
