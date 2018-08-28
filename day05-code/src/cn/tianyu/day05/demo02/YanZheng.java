package cn.tianyu.day05.demo02;

public class YanZheng {
    public static void main(String[] args){
        for(int i=20;i>0;i--){
            for(int j=i-1;j>0;j--){
                for(int k=j-1;k>0;k--){
                    for(int m=k-1;m>0;m--){	// 符点数比较,这里误差定为小于0.0000001为成立
                            System.out.println(i+","+j+","+k+","+m+",0");
                    }
                }
            }
        }
    }

}
