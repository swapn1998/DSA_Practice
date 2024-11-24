package LinkedList.Day1;

public class Node {

    int data;
    Node next;

    public Node(int data1,int next1){
        this.data=data1;
        this.next=next;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }

    public Node(Node head, int val) {

        this.data=val;
        this.next=head;
    }
}
