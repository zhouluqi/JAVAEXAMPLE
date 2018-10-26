package com.sort;

public class 希尔排序 {
    public static void main(String[] args) {
        int[] a = {1, 8, 3, 4, 6, 7, 2, 5};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


   }
    public static void sort(int[] a) {
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) { //从第一个组开始，依次循环每一个组
                int j = i;
                int temp;
                while (j - gap > 0 && a[j] < a[j - gap]) {//每一组的把小的往前放
                    temp = a[j];
                    a[j] = a[j - gap];
                    a[j - gap] = temp;
                    j -= gap;
                }
            }

        }
    }
}