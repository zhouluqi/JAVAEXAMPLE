package com.sort;

public class 快速排序 {
    public static void main(String[] args) {
        int[] a={5,2,8,6,1,4,3,7,9};
        quicksort(a,0,8);
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void quicksort(int[] a,int left,int right){
        if(left>right){
            return;
        }
        int temp ;
        int i ;
        int j ;
        int t ;
        temp = a[left];
        i=left;
        j=right;
        while(i != j){
             while(a[j]>=temp && j>i){
                 j--;
             }
             while(a[i]<=temp && i<j){
                 i++;
             }
             if(i<j){
                 t = a[j];
                 a[j] = a[i];
                 a[i] = t;

             }
        }
        a[left]=a[i];
        a[i]=temp;
        quicksort(a,left,i-1);
        quicksort(a,i+1,right);
    }
}
