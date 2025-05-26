package linkedList;

import java.util.List;

class listNode {
    int val;
    listNode next;

    listNode(int val)
    {
        this.val=val;
    }
}

public class reversedList {
    public static listNode reversNode(listNode head)
    {
        listNode prev = null;
        listNode curr = head;

        while(curr != null)
        {
            listNode next =curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    public static void printnode(listNode head)
    {
        while (head != null) {
            System.out.println(head+"->");
            head = head.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        listNode head = new listNode(1);
        head.next =new listNode(2);
        head.next.next =new listNode(3);
        head.next.next =new listNode(4);
        
        printnode(head);

        listNode r = reversNode(head);
        printnode(r);

    }
}

