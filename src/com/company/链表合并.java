package com.company;

public class 链表合并 {
    public static void main(String[] args) {

    }
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode hebing = new ListNode(1);
        ListNode head = hebing;
      while(true){
          if(list1 != null && list2 != null){
              if(list1.val <= list2.val){
                  hebing.next = list1;
                  list1 = list1.next;
                  hebing =hebing.next;
              }else{
                  hebing.next =list2;
                  hebing = hebing.next;
                  list2 = list2.next;
              }
          }else if(list1 != null && list2 == null){
              hebing.next = list1;
              hebing = hebing.next;
              list1 = list1.next;
          }else if(list2 != null && list1 == null){
              hebing.next = list2;
              hebing = hebing.next;
              list2 = list2.next;
          }else {
              break;
          }
      }
      return head.next;
    }
   static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
}
/*
* 死循环对list1和list2判断，三种情况，都不为null比较大小，都为null break,其中一个为null 另一个直接赋值
* */