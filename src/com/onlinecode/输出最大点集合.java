package com.onlinecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 输出最大点集合 {
    public static void main(String[] args) {

        collection();


    }

    public static void collection(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[1000];
        int[] y = new int[1000];
        int[] index = new int[1000];
        int[] sort = new int [1000];
        int count = 0;
        for(int i = 0;i<n;i++){
          x[i]=sc.nextInt();
          y[i]=sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            int m = x[i];
            int q = y[i];
            int p = 0;
            while(true){
                if(m < x[p] && q <y[p]){
                    break;
                }else{
                    if(p != (n-1)){
                        p++;
                    }else{
                        index[count++]=i;
                        break;
                    }

                }
            }
        }
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int j = 0;j< count;j++){
            sort[j]=x[index[j]];
            map.put(x[index[j]],y[index[j]]);
        }
        for(int i = 0;i< count;i++){
            int tem = 0;
            for(int j=count-1-i;j>0;j--){
                if(sort[j]<sort[j-1]){
                    tem = sort[j];
                    sort[j] = sort[j-1];
                    sort[j-1] =tem;
                }
            }
        }
        for(int j = 0;j< count;j++){

            System.out.println(sort[j]+" "+map.get(sort[j]));
        }
    }

}
