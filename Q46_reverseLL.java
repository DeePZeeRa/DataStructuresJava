class Node {
    int value;
    Node next;

    Node(int val) {
        this.value = val;
        this.next = null;
    }

    Node(int val, Node head) {
        this.value = val;
        this.next = head;
    }
}



public class Q46_reverseLL {
    

    static Node convertArrayToLL(int[] arr) {
        Node head = new Node(arr[0]); // create a new node (indicated as head)
        Node current = head; // assign a MOVER/iterator/currentNodePointer and it will be head
        for (int i = 1; i < arr.length; i++) {// loop for each elements in the array
            Node newNode = new Node(arr[i]); // new node of data = arr[i]
            current.next = newNode; // currentPointer(next) block of the current pointing node
            current = newNode; // changing the pointer to next newely created node
        }
        return head;
    }
    // ==================================================================================

    // ======================================
    // ! Traversal of the LL
    static void Traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }


    // iterative approach
    static Node reverseLL(Node head){
        if( head == null || head.next == null){
            return head;
        }
        Node current = head;
        Node rear = null;
        Node front = head;

        while(current!=null){
            front = current.next;
            current.next = rear;
            rear = current;
            current = front;

        }
        return rear;
    }

    // recursion

    static Node reverseRecursively(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        // create new head which will be get from recusion
        Node newHead = reverseRecursively(head.next);
        Node  front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
        
    }


    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = convertArrayToLL(arr);
        Traverse(head);
        head = reverseLL(head);
        Traverse(head);
    }
    
}
