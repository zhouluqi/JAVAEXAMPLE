package com.onlinecode;

import java.util.Scanner;

public class 合法字节 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        System.out.println( isHefa(a));
    }
    public static boolean isHefa(int[] a){
        if(a.length==1){
            if(a[0]>=0&&a[0]<=127) {
                return true;
            }else {
                return false;
            }

        }
        return false;
    }
}
