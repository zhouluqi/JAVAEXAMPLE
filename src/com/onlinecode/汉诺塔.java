package com.onlinecode;

import java.util.Scanner;

public class 汉诺塔 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();
        move(n, "left", "mid", "right");

    }

    public static void move(int n, String left, String mid, String right) {
        if (n == 0) return;
        if (n == 1) System.out.println("move from ["+left + "] to [" + right+"]");
        else {
            move(n - 1, left, right, mid);
            System.out.println("move from ["+left + "] to [" + right+"]");
            move(n - 1, mid, left, right);
        }
    }
}

