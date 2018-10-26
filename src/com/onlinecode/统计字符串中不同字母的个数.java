package com.onlinecode;

public class 统计字符串中不同字母的个数 {
    public static void main(String[] args) {
        char[] a = {'a','a','A','b','c','d','f','f'};
        System.out.println(count(a));
    }
    public static  int count(char[] a){
        int count=0;
        for(int i = 0;i<a.length;i++){
            int n = i+1;
            while(n<a.length){
                if(a[i]==a[n]){
                    break;
                }else {count(a);
                    n++;
                }
            }
            if(n==a.length){
                count++;
            }
        }
        return count;
    }
}
