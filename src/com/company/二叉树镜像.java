package com.company;

public class 二叉树镜像 {
    public static void main(String[] args) {

    }
    public void Mirror(TreeNode root) {
       if(root == null){
           return;
       }
       if(root.left == null && root.right == null){
           return;
       }
       TreeNode temp = root.left;
       root.left = root .right;
       root.right = temp;
       if(root.left!=null){
           Mirror(root.left);
       }
       if(root.right!=null){
           Mirror(root.right);
       }
    }
    static class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode (int val){
            this.val = val;
        }

    }
}
