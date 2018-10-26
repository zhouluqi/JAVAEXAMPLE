package com.LeetCode.primary.String;
import java.util.Scanner;

public class 反转字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String ss = reverseString(str);
        System.out.println(ss);
    }
    public static String reverseString(String s) {
      char[] a = s.toCharArray();
      char temp;
      for(int i=0;i<a.length/2;i++){
          temp = a[i];
          a[i] = a[a.length-1-i];
          a[a.length-1-i] = temp;
      }
      return new String(a);
    }
}
