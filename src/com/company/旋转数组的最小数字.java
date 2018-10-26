package com.company;

public class 旋转数组的最小数字 {
    public static void main(String[] args) {
        int[] a = {5,6,7,3,4};
        System.out.println(min(a));
    }
    public static int min(int[] b){
        int i = 0;
         if(b.length==0){
             return 0;
         }else{
             while(true){
                 if(i>=b.length){
                     break;
                 }
                 if(b[i]>b[i+1]){
                     return b[i+1];
                 }else {
                     i++;
                 }
             }
         }
       return 0;

    }
}
