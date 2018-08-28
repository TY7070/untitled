package cn.tuianyu.day06.demo.demo01.demo01;

/*通常情况下一个类不能直接使用，需要创建一个对象，才能使用。
*
* 1、导包：指出需要使用的类在什么位置
*    import 包名称.类名称;
*    import cn.tianyu.day6.demo.student;
*    对于和当前类属于同一个包的，可以省略导包语句
*2、创建，格式
*   类名称  对象名=new 类名称（）；
*   Student stu= new Student（）；
* 3、使用
*   使用成员变量   对象名.成员变量名.
*   使用成员方法   对象名.成员方法名（参数）
*
* 成员变量没有赋值，默认值同数组.
* */
public class Demo02Student {
    public static void main(String[] args) {
        student stu = new student();//创建了一个名为stu的变量
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.name="田宇";
        stu.age=19;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("============================");
        stu.sleep();
    }
}
