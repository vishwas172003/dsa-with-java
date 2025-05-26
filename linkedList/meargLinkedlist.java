package linkedList;
class listNode{
    int val;
    listNode next; 
    listNode(int val){
        this.val=val;
    }

}
public class meargLinkedlist {

    public static listNode meargListNode(listNode list1,listNode list2){
        listNode dummy = new listNode(-1);
        listNode curr = dummy;

        while(list1 != null && list2 != null)
        {
            if(list1.val < list2.val)
            {
                curr.next = list1;
                list1 = list1.next;
            }
            else
            {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null)
        {
            curr.next =list1;
        }
        else
        {
            curr.next=list2;
        }
        return dummy.next;
    }
    public static void printnode(listNode head)
    {
        while (head != null) {
        System.out.println(head+"->");
        head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        listNode list1 =new listNode(1);
        list1.next =new listNode(2);
        list1.next.next =new listNode(3);

        listNode list2 =new listNode(1);
        list1.next =new listNode(4);

        printnode(list1);
        printnode(list2);

        listNode m= meargListNode(list1, list2);

        printnode(m);
    }
}
