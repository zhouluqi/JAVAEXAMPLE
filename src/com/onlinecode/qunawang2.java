package com.onlinecode;


import java.util.Scanner;

public class qunawang2 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        for(int i =0;i<3;i++){
            a[i] = scanner.nextInt();
        }
        minLengthAvailable(a[0],a[1],a[2]);
        if(count==0){
            count = -1;
            System.out.println(count);
            return;
        }
        if(count%a[0]==0){
            count++;
            System.out.println(count);
            return;
        }
    }
  public  static void  minLengthAvailable(int N,int M,int K) {
        if(N<=1){
            return;
        }
        if(M<=0){
            return ;
        }
        if(M>=K){
            if(K%N==0){
                M = M - (K-1);
            }else {
                M = M - K;
            }
            count++;
        }else {
            while(M < K && K > 0){
                K--;
            }
            if (K%N==0){
                M = M-(K-1);
            }else {
                M = M -K;
            }
            count++;
        }
        minLengthAvailable(N,M,K);
    }
}
