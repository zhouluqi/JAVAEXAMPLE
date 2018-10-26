package com.onlinecode;

public class 最大公约数 {
    public static void main(String[] args) {
        int n = 20;
        int m = 30;
        System.out.println( gongyueshu(20,30));
    }
    public static int gongyueshu (int a,int b){
        while (a%b!=0){
            int c =a%b;
            a = b;
            b = c;
        }
        return b;
    }
}
