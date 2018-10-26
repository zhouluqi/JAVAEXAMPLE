package com.onlinecode;

import java.util.Scanner;

public class 简化路径 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        lujing(str);
    }
    public static void lujing(String str){
       String []a =str.split("/");
       if(a.length>0){
           System.out.println("/"+a[a.length-1]);
       }

    }
}
