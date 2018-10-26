package com.company;

import java.util.ArrayList;

public class 二叉树路径求和 {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
           ArrayList<ArrayList<Integer>>arr = new ArrayList<ArrayList<Integer>>();
           if(root==null){
               return arr;
           }
           ArrayList<Integer>a1 = new ArrayList<Integer>();
           int sum = 0;
           pa(root,target,arr,a1,sum);
          return arr;

    }
    public static void pa (TreeNode root,int targer,ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> a1,int sum){
        if(root==null){
            return;
        }
        sum=sum+root.val;

        if(root.left==null&&root.right==null){
            if(sum==targer){
                a1.add(root.val);
                arr.add(new ArrayList<Integer>(a1));
                a1.remove(a1.size()-1);
            }
            return;
        }
        a1.add(root.val);
        pa(root.left,targer,arr,a1,sum);
        pa(root.right,targer,arr,a1,sum);
        a1.remove(a1.size()-1);

    }
    static   class  TreeNode{
        int val=0;
        TreeNode left =null;
        TreeNode right =null;
        TreeNode(int val){
            this.val = val;
        }
    }
}
