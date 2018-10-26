package com.onlinecode;
import java.util.Scanner;
public class 图的遍历 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[20];
        int[] b = new int[20];
        for (int i =0;i<n-1;i++){
            a[i]=scanner.nextInt();
            b[i]=scanner.nextInt();
        }
        System.out.println(count(a,b,n));

    }
    public static int count(int[] a,int[] b,int n){
        int count = 0;
        for(int i = 0;i<n-1;i++){
            if((a[i]==1)&&(b[i]!=a[i+1])){
                count=count+2;
            }else {
                count++;
            }
        }
        return count;
    }

}
