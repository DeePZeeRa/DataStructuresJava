//! 2. Add Two Numbers
// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//? Input: l1 = [2,4,3], l2 = [5,6,4]
//? Output: [7,0,8]
// Explanation: 342 + 465 = 807.
// Example 2:

// Input: l1 = [0], l2 = [0]
// Output: [0]
// Example 3:

// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]


class Node{
    int value;
    Node next;

    Node(int val){
        this.value = val;
    }
    Node(int val,Node head){
        this.value = val;
        this.next = head;
    }
}


class Q42_2_addTwoNumberLL{
    static Node add2LL(Node head1,Node head2){
        if(head1 == null || head2 == null) return head1;
        Node temp1 = head1; // 1st list pointer
        Node temp2 = head2; // 2st list pointer
        Node dummyNode = new Node(-1); //new node which help to create a new node(creating another LL).
        // this dummyNode is required to return head of new LL
        Node current = dummyNode; // adding current pointer to dummyNode
        int carry = 0; // setting carry
        while(temp1!=null || temp2!=null){
            int sum = carry; // add carry first
            if(temp1!=null){ // check if LL1 has elements, if yes, then
                sum = sum + temp1.value;
            }
            if(temp2!= null){ // check if LL2 has elements, if yes, then
                sum = sum + temp2.value;
            }
            // after sum , add new node with 
            Node newNode = new Node(sum%10); // 
            carry = sum/10; 
            current.next = newNode; // increment the current pointer to new node
            
            // next move
            current=current.next; //
            
            // if LL1 has elements, then only move, O/W it will give error
            if (temp1 != null) {
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }
        // remaining carry will be added with new node
        if(carry!=0){
            Node newNode = new Node(carry);
            current.next = newNode;
        }

        return dummyNode.next; // return head of new LL
    }
    
}