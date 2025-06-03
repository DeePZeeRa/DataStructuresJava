class node{
    int value;
    node next;
    node prev;

    node(int val){
        this.value = val;
    }

    node(int val , node next, node prev){
        this.value = val;
        this.next = next;
        this.prev = prev;
    }
}



public class J27_reverseDLL {
    static node convertToLL(int[] arr) {
        node head = new node(arr[0]);
        node prev = head;
        for (int i = 1; i < arr.length; i++) {
            node temp = new node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    static void Traversal(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print("|"+temp.value+"|" + "<==>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
    }
    // method 1 (by me)


    static node reverseDLLusingFrontRear(node head){
        //  check empty
        if (head == null){
            return null;
        }
        node temp = head;
        node front = temp; // front pointer
        int count =1 ; // used to count no of elements
        // reach to last element with value
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        // System.out.println("no of elements "+ count);
        float mid = count/2; // find the mid
        node rear = temp; // rear pointer
        // System.out.println(mid);
        int i = 0; // iterator
        while(i<mid){
            // swap
            int t = front.value;
            front.value = rear.value;
            rear.value = t;
            //
            front = front.next; // move right
            rear = rear.prev; // move left
            i++;
        }

        return head;

    }
    static node reverseLinks(node head){
        if(head == null || head.next ==null){
            return head;
        }

        node currNode = head;
        node prev = null;
        // single pass
        while(currNode!= null){
            prev = currNode;
            node temp = currNode.prev;
            currNode.prev = currNode.next;
            currNode.next = temp;
            currNode = currNode.prev;
        }
        return prev;
    }

    // method 2 ( not swapping ) interview Q

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 1,4 };
        node head = convertToLL(arr);

        Traversal(reverseDLLusingFrontRear(head));
        Traversal(reverseLinks(head));
    }
    
}
