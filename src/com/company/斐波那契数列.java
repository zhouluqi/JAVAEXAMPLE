package com.company;

public class 斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }
    public static int f(int n){
        if(n > 39 || n < 0){
            return 0;
        }
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            return f(n-2)+f(n-1);
        }
    }
}
