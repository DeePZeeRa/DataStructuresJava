
public class J25_LinkedList {
    // declaring head and tail
    private Node head;
    private Node tail;
    private int size;

    public J25_LinkedList(){
        this.size = 0;
    }
public void insertFirst(int val){
    Node node = new Node(val);
    node.next = head;
    head = node;

    if(tail == null){
        tail = head;
    }
    size++;
    // Print values instead of object references
    System.out.println("|" + val + "|.." + "|head=" + (head != null ? head.value : "null") + "|.." + "|tail=" + (tail != null ? tail.value : "null") + "|");
}
    public void traverse(){
        Node temp = head; // creating a new Node temp --> head
        while (temp!=null) {
            System.out.print(temp.value + "-->");
            temp=temp.next; // we will move to next node
                
        }
        System.out.println("End");   
    }
    
    private class Node{
        private int value;
        private Node next;

        //size initialization
        

        // constructor
        public Node(int value){
            this.value = value;
        }

        // constructor 2
        public Node(int value,int next) {
            this.value = value;
        }
    }


    public static void main(String[] args) {
        J25_LinkedList list = new J25_LinkedList();
        list.insertFirst(10);
        list.insertFirst(12);

        list.traverse();
    }
}
