import java.util.List;
import java.util.Scanner;

public class OddEvenLinkedList {
    public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     //ListNode(int val) { this.val = val; }
     //ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode head = new ListNode();
        int val;
        System.out.println("Enter values");
        val = sc.nextInt();

        while(val>=0)
        {
            ListNode newnode = new ListNode();
            if(head == null) {
                head = newnode;
                val = sc.nextInt();
                continue;
            }
            ListNode tmp = head;
            while(tmp.next != null)
            {
                tmp=tmp.next;
            }
            tmp.next = newnode;
            val = sc.nextInt();
        }
        ListNode tmp = head;
        while(tmp!=null)
        {
            System.out.print(tmp.val + " ");
            tmp=tmp.next;
        }
    }
}
