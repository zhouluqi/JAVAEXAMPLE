package com.onlinecode;

public class 动态规划1 {
    public static void main(String[] args) {
        int[] a = {1,2,4,1,7,8,3};
        System.out.println( dongtai(a,6));
    }
    public static int dongtai(int[] a,int i){
        if(i==0){
            return a[0];
        }else if(i==1){
            return a[0]>a[1]?a[0]:a[1];
        }else {
            int A = dongtai(a,i-2)+a[i];
            int B = dongtai(a,i-1);
            return A>B?A:B;
        }
    }
}
