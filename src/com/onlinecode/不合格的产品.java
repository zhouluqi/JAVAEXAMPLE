package com.onlinecode;

import java.util.Scanner;

public class 不合格的产品 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
        }
        count(a,b,c,n);
    }
    public static void count(int[] a,int[] b,int[] c,int n){
        int count = 0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<a[j]&&b[i]<b[j]&&c[i]<c[j]){
                    count++;
                    break;
                }
            }

        }
        System.out.println(count);
    }
}
