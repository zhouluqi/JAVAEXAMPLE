package com.company;

import java.util.ArrayList;

public class 二维数组逆时针打印 {
    public static void main(String[] args) {
     int[][] a = new int[4][];
    }
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(matrix.length==1){
            for(int i =0;i<matrix.length;i++){

                list.add(matrix[0][i]);
            }
            return list;
        }else {

            while(matrix.length>=1){
            int hang =matrix.length;
            int lie = matrix[0].length;
            for(int i =0;i<lie;i++){
                list.add(matrix[0][i]);
            }
            matrix = shanchu(matrix);
            matrix = nizhuan(matrix);
            }
            return list;
        }



    }
    public static int[][] nizhuan(int [][] matrix){
        int[][] a = new int[matrix[0].length][matrix.length];
        int i,j;
        int len = matrix.length*matrix[0].length;
        for(i=0; i<len/2; ++i)
        {
            //转置矩阵
            for(j=i+1; j<len/2; j++)
               a[j][i] =matrix[i][j];
                //swap(&b[i][j],&b[j][i]);
            //每行对半交换
            for(j=0; j<len/2/2; j++)

               a[i][j] = matrix[i][len/2-1-j];
               // swap(&b[i][j],&b[i][len/2-1-j]);
        }
        return  a;

    }
    public static int[][] shanchu(int [][] matrix){
        int[][] a = new int[matrix.length-1][matrix[0].length];
            for(int i = 0;i<matrix.length-1;i++){
                for(int j = 0;j<matrix[0].length;j++){
                    a[i][j]=matrix[i+1][j];
                }
            }
        return  a;
    }
}
