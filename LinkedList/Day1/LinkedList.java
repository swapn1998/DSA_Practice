package LinkedList.Day1;

public class LinkedList {

    private static Node convertArr2LL(int[] arr){

        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i<arr.length;i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }

        return head;

    }

    private static int LengthOfLL(Node head){

        int count = 1;

        Node temp = head;


        while(temp!=null)
        {
            count=count+1;

            temp=temp.next;

        }

        return count;



    }


    private static boolean isPresent(Node head, int val)
    {
        Node temp = head;

        while(temp!=null)
        {
            if(temp.data== val)
            {
                return true;
            }
            temp = temp.next;
        }

        return false;

    }





    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        Node head = convertArr2LL(arr);

        int count = LengthOfLL(head);

        boolean check = isPresent(head,2);

        Node temp = head;

        while(temp!=null)
        {
            System.out.println("Data Print.."+ temp.data + " ");
             temp = temp.next;
        }

        System.out.println("Start Data point.."+ head.data);

        System.out.println("length of array : "+count);

        System.out.println("Is element present in the linked list: "+ check);

    }
}
