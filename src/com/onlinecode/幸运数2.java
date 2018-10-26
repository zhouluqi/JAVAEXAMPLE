package com.onlinecode;

import java.util.Scanner;

public class 幸运数2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        jishu(n,m);
    }
    public static void jishu(int n,int m){
        int count =0;
        for (int i=n;i<=m;i++){
            if(hefa(i)){
               count++;
            }
        }
        System.out.println(count);
    }
    public static boolean hefa(int n){
        char[] a = String.valueOf(n).toCharArray();
        for(int i=1;i< a.length/2;i++){
            if(a.length==1){
                return true;
            }
            if (a[i]==a[a.length-1-i]){
                    return false;
            }
        }
        return true;
    }

}
