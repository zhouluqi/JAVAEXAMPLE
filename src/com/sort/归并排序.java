package com.sort;

public class 归并排序 {
    public static void main(String[] args) {
        int[] a={1,2,8,6,5,4,3,7,9};
        sort(a);
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public  static void sort(int []a){
        int[] temp = new int[a.length];
        sort(a,0,a.length-1,temp);
    }
    public static void sort(int[] a,int left,int right,int[] temp){
          if(left<right){
              int mid = (left+right)/2;
              sort(a,left,mid,temp);
              sort(a,mid+1,right,temp);
              merge(a,left,mid,right,temp);
          }
    }
    public static void merge(int[]a,int left,int mid,int right,int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;
        while(i<= mid && j<=right){
           if(a[i]<=a[j]){
               temp[t++] = a[i++];
           }else {
               temp[t++] = a[j++];
           }
        }
        while(i<mid){
            temp[t++] = a[i++];
        }
        while(j<=right){
            temp[t++] = a[j++];
        }
        t = 0;
        while(left <= right){
            a[left++] = temp[t++];
        }
    }

}
