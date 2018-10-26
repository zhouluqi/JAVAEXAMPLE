package com.onlinecode;

import java.util.Scanner;

public class ipbug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(count(s));
    }
    public  static int count(String str){
        char[] a = str.toCharArray();
        if(a.length>12&&a.length<4){
            return 0;
        }
        if(a.length==4){
            return 1;
        }
        if(a.length==12){
            return 1;
        }else{
            return 0;
        }

    }
}
