package com.sort;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] a={1,2,8,6,5,4,3,7,9};
        sort(a);
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void sort(int[] a){

        int tem =0;
        boolean flag;
        for(int i = 0;i< a.length-1;i++){
            flag = true;
            for(int j=0;j<a.length-1-i;j++){
                  if(a[j]>a[j+1]){
                      tem = a[j];
                      a[j] = a[j+1];
                      a[j+1] =tem;
                      flag = false;
                  }
            }
            if(flag){
                break;
            }
        }
    }
}
