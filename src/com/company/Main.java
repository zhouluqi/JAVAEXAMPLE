package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row,col,num;
        int[] x = new int[100];
        int[] y = new int[100];
       while(in.hasNext()){
           row = in.nextInt();
           col = in.nextInt();
           num = in.nextInt();
           int count =0;
           for(int i=0;i<num;i++){
               x[i] = in.nextInt();
               y[i] = in.nextInt();
           }
           for(int i=0;i<num;i++){
               int c = i;
               while (c>0){
                   if(x[i]>=row||y[i]>=col){
                       break;
                   }
                   if((x[i]==x[c-1]&&(Math.abs(y[i]-y[c-1]))<=1)||(y[i]==y[c-1]&&(Math.abs(x[i]-x[c-1])<=1))){
                    break;
                   }else {
                       c--;
                   }
               }
               if(c==0){
                   count++;
                   System.out.print(count+" ");
               }else{
                   System.out.print(count+" ");
               }
           }
       }
    }
}

