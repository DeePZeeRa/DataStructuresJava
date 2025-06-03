class DNode{
    int value;
    DNode next;
    DNode prev;

    DNode(int val){
        this.value = val;
    }
    DNode(int val , DNode next, DNode prev){
        this.value = val;
        this.next = next;
        this.prev = prev;
    }
}


public class J26_DoubllyLL {
    static DNode convertToLL(int [] arr){
        DNode head = new DNode(arr[0]);
        DNode prev = head;
        for(int i= 1 ;i<arr.length;i++){
            DNode temp = new DNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    static void Traversal(DNode head){
        DNode temp = head;
        while (temp!=null) {
            System.out.print(temp.value + "-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //! DELETION OF HEAD 
    private static DNode deleteHead(DNode head){
        if(head == null || head.next == null){
            return null;
        }
        DNode prev = head; // stoing it to return deleted one
        head = head.next; //go to next
        head.prev = null; // head.next has prev, so we are removing head.prev
        prev.next = null; 
        return head;
    }

    //! deletion of tail
    private static DNode deleteTail(DNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        // iterate till 2nd end
        DNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        DNode newTail = temp.prev;
        newTail.next = null;
        temp.prev = null;
        return head;
    }

    private static DNode deleteKthNode(DNode head,int index) {
        if (head == null || head.next == null) {
            return null;
        }
        // iterate till 2nd end
        DNode temp = head;
        int count = 0;
        while (temp!=null) {
            count++;
            if(index == count){
                break;
            }
            temp=temp.next;
        }


        DNode forwardNode = temp.next; //prev node
        DNode backwardNode = temp.prev; // next node
        // if its a single element in LL
        if(backwardNode == null && forwardNode == null ){
            return null;
        }else if(backwardNode == null){ //i.e its just head
            head=head.next;
            return head ;
        }else if(forwardNode == null){ // i.e its tail element
            DNode newTail = temp.prev;
            newTail.next = null;
            temp.prev = null;
            return head;
        }
        // remove the kth element
        backwardNode.next = forwardNode;
        forwardNode.prev = backwardNode;
        temp.next = null;
        temp.prev = null;
        return head;
    }

    // delete function to just delete a node
    static void deleteNode(DNode node){
        DNode prev = node.prev;
        DNode front = node.next;

        if(front == null){
            prev.next = null;
            node.prev = null;
            return;
        }
        prev.next = front;
        front.prev = prev;
    }



    //* INSERTION  */
    static DNode insertEnd(DNode head, int value){
        if(head==null||head.next == null){
            return head;
        }
        
        DNode temp = head;

        while (temp != null){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        DNode newNode = new DNode(value,null,temp);
        temp.next = newNode;
        return head;
    }



    static DNode insertBegin(DNode head,int value){
        if(head == null){
            DNode newNode = new DNode(value);
            return newNode;
        }
        DNode temp = head;
        DNode newNode = new DNode(value,temp,null);
        temp.prev = newNode;
        return newNode;
    }

    static DNode insertKthElement(DNode head, int value, int index){
        if (head == null) {
            return null;
        }

        DNode temp = head;

        // check if its the first index 
        // insertBegin
        if(index== 1){
            DNode newNode = new DNode(value, temp, null);
            temp.prev = newNode;
            return newNode;
        }
        int count = 0;
        while(temp!=null){
            count++;
            if(count == index -1){
                break;
            }
            temp = temp.next;
            if(temp.next == null){
                insertEnd(head, value);
                return head;
            }
        }
        DNode newNode = new DNode(value, temp.next, temp);
        temp.next.prev = newNode;
        temp.next= newNode;
        return head;

    }


    public static void main(String[] args) {
        int[] arr = { 3,4,5,6,1};
        DNode head = convertToLL(arr);
        Traversal(head);
        // head = deleteKthNode(head,5);
        // Traversal(head);
        // insertion
        // Traversal(insertEnd(head,43));
        // Traversal(insertBegin(head, 43));
        Traversal(insertKthElement(head,45,6));
    }
}
