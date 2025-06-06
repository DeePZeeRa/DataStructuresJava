// Sort a linked list of 0s, 1s and 2s
// Last Updated : 27 Aug, 2024
// Given a linked list of 0s, 1s and 2s, The task is to sort the list in non-decreasing order.

// Examples: 

// Input: 1 -> 1 -> 2 -> 0 -> 2 -> 0 -> 1 -> NULL
// Output: 0 -> 0 -> 1 -> 1 -> 1 -> 2 -> 2 -> NULL

// Input: 1 -> 1 -> 2 -> 1 -> 0 -> NULL
// Output: 0 -> 1 -> 1 -> 1 -> 2 -> NULL 

// [Expected Approach - 1] By Maintaining Frequency - O(n) Time and O(1) Space:
// The idea is to traverse the linked List and count the number of nodes having values 0, 1 and 2 and store them in an array of size 3, say cnt[] such that

// cnt[0] = count of nodes with value 0
// cnt[1] = count of nodes with value 1 
// cnt[2] = count of nodes with value 2
// Now, traverse the linked list again to fill the first cnt[0] nodes with 0, then next cnt[1] nodes with 1 and finally cnt[2] nodes with 2.







class SNode {
    int value;
    SNode next;

    SNode(int val) {
        this.value = val;
        this.next = null;
    }

    SNode(int val, SNode head) {
        this.value = val;
        this.next = head;
    }
}


public class Q44_sort0s1s2s {
    static SNode sort0s1s2s(SNode head){
        if(head == null || head.next == null) return head;
        SNode zeroHead = new SNode(-1);
        SNode one = zeroHead;
        SNode oneSNode = new SNode(-1);
        SNode two = oneSNode;
        SNode twoSNode = new SNode(-1);
        SNode three = twoSNode;

        SNode temp = head;

        while(temp!=null){
            if(temp.value == 0){
                SNode newSNode = new SNode(temp.value);
                zeroHead.next = newSNode;
                zeroHead = zeroHead.next;
            }else if(temp.value == 1){
                SNode newSNode = new SNode(temp.value);
                oneSNode.next = newSNode;
                oneSNode = oneSNode.next;

            }else if(temp.value==2){
                SNode newSNode = new SNode(temp.value);
                twoSNode.next = newSNode;
                twoSNode = twoSNode.next;
            }
            temp = temp.next;
            
        }
        zeroHead.next = two.next;
        oneSNode.next = three.next;
        return one.next;
 
    }
    
    static SNode convertArrayToLL(int[] arr) {
        SNode head = new SNode(arr[0]); // create a new SNode (indicated as head)
        SNode current = head; // assign a MOVER/iterator/currentSNodePointer and it will be head
        for (int i = 1; i < arr.length; i++) {// loop for each elements in the array
            SNode newSNode = new SNode(arr[i]); // new SNode of data = arr[i]
            current.next = newSNode; // currentPointer(next) block of the current pointing SNode
            current = newSNode; // changing the pointer to next newely created SNode
        }
        return head;
    }
    // ==================================================================================

    // ======================================
    // ! Traversal of the LL
    static void Traverse(SNode head) {
        SNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        int[] arr = { 0,0,0,1,1,1,2,0,2,0,1,1,0 };
        SNode head = convertArrayToLL(arr);
        Traverse(head);
        head = sort0s1s2s(head);
        Traverse(head);

    }


}
