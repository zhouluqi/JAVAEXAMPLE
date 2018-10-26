package com.sort;

public class 选择排序 {
    public static void main(String[] args) {
        int[] a={1,2,8,6,5,4,3,7,9};
        sort(a);
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void sort(int[] a){
          for(int i=0;i<a.length;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }

            if(min!=i){
                int temp ;
                temp =  a[i];
                a[i] = a[min];
                a[min] = temp;
            }

          }
    }
}
