//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
    static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    Solution obj = new Solution();
		    head = obj.sort(head);
		    printList(head);
		}
	}
}

// } Driver Code Ends




/*
Structure of node class is:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
   public Node reverse(Node head){
       Node curr = head;
       Node prev = null;
       
       while(curr != null){
           Node temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;
       }
       
       return prev;
   }
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        if(head == null || head.next == null){
            return head;
        }
        
        Node asc = head;
        Node desc = head.next;
        
        Node descHead = head.next;
        
        while(desc != null && desc.next != null){
            asc.next = asc.next.next;
            asc = asc.next;
            desc.next = desc.next.next;
            desc = desc.next;
        }
        
        asc.next = null;
        
        descHead = reverse(descHead);
        
        return merge(head, descHead);
   }

    public Node merge(Node l1, Node l2){
        Node dummy = new Node(0);
        Node curr = dummy;
        while(l1 != null && l2 != null){
            if(l1.data <= l2.data){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            
            curr = curr.next;
        }
        
        if(l1 != null)curr.next = l1;
        
        if(l2 != null)curr.next = l2;
        
        return dummy.next;
    }
}