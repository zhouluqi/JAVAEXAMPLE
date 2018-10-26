package com.onlinecode;

public class 字符串大写放后边 {
    public static void main(String[] args) {
        String A = "AkleBiCeilD";
        sort(A);
    }
public static void sort(String a){
        char[]s=a.toCharArray();
    for(int i=0;i<s.length-2;i++) {
        for (int j = 0; j < s.length - 2 - i; j++) {
            if ((s[j] >= 'A' && s[j] <= 'Z') && (s[j + 1] < 'A' || s[j + 1] > 'Z')) {
                char c = s[j];
                s[j] = s[j + 1];
                s[j + 1] = c;
            }
        }
    }
    System.out.println(String.valueOf(s));

 }
}
