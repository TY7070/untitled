package cn.tianyu.day05.demo02;
/*
* 基本
/*直接打印数组，得到的是内存地址的哈希值
访问数组元素的格式:数组名称[索引值]
 索引值，就是一个int值，数组中的元素编格式
* 动态初始化（指定长度）
	数据类型[ ]数组名称=new 数据类型[数组长度]；
  静态初始化（指定内容）
	     数据类型[ ] 数组名称 =new 数据类型 [ ]{元素1，元素2，元素3······       }；
         省略格式
         数据类型[ ] 数组名称 = {元素1，元素2，元素3······  }；
   标准格式可以拆分为两个步骤
       int arrayB;
       arrayB =new int[]{10,20,30};

       使用建议：
       不确定数组当前内容，使用动态初始化；确定内容，使用静态初始化。
 【注意】索引值从0开始到数组长度-1为止。
* */


/*动态初始化数组时，元素拥有一个默认值。规则如下：
   整数类型---0；
   浮点数类型---0.0
   字符类型---'\u0000'
   布尔类型---false
   引用类型---null
* */
public class Demo01Array {
    public static void main(String[] args) {
        int[ ] arrayB={10,20,30};
        System.out.println(arrayB[0]);
        System.out.println("==================");
        int num = arrayB[2];
        System.out.println(num);
    }
}
