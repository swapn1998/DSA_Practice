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


    private static Node deleteHeadNode(Node head){

        if(head== null)
        {
            return null;
        }

        head = head.next;

        return head;
    }


    private static Node deleteTailNode(Node head){


        if(head==null || head.next== null)
        {
            return null;
        }

        Node temp = head;

        while(temp.next.next!=null)
        {

            temp = temp.next;

        }

        temp.next = null;



        return temp;

    }


    private static Node DeleteKElement(Node head,int k){

        if(head==null)
        {
            return null;
        }

        if(k==1)
        {
            head= head.next;
            return head;
        }

        int count=0;
        Node prev= null;
        Node temp = head;

        while(temp!=null)
        {
            count = count + 1;

            if(count==k)
            {
                prev.next = prev.next.next;

                temp.next= null;

                break;

            }

            prev = temp;

            temp = temp.next;

        }

        return head;

    }


    private static Node deleteKNodeValueBased(Node head, int value){

        if(head==null)
        {
            return null;
        }

        if(head.data == value)
        {
            head = head.next;
            return head;
        }

        Node prev1 = null;
        Node temp = head;

        while(temp!=null)
        {
            if(temp.data==value)
            {
                prev1.next = prev1.next.next;
                break;
            }

            prev1 = temp;
            temp = temp.next;


        }

        return head;
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


        head = deleteHeadNode(head);

        Node tail = convertArr2LL(arr);
         tail =  deleteTailNode(head);


        System.out.println("Start Data point.."+ head.data);

        System.out.println("length of array : "+count);

        System.out.println("Is element present in the linked list: "+ check);

        System.out.println("For deletion head Node, next starting head..."+ head.data);

        System.out.println("tail Node : "+ tail.data);

        //---------------------------------------------------------------
        Node deletekNode = convertArr2LL(arr);

        Node temp2 = DeleteKElement(deletekNode,2);

        while(temp2!=null)
        {
            System.out.println("Data Print after deleting node based on pos ition.."+ temp2.data + " ");
            temp2 = temp2.next;
        }

        //--------------------------------------------------------------------

        Node deleteKNodeValue = convertArr2LL(arr);

        Node temp3 = deleteKNodeValueBased(deleteKNodeValue,4);

        while(temp3!=null)
        {
            System.out.println("Data Print after deleting node based on value.."+ temp3.data + " ");
            temp3 = temp3.next;
        }




    }
}
