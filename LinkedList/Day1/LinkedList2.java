package LinkedList.Day1;

public class LinkedList2 {

     private static Node convertArrtoLL(int [] arr)
     {
         Node head = new Node(arr[0]);

         Node mover = head;

             for(int i=1;i<arr.length;i++)
             {
                 Node temp = new Node(arr[i]);

                 mover.next =temp;

                 mover = temp;
             }

             return head;
     }


     private static Node insertNewHeadNode(Node head,int val){

         Node temp = new Node(head,val);

         return temp;
     }

    private static Node insertNewTailNode(Node head,int val){

        if(head==null)
        {
            return null;
        }
        Node temp = head;

        while(temp.next!=null)
        {
            temp = temp.next;

        }

        Node newNode = new Node(val);

        temp.next =newNode;

        return head;

    }


    private static Node insertKpositionNode(Node head,int val,int k)
    {

        if(head==null)
        {
            if(k==1)
            {
                return new Node(val);
            }

            else {
                return head;
            }
        }

        if(k==1)
        {
            Node temp1 = new Node(head,val);

            return temp1;
        }

        int count =0;

        Node temp = head;

        while(temp !=null)
        {
            count=count+1;

            if(count==(k-1))
            {
                Node newNode= new Node(temp,val);

               newNode.next = temp.next;

               temp.next = newNode;

               break;

            }

            temp = temp.next;


        }

        return head;


    }





    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        Node head = convertArrtoLL(arr);

        System.out.println(head.data);

        //------------Insert at head--------------------------------------

        head = insertNewHeadNode(head,100);

        System.out.println(head);

       //----------------Insert at Tail----------------------------------
        Node head2 = convertArrtoLL(arr);
        head2 = insertNewTailNode(head2,100);
        Node temp = head2;
        while(temp!=null) {

            System.out.println("Print newly added tail data..."+ temp.data);
            temp= temp.next;

        }

        //------------------------ Insert at Kth Position--------------------------

        Node head3 = convertArrtoLL(arr);

        head3 = insertKpositionNode(head3,10,3);

        Node temp2 = head3;

        while(temp2!=null) {

            System.out.println("Print newly added node at kth position data..."+ temp2.data);
            temp2= temp2.next;

        }



    }

}
