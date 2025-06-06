//19. Remove Nth Node From End of List


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



public class Q45_removeNthNodeFromTheEnd {
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

    static Node NthElementLast(Node head, int n){
        if(head == null || head.next == null){
            return null;
        }

        Node fast = head;
        for(int i = 0;i<n;i++){
            fast = fast.next;
        }

        // for first element
        if(fast == null) return head.next;
        Node slow = head;

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = convertArrayToLL(arr);
        Traverse(head);
        head = NthElementLast(head,5);
        Traverse(head);

    }
}
