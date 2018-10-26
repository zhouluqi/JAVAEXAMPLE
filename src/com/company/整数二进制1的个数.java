package com.company;

public class 整数二进制1的个数 {
    public static void main(String[] args) {

    }
    public int NumberOf1(int n) {
      int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
}
/*逐渐把1吃掉，每次&操作把自身的1位干掉，直到都为0*/