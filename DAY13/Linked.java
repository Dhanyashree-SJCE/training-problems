package DAY13;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedList
{
    Node head;
    public void insertAtStart(int data)
    {
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data)
    {
        Node newNode= new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=newNode;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        // System.out.println(temp.data+"->");
        // System.out.println("null");
    }
    public void deleteAtStart()
    {
        if(head==null) return;
        head=head.next;
    }
    public void deleteAtEnd()
    {
        Node temp=head;
        if(head==null) return;
        if(head.next==null)
        {
            head=null;
        }
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public void insertAtPosition(int position,int data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        if(position==0) 
        {
            newNode.next=head;
            head=newNode;
        }
        for(int i=0;i<position;i++)
        {
            if(temp==null) return;
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deleteAtPosition(int position)
    {
        if(head==null) return;
        if(position==0) head=head.next;
        Node temp=head;
        for(int i=0;i<position-1;i++)
        {
            if(temp.next==null) return;
            temp=temp.next;
        }
        if(temp.next!=null)
        {
            temp.next=temp.next.next;
        }
   }
}
public class Linked {
    public static void main(String[] args) {
     LinkedList list= new LinkedList();
     list.insertAtStart(10);
     list.insertAtEnd(30);
     list.display();
     //list.deleteAtStart();
    //  list.deleteAtEnd();
    //  list.display();
     list.insertAtPosition(0 ,12);
     list.display();
     list.deleteAtPosition(2);
     list.display();

    }
}
