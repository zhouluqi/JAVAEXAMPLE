package com.onlinecode;

import java.util.Scanner;

public class 无重复最长字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println( count(str));
    }
    public static int count(String s){
        if(s.isEmpty()){
            return 0;
        }
        char[] a = s.toCharArray();
        int count;
        int max = 0;
        int mid=0;
        for (int i = 1;i< a.length; i++){
            int n = i;
            count=1;
            while(n >mid && a[i]!=a[n-1]){
               n--;
               count++;
            }
            mid = n;
            if(count>max){
                max = count;
            }
        }
        return max;
    }
}
