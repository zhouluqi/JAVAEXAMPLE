package com.company;

public class 调整奇数偶数 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};

        sort(a);
    }
    public static void sort(int[] array){
        int[] jishu = new int[100];
        int j = 0;
        int[] oushu = new int[100];
        int q = 0;
        for(int i=0;i<array.length;i++){
           if(array[i]%2==1){
               jishu[j]=array[i];
               j++;
           }else{
               oushu[q]=array[i];
               q++;
           }
        }
        int xx = 0;
        for(int i = 0;i<array.length;i++){
            if(i<j){
                array[i]=jishu[i];
            }else{

                array[i]=oushu[xx++];
            }

        }
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
/*
*
* 1.用空间换时间，分别将奇数偶数放到俩个数组，在合并起来时间复杂度2n
*
* 2.还有一种类似冒泡算法，如果第一个是偶数第二个是奇数就交换。复杂度和冒泡差不多
* */
