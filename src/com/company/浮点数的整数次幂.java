package com.company;

public class 浮点数的整数次幂 {
    public static void main(String[] args) {
        System.out.println(Power(2.0,3));
    }
    public static double Power(double base, int exponent) {
        double sum = 1;
        for(int i=0;i<Math.abs(exponent);i++){
            sum*=base;
        }
        if(exponent<0){
            sum=1/sum;
        }
        return sum;
    }
}
