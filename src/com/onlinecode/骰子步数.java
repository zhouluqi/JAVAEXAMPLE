package com.onlinecode;

import java.util.Scanner;

public class 骰子步数 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(getSum(n));
    }
    public static int getSum(int n) {
        int count = 0;
        if (n == 1)
            count = 1;//f(1) =1
        else if (n == 2)
            count = 2;//f(2)=2
        else {
            for (int i = 1; i < n; i++) {
                count += getSum(n - i);//计算f(n) = f(n-1)+f(n-2)+f(n-3)+....+f(1)
            }
            count = count + 1;//再加f(0) = 1
        }
        return count;
    }
}
