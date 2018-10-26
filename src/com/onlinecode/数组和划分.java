package com.onlinecode;

import java.util.Scanner;

public class 数组和划分 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[100];
        int i = 0;
        while (scanner.hasNext()){
            a[i]= scanner.nextInt();
            System.out.println(a[i]);
            i++;
        }
        System.out.println("跳出循环");
    }
}
