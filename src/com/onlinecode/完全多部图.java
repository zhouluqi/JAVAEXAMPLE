package com.onlinecode;

import java.util.Scanner;

public class 完全多部图 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            int dian = scanner.nextInt();
            int bian = scanner.nextInt();
            int[] a = new int[bian];
            int[] b = new int[bian];
            for(int j=0;j<bian;j++){
                 a[j] = scanner.nextInt();
                 b[j] = scanner.nextInt();
            }
            IsDuoBuTu(a,b,dian);
        }
    }
    public static void IsDuoBuTu(int[] a,int[] b,int dian){
        boolean tag = false;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                 tag = true;
                }
            }
        }
        if(tag){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
