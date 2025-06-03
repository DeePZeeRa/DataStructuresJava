class Node2 {
    int value;
    Node2 next;

    Node2(int val) {
        this.value = val;
        this.next = null;
    }

    Node2(int val, Node2 next) {
        this.value = val;
        this.next = next;
    }
}



public class Q41_ReverseLL {
    private static Node2 ReverseLL(Node2 head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        //-----------main logic----------
        Node2 temp = head;
        Node2 prev = null;
        Node2 nextt ;
        
        while(temp!=null){
            nextt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextt;
        }
        return prev;
    }


    // ! conversion of array to LL
    private static Node2 convertArrayToLL(int[] arr) {
        if (arr.length == 0)
            return null; // Add this check
        Node2 head = new Node2(arr[0]);
        Node2 current = head;
        for (int i = 1; i < arr.length; i++) {
            Node2 newNode2 = new Node2(arr[i]);
            current.next = newNode2;
            current = newNode2;
        }
        return head;
    }
    
    private static void Traverse(Node2 head) {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        int[] arr = { 3, 3, 4, 5, 6 };
        Node2 head = convertArrayToLL(arr);
        Traverse(head);
        head = ReverseLL(head);
        Traverse(head);
        
    }
}
