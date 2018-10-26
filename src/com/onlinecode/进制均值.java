package com.onlinecode;

import java.util.Scanner;

public class 进制均值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
           mehtod(scanner.nextInt());
        }
    }
    public static void mehtod(int a){
        int conunt =0;
        int jinzhi = a-1;
        for(int i=2;i<=jinzhi;i++){
            conunt = conunt+jinzhi(i,a);
        }
        if(conunt%(a-2)==0){
            System.out.println(conunt/(a-2)+"/"+1);
        }else {
            int x = conunt;
            int y = a-2;
            while(x%2==0&&y%2==0){
                x = x/2;
                y = y/2;
            }
            while(x%3==0&&y%3==0){
                x = x/3;
                y = y/3;
            }
            System.out.println(x + "/" + y);
        }
    }
    public static int jinzhi(int jinzhi,int a){
        int m = 0;
        while(a!=0){
            m = m + a % jinzhi;
            a = a/jinzhi;
        }
        return m;
    }
}
