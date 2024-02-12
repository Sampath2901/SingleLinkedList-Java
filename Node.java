package sll;

/**
 * A node is represented in this singly-linked list.
 * It keeps a reference to the next node as well as a string data value.
 */
public class Node {
    private String data;
    private Node next;
    
    /**
     * Creates a new node with Null fields and the next references.
     */
    public Node() {}
    
    /**
     * 
     * The string information to be saved in the node
     */
    public Node(String data) {
        this();
        this.data = data;
    }
    
    /**
     * Brings back the string information kept in the node.
     * 
     * also @return data present in the string
     */
    public String getData() {
        return data;
    }
    
    /**
     * sets the provided value in the string data.
     * 
     * new string information to be kept in the node
     */
    public void setData(String data) {
        this.data = data;
    }
    
    /**
     * Returns the next node's reference back.
     * 
     * Reference that @return to next node
     */
    public Node getNext() {
        return next;
    }
    
    /**
     * sets the provided node as the reference for the following node.
     * 
     * n is the reference of the next node 
     */
    public void setNext(Node n) {
        this.next = n;
    }
    
    /**
     * A data from the node represented as a string.
     * 
     * illustrating a string  the data that @return  
     */
    public String toString() {
        return data;
    }
}