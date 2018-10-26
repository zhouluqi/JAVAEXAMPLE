package com.onlinecode;

public class 动态规划2 {
    public static void main(String[] args) {
        int[] a = {4,1,1,9,1};
        System.out.println( dongtai(a));
    }
    public static int dongtai(int[] a){
        int[] opt = new int[a.length];
        opt[0]=a[0];
        opt[1]=a[0]>a[1]?a[0]:a[1];
        int A ,B;
        for(int i = 2;i<a.length;i++){
            A = opt[i-2]+a[i];
            B = opt[i-1];
            opt[i] = A>B?A:B;
        }
        return opt[a.length-1];
    }
}
