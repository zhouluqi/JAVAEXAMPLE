package com.onlinecode;

public class test01 {

    public static void main(String[] args) {
        System.out.println(A.a);
    }

   static class A{
        public static final String a = "B";
        static {
            System.out.println("A");
        }
    }
}
