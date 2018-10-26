package com.onlinecode;

public class 动态规划3 {
    public static void main(String[] args) {
        int[] a = {3,34,4,12,5,2};
        System.out.println(rec_subset(a,a.length-1,10));
    }
    public static boolean rec_subset(int[] a,int index,int n){
          if(n==0){
              return true;
          }else if(index==0){
              return a[0]==n;
          }else if(a[index]>n){
              return rec_subset(a,index-1,n);
          }else {
           boolean   A = rec_subset(a,index-1,n-a[index]);
           boolean   B = rec_subset(a,index-1,n);
              return A || B;
          }
    }
}
