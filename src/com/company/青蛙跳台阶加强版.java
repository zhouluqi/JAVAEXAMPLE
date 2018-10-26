package com.company;

public class 青蛙跳台阶加强版 {
    public static void main(String[] args) {
        System.out.println(JumpFloorII(5));
    }
    public static int JumpFloorII(int target) {
      if(target < 0){
          return -1;
      }else if(target == 1){
          return 1;
      }else {
          return JumpFloorII(target-1)<<1;
      }

    }
}
/*链接：https://www.nowcoder.com/questionTerminal/22243d016f6b47f2a6928b4313c85387
来源：牛客网

因为n级台阶，第一步有n种跳法：跳1级、跳2级、到跳n级
跳1级，剩下n-1级，则剩下跳法是f(n-1)
跳2级，剩下n-2级，则剩下跳法是f(n-2)
所以f(n)=f(n-1)+f(n-2)+...+f(1)
因为f(n-1)=f(n-2)+f(n-3)+...+f(1)
所以f(n)=2*f(n-1)
*/