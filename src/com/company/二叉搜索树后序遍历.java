package com.company;

public class 二叉搜索树后序遍历 {
    public static void main(String[] args) {

    }
    public static boolean VerifySquenceOfBST(int [] sequence) {
              if(sequence.length==0){
                  return false;
              }
        return isTreeBST(sequence,0,sequence.length-1);
    }
    public static boolean isTreeBST(int[] sequencd,int start,int end){
        if(start<end){

        }
        int i =start;
        for(;i<end;i++ ){
           if(sequencd[i]>sequencd[end]){
               break;
           }
        }
        for(int j=i;j<end;j++){
            if(sequencd[j]<sequencd[end]){
                return false;
            }
        }
        return isTreeBST(sequencd,start,i-1)&&isTreeBST(sequencd,i,end-1);
    }
}
