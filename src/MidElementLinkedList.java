class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class MidElementLinkedList {
    private Node head;

    public MidElementLinkedList()
    {
        this.head = null;
    }

    public Node insert(int data)
    {
        if(head == null)
            head = new Node(data);
        else
        {
            Node newnode = new Node(data);
            Node temp = head;
            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next = newnode;
        }
        return head;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }

    public void printMiddleElement()
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element is : " + slow.data);
    }

    public static void main(String[] args) {
        MidElementLinkedList ll = new MidElementLinkedList();

        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);

        ll.display();
        ll.printMiddleElement();
    }



}
