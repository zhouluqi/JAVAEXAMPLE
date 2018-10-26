package com.onlinecode;


import java.util.Scanner;

public class 幸运数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        mehtod(n);
    }
    public static void mehtod(int n){
        int count = 0;
        for (int i =1;i<=n;i++){
            if(shijinzhi(i)==erjinzhi(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static int shijinzhi(int n){
        int m = 0;
        while(n!=0){
            m = m + n%10;
            n = n/10;
        }
        return m;

    }
    public static int erjinzhi(int n){
         int m = 0;
         while(n!=0){
             m = m + n%2;
             n = n/2;
         }
       return m;
    }

}
