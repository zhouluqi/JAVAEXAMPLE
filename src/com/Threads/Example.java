package com.Threads;

public class Example {
    public static Example t1 = new Example();
    {
        System.out.println("blockA");
    }
    static
    {
        System.out.println("blockB");
    }

    public static void main(String[] args)
    {
        Example t2 = new Example();
    }


}