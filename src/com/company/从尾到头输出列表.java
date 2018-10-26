package com.company;


public class 从尾到头输出列表 {
    static  class  ListNode{
        int value;
        ListNode next;
    }

    public static ListNode  printListFromTailToHead(ListNode listNode) {
          ListNode y = null;
          ListNode q = null;
          ListNode p = listNode;
            while(p!=null){
                y = p.next;
                p.next =q;
                q = p;
                p = y;
            }
                return  q;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        ListNode listNode4 = new ListNode();
        ListNode listNode5 = new ListNode();

        listNode1.value = 1;
        listNode2.value = 2;
        listNode3.value = 3;
        listNode4.value = 4;
        listNode5.value = 5;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next =null;

        ListNode ss = printListFromTailToHead(listNode1);

        while(ss!=null){
            System.out.println(ss.value);
            ss = ss.next;
        }

    }
}
