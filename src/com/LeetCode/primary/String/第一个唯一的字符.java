package com.LeetCode.primary.String;

import java.util.Scanner;

public class 第一个唯一的字符 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(indexFist(str));
    }
    public static int indexFist(String a){
        int index = -1;
        char[] str = a.toCharArray();
        for(int i=0;i<str.length;i++){
            int n = 0;
            while (n<str.length){
                if(str[i]==str[n]&&i!=n){
                    break;
                }else {
                    n++;
                }
            }
            if(n==str.length){
                index = i;
                break;
            }
        }
        return index;
    }
}
/*
*  用每个字符从头到尾比较，相等就跳出啦，不相等知道最后，有就直接返回来。
*
*
* */
