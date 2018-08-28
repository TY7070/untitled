package cn.tianyu.day05.demo02;

public class Demo06_alcohol {
    public static void main(String[] args) {
        int a, b, c, d;
        for (a = 20; a > 0; a--) {
            for (b = 1; b < a; b++) {
                for (c = 1; c < b; c++) {
                    for (d = 1; d < c; d++) {
                        if (a * b * c + a * c * d + b * c * d + a * b * d == a * b * c * d) {
                            System.out.println(a+ "," + b + "," + c + "," + d + ",0");
                        }
                    }
                }
            }
        }
    }
}
