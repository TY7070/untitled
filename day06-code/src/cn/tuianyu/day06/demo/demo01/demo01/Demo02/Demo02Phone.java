package cn.tuianyu.day06.demo.demo01.demo01.Demo02;

public class Demo02Phone {
    public static void main(String[] args) {
        Phone onePhone =new Phone();{
            System.out.println(onePhone.brand);
            System.out.println(onePhone.price);
            System.out.println(onePhone.color);
            onePhone.brand="pingguo";
            System.out.println(onePhone.brand);
            onePhone.call("aqiao");
            onePhone.sengMessage();
        }
    }
}
