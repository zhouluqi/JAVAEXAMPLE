package com.onlinecode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 格雷码 {
    public static void main(String[] args) {

        String[] p = getGray(5);
        for(String s:p){
            System.out.println(s);
        }

    }
    public static String[] getGray(int n){
        int m = n*2;
        String[] r = new String[m];
        if(n==1){
          r[0]="0";
          r[1]="1";
          return r;
        }else {
            String[] temp = getGray(n-1);
            int j = 0;
            for (int i = 0;i<m;i++){
                if(i<m/2){
                    r[i]="0"+temp[j++];
                }else {
                    r[i]="1"+temp[--j];
                }
            }
            return r;
        }
    }
}
