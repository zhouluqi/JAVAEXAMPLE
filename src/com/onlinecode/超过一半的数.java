package com.onlinecode;

import java.util.Arrays;

public class 超过一半的数 {
    public static void main(String[] args) {

    }
    public static int getsum(int[] gifts,int n){
        Arrays.sort(gifts);
        int ans = gifts[n/2];
        int num = 0;
        for(int i = 0; i < gifts.length; i++) {
            if(gifts[i] == ans) {
                num++;
            }
        }
        return num <= n/2 ? 0 : ans;
    }
}
