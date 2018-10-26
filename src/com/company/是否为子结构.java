package com.company;

public class 是否为子结构 {
    public static void main(String[] args) {

    }
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
     boolean result = false;
     //当都不为空时开始判断
     if(root1 != null && root2 != null){
         //如果根结点相同，从这个结点判断
        if(root1.val == root2.val){
            result = doseTree1HavaTree2(root1,root2);
        }
        //如果根结点不包含继续判断根的左孩子结点
        if(!result){
            result = doseTree1HavaTree2(root1.left,root2);
        }
        //如果左孩子结点不包含继续判断右孩子结点
        if(!result){
            result = doseTree1HavaTree2(root1.right,root2);
        }
     }
        return  result;

    }
public static boolean doseTree1HavaTree2(TreeNode root1, TreeNode root2){
        //如果2先遍历完返回true
          if(root2 == null){
              return true;
          }
          //如果1先遍历完返回false
          if(root1 == null){
              return false;
          }
          //如果这个俩个几点不相等返回false
          if(root1.val!=root2.val){
              return false;
          }
          //相等继续判断左孩子和右孩子
          return doseTree1HavaTree2(root1.left,root2.left) && doseTree1HavaTree2(root1.right,root2.right);
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
