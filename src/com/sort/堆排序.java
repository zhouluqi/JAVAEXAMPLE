package com.sort;

public class 堆排序 {
    public static void main(String[] args) {
        int[] a={1,2,8,6,5,4,3,7,9};
        sort(a);
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void sort(int []a){
       for(int i=a.length/2-1;i>=0;i--){
           adjustHeap(a,i,a.length);
       }
       for(int j=a.length-1;j>0;j--){
           swap(a,0,j);
           adjustHeap(a,0,j);//在大根堆的基础上直接从最后一个根节点向下重建
       }

    }
    public static void adjustHeap(int []a,int i, int length){
        int temp = a[i];
        for(int j = i*2+1;j<length;j=j*2+1){
            if(j+1<length && a[j]<a[j+1]){
                j++;
            }
            if(a[j]>temp){
                a[i]=a[j];
                i=j;
            }else {
                break;
            }
        }
        a[i]=temp;
    }

    public static void swap(int []aa,int a,int b){
        int temp =aa[a];
        aa[a]=aa[b];
        aa[b]=temp;
    }
}
