package com.LeetCode.primary.String;

import java.util.Scanner;

public class 颠倒整数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        System.out.println(fanzhuan(str));
    }
    public static int fanzhuan(int s){
        int yushu ;
        int n = 0;
        if(s>(Math.pow(2,31)-1)&&s<-(Math.pow(2,31))){
            return 0;
        }else {
            if(s<0){
                System.out.print("-");
                s = -s;
            }
            while(s!=0){
               yushu = s%10;
               s = s/10;
               n = n*10+yushu;
            }
            return n;
        }
    }
}
