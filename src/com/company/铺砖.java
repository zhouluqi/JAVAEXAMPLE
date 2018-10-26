package com.company;

public class 铺砖 {
    public static void main(String[] args) {
        System.out.println( RectCover(2));

    }
    public static int RectCover(int target) {
        if(target <= 0){
            return 0;
        }
       if(target==1){
           return 1;
       }else if(target == 2){
            return 2;

       }else{
           return RectCover(target-1)+RectCover(target-2);
       }
    }
}
/*链接：https://www.nowcoder.com/questionTerminal/72a5a919508a4251859fb2cfb987a0e6
来源：牛客网

有以下几种情形：
1target <= 0 大矩形为<= 2*0,直接return 1；
2target = 1大矩形为2*1，只有一种摆放方法，return1；
3target = 2 大矩形为2*2，有两种摆放方法，return2；
4target = n 分为两步考虑：
        第一次摆放一块 2*1 的小矩阵，则摆放方法总共为f(target - 1)
√

√

第一次摆放一块1*2的小矩阵，则摆放方法总共为f(target-2)
因为，摆放了一块1*2的小矩阵（用√√表示），对应下方的1*2（用××表示）摆放方法就确定了，所以为f(targte-2)
√	√

×	×

*/