// import java.util.Scanner;

class Node{
    int data;
    Node nextNode;

    Node(int data1, Node nextNode1){
        this.data = data1;
        this.nextNode = nextNode1;
    }
    Node(int data1){
        this.data = data1;
        this.nextNode = null;
    }
}



public class J25_striver_LinkedList {
    private static int size = 0;  //? count no of elements


    //! conversion of array to LL
    private static Node convertArrayToLL(int[] arr) {
        Node head = new Node(arr[0]); // create a new node (indicated as head)
        Node current = head; //assign a MOVER/iterator/currentNodePointer and it will be head
        for (int i = 1; i < arr.length; i++) {// loop for each elements in the array
            Node newNode = new Node(arr[i]); // new node of data = arr[i]
            current.nextNode = newNode; // currentPointer(next) block of the current pointing node
            current = newNode; // changing the pointer to next newely created node
            J25_striver_LinkedList.size +=1;
        }
        return head;
    }



    //! Traversal of the LL
    private static void Traverse(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.nextNode;
        }
        System.out.println("Null");
    }
    


    //! count no of elements in a Linked list
    public static int Count(Node head) {
        int count =  0;
        Node temp = head.nextNode;
        while (temp != null) {
            count +=1;
            temp = temp.nextNode;
        }
        return count;
    }



    //! remove 1st element/head of the LL 
    public static Node removeHead(Node head){
        if(head == null) return head;
        head = head.nextNode;
        return head;
    }


    //!remove kth element of the LL
    public static Node removeKthElement(Node head, int index){
        // checking if LL is empty or not
        if(head == null){
            return head;
        }
        // checking if 1 element is there, then
        if(index == 1){
            head=head.nextNode;
            return head; 
        }

        Node temp = head; // mover
        Node prev = null; // keep track of previous visited node by temp
        int count = 0;
        while(temp!=null){
            count++;
            if(count == index){
                // prev.nextNode = prev.nextNode.nextNode;
                // OR
                prev.nextNode = temp.nextNode;
                break;
            }
            prev = temp;
            temp = temp.nextNode;
        }
        return (head);
    }






    //! remove by value
    public static Node removeElement(Node head, int value) {
        // checking if LL is empty or not
        if (head == null) {
            return head;
        }
        // checking if 1 element is there, then
        if (head.data==value ) {  //? only change
            head = head.nextNode;
            return head;
        }

        Node temp = head; // mover
        Node prev = null; // keep track of previous visited node by temp
        while (temp != null) {
            if ( temp.data== value) {  //? only change
                // prev.nextNode = prev.nextNode.nextNode;
                // OR
                prev.nextNode = temp.nextNode;
                break;
            }
            prev = temp;
            temp = temp.nextNode;
        }
        return (head);
    }


    // ! remove last element/head of the LL
    public static Node removeTail(Node head) {
        if (head == null )
            return null;
        Node temp = head.nextNode;
        // move temp till 2nd last Node
        while (temp.nextNode.nextNode != null) {
            temp = temp.nextNode;
        }
        // once you reached the 2nd last node, then 
        temp.nextNode = null;
        return head;
    }




    //* Insertion part */

    //! insert at start
    public static Node insertHead(Node head,int val){
        return new Node(val, head);
    }

    //! insert at last
    public static Node insertTail(Node head, int val) {
        Node newNode = new Node(val);
        if(head == null){
            return new Node(val);
        }
        Node temp = head;
        while(temp.nextNode !=null){
            temp=temp.nextNode;
        }
        temp.nextNode = newNode;
        return head;
    }


    // ! insert at kth element
    public static Node insertElement(Node head, int val,int index) {
       
        if (head == null) {
            if(index==1) 
                return new Node(val);
            else
                return null;
        }
        if(index ==1 ){
            head = new Node(val,head);
            return  head;
        }
        Node temp = head;
        int i = 0;
        
        while (temp != null) {
            i++;
            if(i==index){
                Node newNode = new Node(val);
                newNode.nextNode = temp.nextNode;
                temp.nextNode = newNode;
                return head;
            }
            temp = temp.nextNode;
        }
        return null;
    }


    public static void main(String[] args) {
        // Node list = new Node(33);
        // System.out.println(list.data);

        // convert array to LL
        int[] arr  = {3,3,4,5,6};
        Node headd = convertArrayToLL(arr);
        System.out.println(headd.nextNode.nextNode.nextNode.data);

        Traverse(headd);
        System.out.println(J25_striver_LinkedList.size);


        //! remove 1st element
        // headd = removeHead(headd);
        // Traverse(headd);
        // headd = removeTail(headd);
        // Traverse(headd);


        //! remove kth element
        // Scanner sc = new Scanner(System.in);
        // int index = sc.nextInt();
        Node start  = removeKthElement(headd, 3);
        Traverse(start);
        // sc.close();

        //! insertion 
        Node head = insertTail(headd, 5);
        // Node  head = insertElement(headd, 23, 1);
        Traverse(head);

        
    }

    
}
