package com.company;

public class 复杂链表 {
    public static void main(String[] args) {
       RandomListNode rn1 = new RandomListNode(1);
       RandomListNode rn2 = new RandomListNode(2);
       RandomListNode rn3 = new RandomListNode(3);
       RandomListNode rn4 = new RandomListNode(4);
       RandomListNode rn5 = new RandomListNode(5);
       rn1.next = rn2;
       rn1.random = rn3;
       rn2.next = rn3;
       rn2.random = rn1;
       rn3.next = rn4;
       rn3.random =rn2;
       rn4.next = rn5;
       rn4.random = rn5;
       rn5.next = null;
       rn5.random =rn4;
      RandomListNode head = Clone(rn1);
       while (head!=null){
           System.out.println(head.label);
           head = head.next;
       }
    }
    public static RandomListNode Clone(RandomListNode pHead){
        if(pHead == null){
            return null;
        }
        //保存头结点
        RandomListNode pNew = pHead;
        while(pNew!=null){
            //将创建新的复制节点放在原先节点后边 如：A->B->C->null， A->A`->B->B`->C->C`->null
            RandomListNode node = new RandomListNode(pNew.label);
            node.next = pNew.next;
            pNew.next = node;
            pNew = node.next;
        }
        //将新链表再指向头结点
        pNew = pHead;
        //将随机节点进行复制
        while(pNew!=null){
            if(pNew.random!=null){
                //随机节点也要复制随机节点的复制节点也就是next
                pNew.next.random = pNew.random.next;
            }
            //一直指向原先的节点
            pNew = pNew.next.next;
        }
         //把复制节点头拿出来
        RandomListNode head = pHead.next;
        //保存复制节点头用于返回复制链表
        RandomListNode cur = head;
        //复制原先节点头用于保存原始链表
        pNew = pHead;
        while(pNew!=null){
            pNew.next = pNew.next.next;
            if(cur.next!=null){
                cur.next = cur.next.next;
            }
            cur = cur.next;
            pNew = pNew.next;
        }
        return head;
    }


   static class RandomListNode{
        int label;
        RandomListNode next = null;
        RandomListNode random = null;
        RandomListNode(int label){
            this.label = label;
        }
    }
}
