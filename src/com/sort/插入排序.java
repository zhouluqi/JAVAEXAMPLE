package com.sort;

public class 插入排序 {
    public static void main(String[] args) {
        int[] b ={4,3,5,6,2,1,8,9,7};
        sort(b);
        for(int i =0;i<b.length;i++) {
            System.out.println(b[i]);
        }
    }
    public static  void sort(int[] a){
        int n = a.length;
        int temp = 0;
        for (int i = 1;i < n;i++){
            int m = i;
            while( m>0 && a[m]<a[m-1] ){
               temp =  a[m];
               a[m] = a[m-1];
               a[m-1] = temp;
               m--;
            }

        }
    }
}
