package sll;

/**
*  File Name: SSL.java
*
*  Software Quality Assurance Corporation 
*  Code Review Project
*
*  (c) Copyright 2023 SQAC
*  ALL RIGHTS RESERVED
*
* Functional description: This class implements a singly-linked list
* that support insertion and deletion of nodes.
*
* Input: None.

* Output: None except error messages. 

* Supported Requirements: TBD

* Classes in this file: this class

* Related Documents: None; this file provides in-code documentation.

* Update History: 

* Error Messages:
 
* Constraints: None. 

* Assumptions: None. 
**/



public class SinglyLinkedList {
    private Node headNode;
    private int size;

    /**

    Specified current node in the list before the provided node.

    @param node the node that will be added to the list.
    @param current the node that a new node should be added before.
    @throws:  incase current node is null then it throws NullPointerException.
    */
    public void insert(Node node, Node current) {
    	// Verify head node is presents current node or not
        if (current == null) {
        	// We are going to set a new head node
            if (headNode == null) {
                // if the list is empty, make the new node the head
                headNode = node;
            } else {
                // insert the new node after the last node in the list
                Node last = headNode;
                while (last.getNext() != null) {
                    last = last.getNext();
                }
                last.setNext(node);
            }
            size++;
        } else if (current == headNode) {
            // insert the new node before the head node
            node.setNext(current);
            headNode = node;
            size++;
        } else {
            // current node is not null
            Node n = new Node();
            n.setData(current.getData());
            n.setNext(current.getNext());
            current.setData(node.getData());
            current.setNext(n);
            size++;
        }
    }

    /** Find the first node with the given value */
    public Node find(String value) {
    	// starting your search at the head node
        Node p = headNode;
        // Explore the list until you reach the very end or the node with the specified value.
        while (p != null) {
        	// Verify if the data in the current node matches the specified value.
        	 if (p.getData()!=null&&p.getData().compareTo(value) == 0) {
            	// go to the following node
                return p;
            } 
            p = p.getNext();
        }
        return null;
    }

    /** Remove the node referenced by current */
    public void remove(Node current) {
        if (current == null) {
            throw new NullPointerException("Node is null");
        }
        Node next = current.getNext();
        if (next == null) {
            return; // nothing to remove
        }
        current.setData(next.getData());
        current.setNext(next.getNext());
        size--;
    }
    // the number of nodes in the list is returned.
    public int size() {
        return size;
    }

    /** gives the linked list's string representation back.*/
    public String toString() {
        Node p = headNode;
        String r = "";
        while (p != null) {
            r += p.getData() + " ";
            p = p.getNext();
        }
        return r;
    }
    // returns the connected list's head node.
    // the connected list's head node.
    public Node head() {
        return headNode;
    }
}
