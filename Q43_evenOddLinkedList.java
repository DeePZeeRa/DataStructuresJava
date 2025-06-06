class Node {
    int value;
    Node next;

    Node(int val) {
        this.value = val;
        this.next =null;
    }

    Node(int val, Node head) {
        this.value = val;
        this.next = head;
    }
}



public class Q43_evenOddLinkedList {
    static Node evenOddLL(Node head){
        if(head == null || head.next == null) return head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while(even!=null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
            // temp = temp.next;
        }
        odd.next = evenHead;
        return head;
    }
    
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

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5 ,6};
        Node head = convertArrayToLL(arr);
        Traverse(head);
        head = evenOddLL(head);
        Traverse(head);

    }
}
