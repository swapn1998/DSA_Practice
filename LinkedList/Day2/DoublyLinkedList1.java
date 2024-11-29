package LinkedList.Day2;

public class DoublyLinkedList1 {

         public static Node convertArrToDLL(int[] arr){

             Node head =new Node(arr[0],null,null);
             Node prev = head;

             for(int i=1;i<arr.length;i++)
             {
                 Node temp = new Node(arr[i],null,prev);
                 prev.next=temp;
                 prev = temp;
             }
             return head;


         }

         public static void printDoublyLL(Node head){

             Node temp1 = head;

             while(temp1!=null)
             {
                 System.out.println("Next Node data :"+temp1.data +" ");
                 temp1= temp1.next;
             }

         }

         // Delete the head of the linked List

    public static Node deleteHeadLL(Node head){

             if(head==null || head.next==null)
             {
                 return null;
             }

             Node prev = head;

             head = head.next;

             head.back=null;

             prev.next =null;

             return head;

    }


    // Delete tail of the linked List

    public static Node deleteTailLL(Node head){


             Node tail =head;


             while(tail.next!=null)
             {
                 tail= tail.next;
             }

            Node prev = tail.back;
             prev.next = null;
             tail.back=null;

             return head;

    }


    public static void main(String[] args) {

     int[] arr ={1,2,3,4,5};
     Node head = convertArrToDLL(arr);

     head= deleteHeadLL(head);

        System.out.println("Deleted head list of LL : ");
        printDoublyLL(head);

     //Delete Tail of LL

        Node head2 = convertArrToDLL(arr);

        head2= deleteTailLL(head2);

        System.out.println("Deleted tail list of LL : ");
        printDoublyLL(head2);



    }


}
