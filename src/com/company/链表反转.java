package com.company;

public class 链表反转 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        head.next = l2;
        l2.next = l3;
        System.out.println(ReverseList(head).val);
    }
    public static ListNode ReverseList(ListNode head) {

        ListNode flast = null;
        ListNode p ;
        while(head!=null){
            p = head;
            head = head.next;
            p.next = flast;
            flast = p;
        }
        return flast;

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
* 将链表一个一个的卸下，卸下的next值为之前卸下的，第一个卸下的next为null。
*
* */
