package com.onlinecode;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class 集合合并 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<Integer>();
        while(scanner.hasNext()){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            for(int i=1; i<=m+n;i++){
                set.add(scanner.nextInt());
            }
            Iterator<Integer> it = set.iterator();
            while(it.hasNext()){
                System.out.print(it.next());
                if(it.hasNext()){
                    System.out.print(" ");
                }
            }
        }
    }
}
