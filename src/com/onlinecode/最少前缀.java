package com.onlinecode;

import java.util.Scanner;

public class 最少前缀 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        String[] str = new String[n];
        for(int i=0;i<n;i++){
                 str[i] = scanner.nextLine();
        }
        zuihao(str);
    }
    public static void zuihao(String[] str){
        int max;
        int m ;
        int n ;
        char[]a;
        char[]b;
        for(int i=0;i<str.length;i++){
            n = 0;
            a=str[i].toCharArray();
            max=0;
            while (n<str.length){
                if(n!=i){
                    b=str[n].toCharArray();
                    m=0;
                    while(m<a.length&&m<b.length){
                        if(a[m]==b[m]){
                            m++;
                        }else {
                            max = max>m?max:m;
                            break;
                        }
                    }
                    n++;

                }else {
                    n++;
                }
            }
            if(max==0){
                System.out.println(a[0]);
            }else {
                for (int j=0;j<= max;j++){
                    System.out.print(a[j]);
                }
                System.out.println();
            }

        }
    }
}
