package com.company;

public class 排序二叉树节点连接 {

   static TreeNode head;
   static TreeNode realHead;
    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        Convert(tn);


    }
    public static TreeNode Convert(TreeNode pRootOfTree) {
       RealConvert(pRootOfTree);
       return realHead;
    }
    public static void RealConvert(TreeNode root){
        if(root==null){
            return;
        }
        RealConvert(root.left);
        if(head==null){
            head = root;
            realHead = root;
        }else {
            head.right = root;
            root.left = head;
            head = root;
        }
        RealConvert(root.right);

    }
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
