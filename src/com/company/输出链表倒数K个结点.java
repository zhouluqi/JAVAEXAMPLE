package com.company;

import java.util.Stack;

public class 输出链表倒数K个结点 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        head.next = l2;
        l2.next = l3;
        System.out.println( FindKthToTail(head,1).val);



    }
    public static ListNode FindKthToTail(ListNode head,int k){
        Stack<ListNode> st = new Stack<ListNode>();
        int count = 0;
        while(head!=null){
            st.push(head);
            head = head.next;
            count++;
        }
        if(k>count || k<=0){
            return null;
        }
        for(int i = 1;i<k;i++){
            st.pop();
        }

        return st.pop();
    }
  static   class  ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }
}
/*
* 1.将结点放入到栈中，倒数k个 空 pop k-1个,然后将栈顶弹出。注意对K值得判断才为关键  借助栈
*
* 2.还有最简单的方式也是求倒数K的通用方法，就是初始化俩个指针，让一个走K步，然后一起走，中间距离为K，先走的
* 到达终点后走的即为倒数第K个数。
*
* */