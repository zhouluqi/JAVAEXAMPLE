package com.company;

import java.sql.Array;
import java.util.Arrays;

public class 重建二叉树 {
    static  class TreeNode{
        public  int val;
        public TreeNode left;
        public TreeNode right;

    }

    public static void main(String[] args) throws Exception {
        int[] presort = {1,2,4,7,3,5,6,8};
        int[] insort = {4,7,2,1,5,3,8,6};
        TreeNode root =  reConstructBinaryTree(presort,insort);
    }

    public static TreeNode reConstructBinaryTree(int[] pre,int[] in) throws Exception {
        if(pre == null || in == null){
            return null;
        }
        if(pre.length != in.length){
            throw  new Exception("长度不一样，非法的输入");
        }
        TreeNode root = new TreeNode();
        for(int i = 0;i<in.length;i++){
            if(in[i] == pre[0]){
                root.val = in[i];
                System.out.println(root.val);
                root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return  root;
    }
}
